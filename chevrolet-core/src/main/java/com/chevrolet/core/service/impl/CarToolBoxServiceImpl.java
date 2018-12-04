package com.chevrolet.core.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.chevrolet.api.dto.*;
import com.chevrolet.api.dto.request.BrandListRequest;
import com.chevrolet.api.dto.request.CarModelGuidePriceRequest;
import com.chevrolet.api.dto.request.SeriesRequest;
import com.chevrolet.api.service.CarToolBoxService;
import com.chevrolet.api.support.BaseValue;
import com.chevrolet.core.ao.*;
import com.chevrolet.core.annotation.RefactorLogAdvice;
import com.chevrolet.core.enums.PrefixEnum;
import com.chevrolet.core.utils.BeanUtil;
import com.chevrolet.core.utils.ThreadPoolUtils;
import com.chevrolet.core.utils.VINUtil;
import com.chevrolet.core.wrapper.RedisWrapper;
import com.chevrolet.dal.dao.domain.*;
import com.chevrolet.dal.dao.domain.query.SeriesImageQuery;
import com.chevrolet.dal.dao.manager.SeriesImageManager;
import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.infiniti.search.service.BaseCarSearchService;
import com.subaru.common.entity.BizResult;
import com.subaru.common.entity.ErrorCodeEnum;
import com.subaru.common.enums.carcenter.DefaultInnerColorEnum;
import com.subaru.common.enums.carcenter.DefaultOuterColorEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * Created by suclogger on 2017/5/16.
 * refactor from buick api @see IDubboBrandService
 */
@Slf4j
@Component
@Service(interfaceClass = CarToolBoxService.class)
public class CarToolBoxServiceImpl implements CarToolBoxService {

    @Autowired
    private RedisWrapper redisManager;

    @Autowired
    private BrandAO brandAO;

    @Autowired
    private SeriesAO seriesAO;

    @Autowired
    private FactoryAO factoryAO;

    @Autowired
    private ModelAO modelAO;

    @Autowired
    private SeriesImageAO seriesImageAO;

    @Autowired
    private VinWhitelistAO vinWhitelistAO;

    @Autowired
    private BaseCarSearchService baseCarSearchService;

    @Autowired
    private SeriesImageManager seriesImageManager;

    private Integer cacheTtl = 300;

    private void doCache(String key, String value) {
        ThreadPoolUtils.getThreadPool().execute(() -> redisManager.put(key, value, cacheTtl));
    }

    private ModelDTO requestVINFromTppa(String vin) {
        try {
            CloseableHttpClient httpClient = HttpClients.custom().build();
            HttpPost httpPost = new HttpPost("https://tppa.fxcxt.com/api/vin/get");
            httpPost.setHeader("User-Agent", "%E4%BA%A4%E8%AD%A6%E5%8A%A9%E6%89%8B/658 CFNetwork/808.2.16 Darwin/16.3.0");
            httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded");
            httpPost.setEntity(new StringEntity(String.format("i=010B7B8AE58C091561422B68FD146CDB96C882B3&platform=2&v=%s&ver=658", vin)));
            HttpResponse httpResponse = httpClient.execute(httpPost);
            JSONObject jsonObject  =  JSONObject.parseObject(IOUtils.toString(httpResponse.getEntity().getContent()));
            if(jsonObject == null  || !StringUtils.isEmpty(jsonObject.getString("error"))) {
                return null;
            }
            JSONArray ja =  jsonObject.getJSONArray("content");
            JSONArray jasub = (JSONArray)ja.get(1);
            String year = jasub.getString(2);
            String shortModelName = jasub.getString(8);
            String guidePrice = StringUtils.isEmpty(jasub.getString(18)) ? "" : jasub.getString(18).replace("元", "");
            String outerModelName = jasub.getString(8) + " "  +jasub.getString(10);

            BizResult<Long> baseResult = baseCarSearchService.modelSearch(shortModelName, year, guidePrice);
            if(baseResult.isSuccess()) {
                ModelDO modelDO = modelAO.getById(baseResult.getData());
                if(null != modelDO) {
                    return (ModelDTO)doAssembly(ModelDTO.class, modelDO);
                }
            }
            return new ModelDTO(outerModelName, shortModelName, "",  guidePrice);
        } catch (IOException e) {
            log.error("request vin data error {}", e.getMessage());
            return null;
        }
    }

    @Override
    public BizResult<Boolean> verifyVIN(String vin) {
        if(StringUtils.isEmpty(vin) || vin.length() != 17) {
            return BizResult.create(false);
        }

        // 如果通用规则校验通过
        if(VINUtil.isVinValid(vin)) {
            return BizResult.create(true);
        }
        // 如果在白名单中
        if(vinWhitelistAO.isExistInWhitelist(vin)) {
            return BizResult.create(true);
        }

        return BizResult.create(false);
    }

    @Override
    public BizResult<Map<String, Boolean>> verifyVINBatch(List<String> vins) {

        if(CollectionUtils.isEmpty(vins)) {
            return BizResult.create(new HashMap<>());
        }

        try {
            Map<String, Boolean> result = vins.parallelStream().collect(Collectors.toMap(x -> x, x -> VINUtil.isVinValid(x) || vinWhitelistAO.isExistInWhitelist(x)));
            return BizResult.create(result);
        } catch (Exception e) {
        }
        return BizResult.create(ErrorCodeEnum.DATA_ERROR);
    }

    @Override
    public BizResult<ModelDTO> getModelByVIN(String vin) {
        if(StringUtils.isEmpty(vin) || !VINUtil.isVinValid(vin))  {
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR.getErrCode(), "不是一个有效的VIN码");
        }
        ModelDTO modelDTO = requestVINFromTppa(vin);
        if(null != modelDTO)  {
            return BizResult.create(modelDTO);
        }
        return BizResult.create(ErrorCodeEnum.NO_DATA);
    }

    @Override
    public BizResult<List<BrandDTO>> getAllBrand() {
        try {
            String brandListJson = redisManager.getString(PrefixEnum.cc_brand_list.getValue());
            if(!StringUtils.isEmpty(brandListJson)) {
                Type listType = new TypeToken<ArrayList<BrandDTO>>(){}.getType();
                List<BrandDTO> brandDTOList = new Gson().fromJson(brandListJson, listType);
                if(!CollectionUtils.isEmpty(brandDTOList)) {
                    return BizResult.create(brandDTOList);
                }
            }
            List<BrandDO> list = brandAO.getAllBrand();
            if (!CollectionUtils.isEmpty(list)) {
                doCache(PrefixEnum.cc_brand_list.getValue(), new Gson().toJson(list));
                return BizResult.create(
                        list.stream()
                                .map(brandDo -> (BrandDTO)doAssembly(BrandDTO.class, brandDo))
                                .collect(Collectors.toList()));
            } else {
                return BizResult.create(ErrorCodeEnum.NO_DATA);
            }
        } catch (Exception e) {
            log.error("error in getAllBrand", e.getMessage());
            return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
        }
    }

    private static Object doAssembly(Class targetClass, Object sourceObj) {
        return BeanUtil.copyPorp2DO(targetClass, sourceObj);
    }

    @Override
    public BizResult<List<ModelDTO>> getModelsBySeriesId(Long seriesId) {
        if(seriesId == null || seriesId < 0) {
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            String modelListJson = redisManager.getString(PrefixEnum.cc_model_by_series.getKey(seriesId));
            if(!StringUtils.isEmpty(modelListJson)) {
                Type listType = new TypeToken<ArrayList<ModelDTO>>(){}.getType();
                List<ModelDTO> modelDTOList = new Gson().fromJson(modelListJson, listType);
                if(!CollectionUtils.isEmpty(modelDTOList)) {
                    return BizResult.create(modelDTOList);
                }
            }
            List<ModelDO> list = modelAO.getModelListBySeriesId(seriesId);
            if (!CollectionUtils.isEmpty(list)) {
                doCache(PrefixEnum.cc_model_by_series.getKey(seriesId), new Gson().toJson(list));
                return BizResult.create(
                        list.stream()
                                .map(modelDO -> {
                                    //为了拓展以便兼容buick对应的接口 --2018-05-02 清禾
                                    ModelDTO modelDTO = (ModelDTO)doAssembly(ModelDTO.class, modelDO);
                                    modelDTO.setSpec(modelDO.getStandard());
                                    return modelDTO;})
                                .collect(Collectors.toList()));
            } else {
                return BizResult.create(ErrorCodeEnum.NO_DATA);
            }
        } catch (Exception e) {
            log.error("error in getModelsBySeriesId", e.getMessage());
            return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
        }
    }

    @Override
    public BizResult<List<BrandDTO>> getBrandListByIds(List<Long> ids) {
        if(CollectionUtils.isEmpty(ids)) {
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            List<BrandDO> brandDOS = brandAO.getByIds(ids);
            if(!CollectionUtils.isEmpty(brandDOS)) {

                return BizResult.create(
                        brandDOS
                                .stream()
                                .map(brandDO -> (BrandDTO)doAssembly(BrandDTO.class, brandDO))
                                .collect(Collectors.toList())
                );
            } else {
                return BizResult.create(ErrorCodeEnum.NO_DATA);
            }
        } catch (Exception e) {
            return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
        }
    }

    @Override
    @RefactorLogAdvice
    public BizResult<List<SeriesDTO>> getSeriesListByIds(List<Long> ids) {
        if(CollectionUtils.isEmpty(ids)) {
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            List<SeriesDO> seriesDOs = seriesAO.getSeriesByIds(ids);
            if(!CollectionUtils.isEmpty(seriesDOs)) {

                return BizResult.create(
                        seriesDOs
                                .stream()
                                .map(seriesDO -> (SeriesDTO)doAssembly(SeriesDTO.class, seriesDO))
                                .collect(Collectors.toList())
                );
            } else {
                return BizResult.create(ErrorCodeEnum.NO_DATA);
            }
        } catch (Exception e) {
            return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
        }
    }

    @Override
    @RefactorLogAdvice
    public BizResult<FactoryDTO> getFactoryById(Long factoryId) {
        if(factoryId == null || factoryId < 1L) {
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            FactoryDO factoryDO = factoryAO.getFactoryById(factoryId);
            return BizResult.create((FactoryDTO)doAssembly(FactoryDTO.class,factoryDO));
        } catch (Exception e) {
            return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
        }
    }

    @Override
    public BizResult<BrandDTO> getBrandByBrandId(Long brandId) {
        if(brandId == null || brandId < 1L) {
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            List<BrandDO> brandDOS = brandAO.getByIds(Arrays.asList(brandId));
            if(!CollectionUtils.isEmpty(brandDOS)) {
                return BizResult.create((BrandDTO)doAssembly(BrandDTO.class, brandDOS.get(0)));
            } else {
                return BizResult.create(ErrorCodeEnum.NO_DATA);
            }
        } catch (Exception e) {
            return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
        }
    }

    @Override
    public BizResult<List<BrandDTO>> getBrandListByStandard(Integer standard) {
        if(standard == null || standard < 0) {
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            String brandListJson = redisManager.getString(PrefixEnum.cc_brand_by_standard.getKey(standard));
            if(!StringUtils.isEmpty(brandListJson)) {
                Type listType = new TypeToken<ArrayList<BrandDTO>>(){}.getType();
                List<BrandDTO> brandDTOList = new Gson().fromJson(brandListJson, listType);
                if(!CollectionUtils.isEmpty(brandDTOList)) {
                    return BizResult.create(brandDTOList);
                }
            }
            List<BrandDO> brandDOS = brandAO.getBrandListByStandard(standard);
            if(!CollectionUtils.isEmpty(brandDOS)) {
                doCache(PrefixEnum.cc_brand_by_standard.getKey(standard), new Gson().toString());
                return BizResult.create(
                        brandDOS
                                .stream()
                                .map(brandDO -> (BrandDTO)doAssembly(BrandDTO.class, brandDO))
                                .collect(Collectors.toList())
                );
            } else {
                return BizResult.create(ErrorCodeEnum.NO_DATA);
            }
        } catch (Exception e) {
            return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
        }
    }

    @Override
    public BizResult<List<SeriesDTO>> getAllSeriesByBrandId(Long brandId) {
        if(brandId == null || brandId < 1) {
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {

            String seriesByBrandJson = redisManager.getString(PrefixEnum.cc_series_by_brand.getKey(brandId));
            if(!StringUtils.isEmpty(seriesByBrandJson)) {
                Type listType = new TypeToken<ArrayList<SeriesDTO>>(){}.getType();
                List<SeriesDTO> seriesDTOList = new Gson().fromJson(seriesByBrandJson, listType);
                if(!CollectionUtils.isEmpty(seriesDTOList)) {
                    return BizResult.create(seriesDTOList);
                }
            }
            List<SeriesDO> seriesDOS = seriesAO.getSeriesByBrandId(brandId);
            if(!CollectionUtils.isEmpty(seriesDOS)) {
                doCache(PrefixEnum.cc_series_by_brand.getKey(brandId), new Gson().toJson(seriesDOS));
                return BizResult.create(
                        seriesDOS
                                .stream()
                                .map(seriesDO -> {
                                    SeriesDTO seriesDTO = (SeriesDTO)doAssembly(SeriesDTO.class, seriesDO);
                                    //为了拓展以便兼容buick对应的接口 --2018-05-02 清禾
                                    seriesDTO.setSeriesStatus(seriesDO.getStatus());
                                    FactoryDO factoryDO = factoryAO.getFactoryById(seriesDO.getFactoryId());
                                    if (factoryDO != null) {
                                        String factoryName = factoryDO.getFactoryName();
                                        seriesDTO.setFactoryName(factoryName);
                                        seriesDTO.setFactoryId(factoryDO.getFactoryId());
                                    }
                                    return seriesDTO;})
                                .collect(Collectors.toList())
                );
            } else {
                return BizResult.create(ErrorCodeEnum.NO_DATA);
            }
        } catch (Exception e) {
            return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
        }
    }

    @Override
    public BizResult<SeriesDTO> getSeriesBySeriesId(Long seriesId) {
        if(seriesId == null || seriesId < 1) {
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            SeriesDO seriesDO = seriesAO.getById(seriesId);
            if(null != seriesDO){
                return BizResult.create((SeriesDTO)doAssembly(SeriesDTO.class, seriesDO));
            } else {
                return BizResult.create(ErrorCodeEnum.NO_DATA);
            }
        } catch (Exception e) {
            log.error("getSeriesBySeriesId error, param : {}, error :  {}", seriesId, e.getMessage());
            return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
        }
    }

    @Override
    public BizResult<List<ModelDTO>> getSellingModelsByGuidePrice(String guidePrice) {
        if(StringUtils.isEmpty(guidePrice)) {
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            List<ModelDO> list = modelAO.getModelsByGuidePrice(guidePrice, /** 在售车型 **/1);
            if (!CollectionUtils.isEmpty(list)) {
                return BizResult.create(
                        list.stream()
                                .map(modelDO -> (ModelDTO)doAssembly(ModelDTO.class, modelDO))
                                .collect(Collectors.toList()));
            } else {
                return BizResult.create(ErrorCodeEnum.NO_DATA);
            }
        } catch (Exception e) {
            log.error("getModelsByGuidePrice error, param : {}, error :  {}", guidePrice, e.getMessage());
            return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
        }
    }

    @Override
    public BizResult<List<ModelDTO>> getSellingModelsByGuidePriceWithPage(CarModelGuidePriceRequest request) {
        if(StringUtils.isEmpty(request.getGuidePrice())) {
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            List<ModelDO> list = modelAO.getModelsByGuidePriceWithPage(request);
            if (!CollectionUtils.isEmpty(list)) {
                return BizResult.create(
                        list.stream()
                                .map(modelDO -> (ModelDTO)doAssembly(ModelDTO.class, modelDO))
                                .collect(Collectors.toList()));
            } else {
                return BizResult.create(ErrorCodeEnum.NO_DATA);
            }
        } catch (Exception e) {
            log.error("getModelsByGuidePriceWithPage error, param : {}, error :  {}", request, e.getMessage());
            return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
        }
    }

    @Override
    public BizResult<ModelDTO> getModelByModelId(Long modelId) {
        if(modelId == null || modelId < 1L) {
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            ModelDO modelDO = modelAO.getById(modelId);
            if(null != modelDO) {
                //为了拓展以便兼容buick对应的接口 --2018-05-02 清禾
                ModelDTO modelDTO = (ModelDTO) doAssembly(ModelDTO.class, modelDO);
                modelDTO.setSpec(modelDO.getStandard());
                return BizResult.create(modelDTO);
            } else {
                return BizResult.create(ErrorCodeEnum.NO_DATA);
            }
        } catch (Exception e) {
            log.error("getModelByModelId error, param : {}, error :  {}", modelId, e.getMessage());
            return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
        }
    }

    @Override
    public BizResult<ModelDetailDTO> getDetailModelByModelId(Long modelId) {

        if(modelId == null || modelId < 1L) {
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            ModelDO modelDO = modelAO.getById(modelId);
            if(null != modelDO) {
                ModelDetailDTO modelDTO = (ModelDetailDTO)BeanUtil.copyPorp2DO(ModelDetailDTO.class, modelDO);
                return BizResult.create(modelDTO);
            } else {
                return BizResult.create(ErrorCodeEnum.NO_DATA);
            }
        } catch (Exception e) {
            log.error("getModelByModelId error, param : {}, error :  {}", modelId, e.getMessage());
            return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
        }
    }

    @Override
    public BizResult<ModelDetailDTO> getDetailModelByName(String modelName) {

        if(StringUtils.isEmpty(modelName)) {
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            ModelDO modelDO = modelAO.getByName(modelName);
            if(null != modelDO) {
                ModelDetailDTO modelDTO = BeanUtil.copyPorp2DO(ModelDetailDTO.class, modelDO);
                return BizResult.create(modelDTO);
            } else {
                return BizResult.create(ErrorCodeEnum.NO_DATA);
            }
        } catch (Exception e) {
            log.error("getDetailModelByName error, param : {}, error :  {}", modelName, e.getMessage());
            return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
        }
    }

    @Override
    public BizResult<List<ModelDTO>> getModelsByGuidePrice(String guidePrice) {
        if(StringUtils.isEmpty(guidePrice)) {
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            List<ModelDO> list = modelAO.getModelsByGuidePrice(guidePrice, null);
            if (!CollectionUtils.isEmpty(list)) {
                return BizResult.create(
                        list.stream()
                                .map(modelDO -> (ModelDTO)doAssembly(ModelDTO.class, modelDO))
                                .collect(Collectors.toList()));
            } else {
                return BizResult.create(ErrorCodeEnum.NO_DATA);
            }
        } catch (Exception e) {
            log.error("getModelsByGuidePrice error, param : {}, error :  {}", guidePrice, e.getMessage());
            return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
        }
    }

    @Override
    public BizResult<List<ModelDTO>> getModelsByGuidePriceWithPage(CarModelGuidePriceRequest request) {
        /*if(StringUtils.isEmpty(request.getGuidePrice())) {
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);

        }*/
        try {
            request.setStatus(1);
            List<ModelDO> list = modelAO.getModelsByGuidePriceWithPage(request);
            if (!CollectionUtils.isEmpty(list)) {
                return BizResult.create(
                        list.stream()
                                .map(modelDO -> {
                                    //为了拓展以便兼容buick对应的接口 --2018-05-02 清禾
                                    ModelDTO modelDTO = (ModelDTO)doAssembly(ModelDTO.class, modelDO);
                                    modelDTO.setSpec(modelDO.getStandard());
                                    if(modelDO.getBrandId() != null) {
                                        BrandDO brandDO = brandAO.getBrandById(modelDO.getBrandId());
                                        if(brandDO != null) {
                                            modelDTO.setBrandName(brandDO.getBrandName());
                                            modelDTO.setBrandPic(brandDO.getBrandPic());
                                        }
                                    }
                                    if(modelDO.getSeriesId() != null) {
                                        SeriesDO seriesDO = seriesAO.getById(modelDO.getSeriesId());
                                        if(seriesDO != null) {
                                            modelDTO.setSeriesName(seriesDO.getSeriesName());
                                        }
                                    }
                                    return modelDTO;
                                })
                                .collect(Collectors.toList()));
            } else {
                return BizResult.create(ErrorCodeEnum.NO_DATA);
            }
        } catch (Exception e) {
            log.error("getModelsByGuidePriceWithPage error, param : {}, error :  {}", request, e.getMessage());
            return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
        }
    }

    @Override
    public BizResult<Boolean> addModel(ModelDetailDTO modelDetailDTO) {
        try {
            if(modelDetailDTO.getModelId() != null
                    || StringUtils.isEmpty(modelDetailDTO.getModelName())) {
                return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
            }
            log.info("add model {}", modelDetailDTO);
            ModelDO modelDO = new ModelDO();
            BeanUtil.copyProperties(modelDetailDTO, modelDO);
            modelDO.setSource(3);
            return BizResult.create(modelAO.addModel(modelDO) > 0);
        } catch (Exception e) {
            log.error("add model error ,param {}, error {}", modelDetailDTO, e.getMessage());
        }
        return BizResult.create(ErrorCodeEnum.INSERT_FAIL);
    }


    @Override
    public BizResult<Boolean> addWhiteListVIN(WhiteListVINDTO whiteListVINDTO) {
        try {
            if(StringUtils.isEmpty(whiteListVINDTO.getVin())) {
                return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
            }
            log.info("add WhiteList VIN {}", whiteListVINDTO);
            VinWhitelistDO vinWhitelistDO = new VinWhitelistDO();
            BeanUtil.copyProperties(whiteListVINDTO, vinWhitelistDO);
            return BizResult.create(vinWhitelistAO.addWhitelistVIN(vinWhitelistDO));
        } catch (Exception e) {
            log.error("add model error ,param {}, error {}", whiteListVINDTO, e.getLocalizedMessage());
        }
        return BizResult.create(ErrorCodeEnum.INSERT_FAIL);
    }

    @Override
    public BizResult<Map<String,List<SeriesImageColorDTO>>> getColorsBySeriesId(Long seriesId){
        if(seriesId == null || seriesId < 0) {
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            SeriesImageQuery query = new SeriesImageQuery();
            query.or().andSeriesIdEqualTo(seriesId).andStatusEqualTo(0);
            List<SeriesImageDO> seriesImageDOS = seriesImageManager.selectByQuery(query);
            Map<String,List<SeriesImageColorDTO>> map = new ConcurrentHashMap<>();
            List<SeriesImageColorDTO> innerColors = Lists.newArrayList();
            List<SeriesImageColorDTO> outerColors = Lists.newArrayList();
            if(!CollectionUtils.isEmpty(seriesImageDOS)){
                seriesImageDOS.forEach(color -> {
                    if(color.getType() == 0){
                        //内饰
                        innerColors.add(new SeriesImageColorDTO(color.getColorId(),color.getColor()));
                    }
                    if(color.getType() == 1){
                        //外观
                        outerColors.add(new SeriesImageColorDTO(color.getColorId(),color.getColor()));
                    }
                });
            }
            if(CollectionUtils.isEmpty(innerColors)){
                map.put("innerColor",getDefaultInnerColors());
            } else {
                map.put("innerColor",innerColors);
            }
            if(CollectionUtils.isEmpty(outerColors)){
                map.put("outerColor",getDefaultOuterColors());
            } else {
                map.put("outerColor",outerColors);
            }
            return BizResult.create(map);
        } catch (Exception e){
            log.error("getColorsBySeriesId error {}", e);
        }
        return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
    }

    @Override
    public BizResult<List<SeriesImageColorDTO>> getSeriesImageBySeriesIdAndType(Long seriesId, Integer type){
        if(seriesId == null || seriesId < 0) {
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        }

        if(type == null || type < 0){
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            List<SeriesImageColorDTO> list = Lists.newArrayList();
            SeriesImageQuery query = new SeriesImageQuery();
            query.or().andSeriesIdEqualTo(seriesId).andTypeEqualTo(type).andStatusEqualTo(0);
            List<SeriesImageDO> seriesImageDOS = seriesImageManager.selectByQuery(query);
            if(!CollectionUtils.isEmpty(seriesImageDOS)){
                seriesImageDOS.forEach(color -> {
                    list.add(new SeriesImageColorDTO(color.getColorId(),color.getColor()));
                });
                return BizResult.create(list);
            }
        } catch (Exception e){
            log.error("getSeriesImageBySeriesIdAndType error {}", e);
        }
        return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
    }

    @Override
    public BizResult<SeriesImageColorDTO> getSeriesImageByColorId(Long colorId){
        if(colorId == null || colorId < 0) {
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            SeriesImageDO seriesImageDO = seriesImageManager.selectByPrimaryKey(colorId);
            if(seriesImageDO != null){
                return BizResult.create(new SeriesImageColorDTO(seriesImageDO.getColorId(),seriesImageDO.getColor()));
            }
        } catch (Exception e){
            log.error("getSeriesImageBySeriesIdAndType error {}", e);
        }
        return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
    }

    @Override
    public BizResult<List<SeriesImageColorDTO>> getSeriesImageBySeriesIdAndType(Long seriesId, Integer type, Integer standard){
        if(seriesId == null || type == null || standard == null) {
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        }

        try {
            List<SeriesImageColorDTO> list = Lists.newArrayList();
            List<SeriesImageDO> seriesImageDOS = seriesImageManager.list(seriesId,type,standard);
            if(!CollectionUtils.isEmpty(seriesImageDOS)){
                seriesImageDOS.forEach(color -> {
                    list.add(new SeriesImageColorDTO(color.getColorId(),color.getColor()));
                });
                return BizResult.create(list);
            }
        } catch (Exception e){
            log.error("getSeriesImageBySeriesIdAndType error {}", e);
        }
        return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
    }

    public List<SeriesImageColorDTO> getDefaultInnerColors() {
        List<SeriesImageColorDTO> innerColors = Lists.newArrayList();

        for (DefaultInnerColorEnum innerColor : DefaultInnerColorEnum.values()) {
            SeriesImageColorDTO bv = new SeriesImageColorDTO();
            bv.setColorId((long) innerColor.getCode());
            bv.setColorName(innerColor.getName());
            innerColors.add(bv);
        }
        return innerColors;
    }

    /**
     * 获取默认外观颜色
     * @return
     */
    public List<SeriesImageColorDTO> getDefaultOuterColors() {
        List<SeriesImageColorDTO> outerColors = Lists.newArrayList();

        for (DefaultOuterColorEnum outerColor : DefaultOuterColorEnum.values()) {
            SeriesImageColorDTO bv = new SeriesImageColorDTO();
            bv.setColorId((long) outerColor.getCode());
            bv.setColorName(outerColor.getName());
            outerColors.add(bv);
        }

        return outerColors;
    }


    //***********************以下方法是重载buick中的方法*****************************

    /**
     * 根据 车规、品牌ID、状态 获取车系
     * @param brandId
     * @param standard
     * @param status
     * @return
     */
    @Override
    public BizResult<List<SeriesDTO>> getSeriesList(Long brandId, Integer standard, Integer status) {
        BizResult<List<SeriesDTO>> result = new BizResult<>();

        if(brandId == null || standard == null) {
            result.setSuccess(false);
            result.setMessage("brandId or standard is null!");
            return result;
        }
        try {
            log.info("brandId = {}", brandId);
            log.info("standard = {}", standard);
            List<SeriesDO> seriesDOList = seriesAO.getSeriesList(brandId, standard, status);
            List<SeriesDTO> seriesDTOList = new ArrayList<>();
            if(seriesDOList != null && !seriesDOList.isEmpty()) {
                for(SeriesDO seriesDO : seriesDOList) {
                    SeriesDTO seriesDTO = convertSeriesToDTO(seriesDO);
                    seriesDTOList.add(seriesDTO);
                }
            }
            result = BizResult.create(seriesDTOList);
        }
        catch (Exception e) {
            result.setSuccess(false);
            result.setMessage("服务器出错");
            log.error("error in getSeriesList error {}", e);
        }
        return result;
    }

    /**
     * 获取有效车系
     * @param partnerId
     * @param brandId
     * @param status
     * @return
     * 注：如过所传参数都为空，则全量查询
     */
    @Override
    public BizResult<List<SeriesDTO>> getVaildSeriesList(Long partnerId, Long brandId, Integer status) {
        BizResult<List<SeriesDTO>> result = new BizResult<>();

        try {
            List<SeriesDO> seriesDOList = seriesAO.getVaildSeriesList(partnerId, brandId, status);
            List<SeriesDTO> seriesDTOList = new ArrayList<>();
            if(seriesDOList != null && !seriesDOList.isEmpty()) {
                for(SeriesDO seriesDO : seriesDOList) {
                    SeriesDTO seriesDTO = convertSeriesToDTO(seriesDO);
                    seriesDTOList.add(seriesDTO);
                }
            }
            result = BizResult.create(seriesDTOList);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage("服务器出错");
            log.error("error in getVaildSeriesList error {}", e);
        }
        return result;
    }

    /**
     * 根据品牌查询有车的车系
     * @param brandId
     * @return
     */
    @Override
    public BizResult<List<SeriesDTO>> getHasCarSeriesByBrandId(Long brandId) {
        BizResult<List<SeriesDTO>> result = new BizResult<>();
        if(brandId == null) {
            result.setSuccess(false);
            result.setMessage("brandId is null");
            return result;
        }
        try {
            List<SeriesDO> seriesDOList = seriesAO.getHasCarSeriesByBrandId(brandId);
            List<SeriesDTO> seriesDTOList = new ArrayList<>();
            if(seriesDOList != null && !seriesDOList.isEmpty()) {
                for(SeriesDO seriesDO : seriesDOList) {
                    SeriesDTO seriesDTO = convertSeriesToDTO(seriesDO);
                    seriesDTO.setSeriesStatus(seriesDO.getStatus());
                    seriesDTOList.add(seriesDTO);
                }
            }
            result = BizResult.create(seriesDTOList);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage("服务器出错");
            log.error("error in getHasCarSeriesByBrandId. ", e);
        }

        return result;
    }


    /**
     * 获取有车源的品牌
     * @return
     */
    @Override
    public BizResult<List<BrandDTO>> getAllBrandWithCars() {
        BizResult<List<BrandDTO>> result = new BizResult<>();
        try {
            List<BrandDO> brandDOList = brandAO.getAllBrandWithCars();
            List<BrandDTO> brandDTOList = new ArrayList<>();
            if(brandDOList != null && !brandDOList.isEmpty()) {
                for(BrandDO brandDO : brandDOList) {
                    BrandDTO brandDTO = convertBrandToDTO(brandDO);
                    brandDTOList.add(brandDTO);
                }
            }
            result = BizResult.create(brandDTOList);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage("服务器出错");
            log.error("error in getAllBrandWithCars. ", e);
        }
        return result;
    }

    @Override
    public BizResult<List<ModelDTO>> getModelList(Long seriesId, Integer standard, Integer status) {
        BizResult<List<ModelDTO>> result = new BizResult<>();
        if(seriesId == null || standard == null) {
            result.setSuccess(false);
            result.setMessage("seriesId or standard is null");
            return result;
        }
        try {

            List<ModelDO> modelDOList = modelAO.getModelList(seriesId, standard, status);
            List<ModelDTO> modelDTOList = new ArrayList<>();
            if(modelDOList != null && !modelDOList.isEmpty()) {
                for(ModelDO modelDO : modelDOList) {
                    ModelDTO modelDTO = new ModelDTO();
                    modelDTO.setModelId(modelDO.getModelId());
                    modelDTO.setModelName(modelDO.getModelName());
                    modelDTO.setSeriesId(modelDO.getSeriesId());
                    modelDTO.setBrandId(modelDO.getBrandId());
                    modelDTO.setGuidePrice(modelDO.getGuidePrice());
                    modelDTO.setSpec(modelDO.getStandard());
                    modelDTOList.add(modelDTO);
                }
            }

            result = BizResult.create(modelDTOList);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage("服务器出错");
            log.error("error in getModelList. ", e);
        }

        return result;
    }

    @Override
    public BizResult<List<BrandDTO>> getRecentBrandList(Long partnerId, Integer standard) {
        BizResult<List<BrandDTO>> result = new BizResult<>();
        if(partnerId == null || standard == null) {
            result.setSuccess(false);
            result.setMessage("partnerId or standard is null");
            return result;
        }
        try {
            List<BrandDO> brandDOList = brandAO.getRecentBrandList(partnerId, standard);
            List<BrandDTO> brandDTOList = new ArrayList<>();
            if(brandDOList != null && !brandDOList.isEmpty()) {
                for(BrandDO brandDO : brandDOList) {
                    BrandDTO brandDTO = convertBrandToDTO(brandDO);
                    brandDTOList.add(brandDTO);
                }
            }
            result = BizResult.create(brandDTOList);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage("服务器出错");
            log.error("error in getRecentBrandList. ", e);
        }
        return result;
    }

    @Override
    public BizResult<List<BrandDTO>> getVaildBrandListForAdminWithUserId(BrandListRequest brandListForm) {
        BizResult<List<BrandDTO>> result = new BizResult<>();
        if(brandListForm == null || brandListForm.getPartnerId() == null || brandListForm.getUserId() == null) {
            result.setSuccess(false);
            result.setMessage("brandListForm or brandListForm.getPartnerId() or brandListForm.getUserId() is null");
            return result;
        }
        try {
            List<BrandDO> brandDOList = brandAO.getVaildBrandListForAdmin(brandListForm);
            List<BrandDTO> brandDTOList = new ArrayList<>();
            if(brandDOList != null && !brandDOList.isEmpty()) {
                for(BrandDO brandDO : brandDOList) {
                    BrandDTO brandDTO = convertBrandToDTO(brandDO);
                    brandDTOList.add(brandDTO);
                }
            }
            result = BizResult.create(brandDTOList);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage("服务器出错");
            log.error("error in getVaildBrandListForAdminWithUserId. ", e);
        }
        return result;
    }

    /**
     *
     * @param partnerId
     * @param status
     * @param userId
     * @param brandIds
     * @return
     * 注：如果传入参数为空不会报错，会筛选出所有未逻辑删除的数据
     */
    @Override
    public BizResult<List<BrandDTO>> getVaildBrandListForUser(Long partnerId, Integer status, Long userId, List<Long> brandIds) {
        BizResult<List<BrandDTO>> result = new BizResult<>();
        try {
            List<BrandDO> brandDOList = brandAO.getVaildBrandListForUser(partnerId, status, userId, brandIds);
            List<BrandDTO> brandDTOList = new ArrayList<>();
            if(brandDOList != null && !brandDOList.isEmpty()) {
                for(BrandDO brandDO : brandDOList) {
                    BrandDTO brandDTO = convertBrandToDTO(brandDO);
                    brandDTOList.add(brandDTO);
                }
            }
            result = BizResult.create(brandDTOList);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage("服务器出错");
            log.error("error in getVaildBrandListForUser. ", e);
        }
        return result;
    }

    /**
     *
     * @param partnerId
     * @param userId
     * @param brandId
     * @param status
     * @return
     * 注：如果传入参数为空不会报错，会筛选出所有未逻辑删除的数据
     */
    @Override
    public BizResult<List<SeriesDTO>> getVaildSeriesListForUser(Long partnerId, Long userId, Long brandId, Integer status) {
        BizResult<List<SeriesDTO>> result = new BizResult<>();
        try {
            List<SeriesDO> seriesDOList = seriesAO.getVaildSeriesList(partnerId, userId, brandId, status);
            List<SeriesDTO> seriesDTOList = new ArrayList<>();
            if(seriesDOList != null && !seriesDOList.isEmpty()) {
                for(SeriesDO seriesDO : seriesDOList) {
                    SeriesDTO seriesDTO = convertSeriesToDTO(seriesDO);
                    seriesDTOList.add(seriesDTO);
                }
            }
            result.setSuccess(true);
            result.setData(seriesDTOList);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage("服务器出错");
            log.error("error in getVaildSeriesListForUser. ", e);
        }
        return result;
    }

    @Override
    public BizResult<List<BrandDTO>> getSecKillProductHotBrandListByName(List<String> brandNameList) {
        BizResult<List<BrandDTO>> result = new BizResult<>();
        if(brandNameList == null || brandNameList.isEmpty()) {
            result.setSuccess(false);
            result.setMessage("brandNameList is null");
            return result;
        }
        try {
            List<BrandDO> brandDOList = brandAO.getBrandByNames(brandNameList);
            List<BrandDTO> brandDTOList = new ArrayList<>();
            if(brandDOList != null && !brandDOList.isEmpty()) {
                for(BrandDO brandDO : brandDOList) {
                    BrandDTO brandDTO = new BrandDTO();
                    brandDTO.setBrandId(brandDO.getBrandId());
                    brandDTO.setBrandName(brandDO.getBrandName());
                    brandDTO.setSmallPic(brandDO.getSmallPic());
                    brandDTOList.add(brandDTO);
                }
            }
            result = BizResult.create(brandDTOList);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage("服务器出错");
            log.error("error in getSecKillProductHotBrandListByName. ", e);
        }
        return result;
    }

    @Override
    public BizResult<List<ModelDTO>> getModelsByGuidePriceAndStatusWithPage(CarModelGuidePriceRequest request) {

        BizResult<List<ModelDTO>> bizResult = new BizResult<>();
        if(request == null || StringUtils.isBlank(request.getGuidePrice())) {
            bizResult.setSuccess(false);
            bizResult.setMessage("request is null or request.getGuidePrice() is blank!");
            return bizResult;
        }

        try {

            request.setStatus(null);
            List<ModelDO> modelDOList = modelAO.getModelsByGuidePriceWithPage(request);
            if (modelDOList != null && !modelDOList.isEmpty()) {
                Set<Long> seriesIds = Sets.newHashSet(Iterables.transform(modelDOList, new Function<ModelDO, Long>() {
                    @Override
                    public Long apply(ModelDO model) {
                        return model.getSeriesId();
                    }
                }));
                Set<Long> brandIds = Sets.newHashSet(Iterables.transform(modelDOList, new Function<ModelDO, Long>() {
                    @Override
                    public Long apply(ModelDO model) {
                        return model.getBrandId();
                    }
                }));
                List<SeriesDO> seriesList = seriesAO.getSeriesByIds(Lists.newArrayList(seriesIds));
                Map<Long, SeriesDO> seriesMap = Maps.newHashMap();
                if(seriesList != null && !seriesList.isEmpty()) {
                    for (SeriesDO series : seriesList) {
                        seriesMap.put(series.getSeriesId(), series);
                    }
                }
                List<BrandDO> brandList = brandAO.getBrandByIds(Lists.newArrayList(brandIds));
                Map<Long, BrandDO> brandMap = Maps.newHashMap();
                if(brandList != null && !brandList.isEmpty()) {
                    for (BrandDO brand : brandList) {
                        brandMap.put(brand.getBrandId(), brand);
                    }
                }
                List<ModelDTO> result = Lists.newArrayList();
                for (ModelDO modelDO : modelDOList) {
                    ModelDTO modelDTO = new ModelDTO();
                    if (modelDO.getBrandId() != null) {
                        if (brandMap.get(modelDO.getBrandId()) != null) {
                            modelDTO.setBrandName(brandMap.get(modelDO.getBrandId()).getBrandName());
                            modelDTO.setBrandPic(brandMap.get(modelDO.getBrandId()).getBrandPic());
                        } else {
                            log.warn("Query brand fail. BrandId is {}.", modelDO.getBrandId());
                        }
                    }
                    if (modelDO.getSeriesId() != null) {
                        if (seriesMap.get(modelDO.getSeriesId()) != null) {
                            modelDTO.setSeriesName(seriesMap.get(modelDO.getSeriesId()).getSeriesName());
                        } else {
                            log.warn("Query series fail. SeriesId is {}.", modelDO.getSeriesId());
                        }
                    }
                    convertModelToDTO(modelDO, modelDTO);
                    modelDTO.setStatus(modelDO.getStatus());
                    result.add(modelDTO);
                }
                return BizResult.create(result);
            } else {
                return BizResult.create(ErrorCodeEnum.NO_DATA);
            }

        } catch (Exception e) {
            log.error("Error exists. Guideprice is {}.", request.getGuidePrice(), e);
            return BizResult.create(ErrorCodeEnum.EXCEPTION);
        }
    }

    @Override
    public BizResult<List<BrandDTO>> getBrandListWithSeries(Integer standard) {
        BizResult<List<BrandDTO>> result = new BizResult<>();
        if(standard == null) {
            result.setSuccess(false);
            result.setMessage("standard is null");
            return result;
        }
        try {
            List<BrandDO> brandDOList = brandAO.getBrandListWithSeries(standard);
            List<BrandDTO> brandDTOList = new ArrayList<>();
            if(brandDOList != null && !brandDOList.isEmpty()) {
                for(BrandDO brandDO : brandDOList) {
                    BrandDTO brandDTO = convertBrandToDTO(brandDO);
                    brandDTOList.add(brandDTO);
                }
            }
            result = BizResult.create(brandDTOList);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage("服务器出错");
            log.error("error in getVaildBrandListForAdminWithUserId. ", e);
        }
        return result;
    }

    /**
     * 注：如果传入参数为空不会报错，会筛选出所有数据
     * @param form
     * @return
     */
    @Override
    public BizResult<List<SeriesDTO>> getVaildSeriesListForAdmin(SeriesRequest form) {
        BizResult<List<SeriesDTO>> result = new BizResult<>();
        try {
            List<SeriesDO> seriesDOList = seriesAO.getVaildSeriesListForAdmin(form);
            List<SeriesDTO> seriesDTOList = new ArrayList<>();
            if(seriesDOList != null && !seriesDOList.isEmpty()) {
                for(SeriesDO seriesDO : seriesDOList) {
                    SeriesDTO seriesDTO = convertSeriesToDTO(seriesDO);
                    seriesDTOList.add(seriesDTO);
                }
            }
            result = BizResult.create(seriesDTOList);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage("服务器出错");
            log.error("error in getVaildBrandListForAdminWithUserId. ", e);
        }
        return result;
    }

    @Override
    public BizResult<Map<String, List<BaseValue>>> getTrimAndFacade(long seriesId) {
        Map<String, List<BaseValue>> resultMap = Maps.newHashMap();
        try {
            resultMap.put("trim", transSeriesImages2BVs(seriesImageAO.getSeriesImageBySeriesIdAndType(seriesId, 0), seriesId));
            resultMap.put("facade", transSeriesImages2BVs(seriesImageAO.getSeriesImageBySeriesIdAndType(seriesId, 1), seriesId));
            return BizResult.create(resultMap);
        } catch (Exception e) {
            log.error("Query seriesImage error.\nSeriesId is " + seriesId, e);
            return BizResult.create(ErrorCodeEnum.EXCEPTION);
        }
    }

    @Override
    public BizResult<List<BrandDTO>> getAllValidSeriesBrand() {
        BizResult<List<BrandDTO>> result = new BizResult<>();
        try{
            List<BrandDTO> brandDTOList = new ArrayList<>();
            List<BrandDO> brandDOList = brandAO.getAllBrand();
            if (!CollectionUtils.isEmpty(brandDOList)) {
                for(BrandDO brandDO : brandDOList) {
                    List<SeriesDO> seriesDOList = seriesAO.getSeriesByBrandId(brandDO.getBrandId());
                    if(!seriesDOList.isEmpty()) {
                        BrandDTO brandDTO = (BrandDTO)doAssembly(BrandDTO.class, brandDO);
                        brandDTO.setSmallPic(brandDO.getBrandPic());
                        brandDTOList.add(brandDTO);
                    }
                }
            }
            return BizResult.create(brandDTOList);
        } catch (Exception e) {
            log.error("error in getAllValidSeriesBrand. ", e);
            return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
        }
    }

    @Override
    public BizResult<SeriesDTO> getSeriesHasBrandBySeriesId(Long seriesId) {
        BizResult<SeriesDTO> result = new BizResult<>();
        if(seriesId == null) {
            result.setSuccess(false);
            result.setMessage("seriesId is null");
            return result;
        }
        try {
            SeriesDO seriesDO = seriesAO.getById(seriesId);
            if(null != seriesDO){

                SeriesDTO seriesDTO = (SeriesDTO)doAssembly(SeriesDTO.class, seriesDO);
                BrandDO brandDO = brandAO.getBrandById(seriesDO.getBrandId());
                if(null == brandDO) {
                    return BizResult.create(ErrorCodeEnum.NO_DATA);
                }
                seriesDTO.setBrandName(brandDO.getBrandName());
                return BizResult.create(seriesDTO);
            }
            else {
                return BizResult.create(ErrorCodeEnum.NO_DATA);
            }
        } catch (Exception e) {
            log.error("error in getSeriesHasBrandBySeriesId. ", e);
            return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
        }
    }

    @Override
    public BizResult<List<ModelDTO>> getModelsByGuidePriceByStatus(String guidePrice) {
        if(StringUtils.isEmpty(guidePrice)) {
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            List<ModelDO> list = modelAO.getModelsByGuidePrice(guidePrice, 1);
            if (!CollectionUtils.isEmpty(list)) {
                return BizResult.create(
                        list.stream()
                                .map(modelDO -> {
                                    //为了拓展以便兼容buick对应的接口 --2018-05-02 清禾
                                    ModelDTO modelDTO = (ModelDTO)doAssembly(ModelDTO.class, modelDO);
                                    modelDTO.setSpec(modelDO.getStandard());
                                    if(modelDO.getBrandId() != null) {
                                        BrandDO brandDO = brandAO.getBrandById(modelDO.getBrandId());
                                        if(brandDO != null) {
                                            modelDTO.setBrandName(brandDO.getBrandName());
                                            modelDTO.setBrandPic(brandDO.getBrandPic());
                                        }
                                    }
                                    if(modelDO.getSeriesId() != null) {
                                        SeriesDO seriesDO = seriesAO.getById(modelDO.getSeriesId());
                                        if(seriesDO != null) {
                                            modelDTO.setSeriesName(seriesDO.getSeriesName());
                                        }
                                    }
                                    return modelDTO;
                                })
                                .collect(Collectors.toList()));
            } else {
                return BizResult.create(ErrorCodeEnum.NO_DATA);
            }
        } catch (Exception e) {
            log.error("getModelsByGuidePrice error, param : {}, error :  {}", guidePrice, e.getMessage());
            return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
        }
    }


    /**
     * 工具方法，将SeriesDO转为SeriesDTO
     * @param seriesDO
     * @return
     */
    private SeriesDTO convertSeriesToDTO(SeriesDO seriesDO) {

        SeriesDTO seriesDTO = new SeriesDTO();
        seriesDTO.setBrandId(seriesDO.getBrandId());
        seriesDTO.setSeriesId(seriesDO.getSeriesId());
        seriesDTO.setSeriesName(seriesDO.getSeriesName());
        FactoryDO factoryDO = factoryAO.getFactoryById(seriesDO.getFactoryId());
        if(null != factoryDO) {
            seriesDTO.setFactoryId(factoryDO.getFactoryId());
            seriesDTO.setFactoryName(factoryDO.getFactoryName());
        }
        return seriesDTO;
    }

    /**
     * 工具方法，将ModelDO转为ModelDTO
     * @param modelDO
     */
    private void convertModelToDTO(ModelDO modelDO, ModelDTO modelDTO) {
        modelDTO.setModelId(modelDO.getModelId());
        modelDTO.setModelName(modelDO.getModelName());
        modelDTO.setBrandId(modelDO.getBrandId());
        modelDTO.setSeriesId(modelDO.getSeriesId());
        modelDTO.setSpec(modelDO.getStandard());
        modelDTO.setGuidePrice(modelDO.getGuidePrice());
    }

    /**
     * 工具方法，将BrandDO转为BrandDTO
     * @param brandDO
     * @return
     */
    private BrandDTO convertBrandToDTO(BrandDO brandDO) {
        BrandDTO brandDTO = new BrandDTO();
        brandDTO.setBrandId(brandDO.getBrandId());
        brandDTO.setBrandName(brandDO.getBrandName());
        brandDTO.setBrandPic(brandDO.getBrandPic());
        brandDTO.setBrandLetter(brandDO.getBrandLetter());
        return brandDTO;
    }

    private static List<BaseValue> transSeriesImages2BVs(List<SeriesImageDO> seriesImages, long seriesId) {
        List<BaseValue> bvs = Lists.newArrayList();
        if (!seriesImages.isEmpty()) {
            for (SeriesImageDO seriesImage : seriesImages) {
                BaseValue bv = new BaseValue();
                bv.setValueId(seriesImage.getColorId());
                bv.setValueData(seriesImage.getColor());
                bvs.add(bv);
            }
        } else {
            log.warn("No access seriesImage.\nSeriesId is " + seriesId);
        }
        return bvs;
    }
}


