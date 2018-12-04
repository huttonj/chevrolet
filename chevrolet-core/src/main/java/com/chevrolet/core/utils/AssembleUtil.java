package com.chevrolet.core.utils;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.fastjson.JSON;
import com.chevrolet.api.dto.BaseCarDTO;
import com.chevrolet.api.dto.CarLoanOrderDetailDTO;
import com.chevrolet.core.ao.BrandAO;
import com.chevrolet.core.ao.CarAO;
import com.chevrolet.core.ao.ModelAO;
import com.chevrolet.core.ao.SeriesAO;
import com.chevrolet.core.enums.CarStandardEnum;
import com.chevrolet.dal.dao.domain.CarDO;
import com.chevrolet.dal.dao.domain.CarLoanDO;
import com.chevrolet.dal.dao.domain.DaasOnlinePriceDO;
import com.chevrolet.dal.dao.domain.DaasSalesDO;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@Component
public class AssembleUtil {
    @Autowired
    private BrandAO brandAO;
    @Autowired
    private SeriesAO seriesAO;
    @Autowired
    private ModelAO modelAO;
    @Autowired
    private CarAO carAO;

    public static final String DELIMITER = ",";

    public CarDO assembleCarDO(CarLoanOrderDetailDTO carLoanOrderDetailDTO){
        try {
            CarDO carDO = (CarDO)BeanUtil.copyPorp2DO(CarDO.class, carLoanOrderDetailDTO);
            carDO = suppleCarDOField(carDO);
            if(CollectionUtils.isNotEmpty(carLoanOrderDetailDTO.getImgDamage())) {
                carDO.setImgDamage(StringUtils.join(carLoanOrderDetailDTO.getImgDamage(), ","));
            }
            return carDO;
        } catch (Exception e){
            log.info("用carLoanOrderDetailDTO 装配 carDO时报错：carLoanOrderDetailDTO = {} e={}", JSON.toJSONString(carLoanOrderDetailDTO), e);
        }
        return new CarDO();
    }

    public CarDO assembleCarDO(BaseCarDTO baseCarDTO){
        try {
            CarDO carDO = (CarDO)BeanUtil.copyPorp2DO(CarDO.class, baseCarDTO);
            carDO = suppleCarDOField(carDO);
            if(CollectionUtils.isNotEmpty(baseCarDTO.getImgDamage())) {
                carDO.setImgDamage(StringUtils.join(baseCarDTO.getImgDamage(), ","));
            }
            return carDO;
        } catch (Exception e){
            log.info("用baseCarDTO 装配 carDO时报错：carLoanOrderDetailDTO = {} e={}", JSON.toJSONString(baseCarDTO), e);
        }
        return new CarDO();
    }


    public CarLoanDO assembleCarLoanDO(CarLoanOrderDetailDTO carLoanOrderDetailDTO){
        try {
            CarLoanDO carLoanDO = (CarLoanDO)BeanUtil.copyPorp2DO(CarLoanDO.class, carLoanOrderDetailDTO);
            if (CollectionUtils.isNotEmpty(carLoanOrderDetailDTO.getImgFormality())) {
                carLoanDO.setImgFormality(StringUtils.join(carLoanOrderDetailDTO.getImgFormality(), DELIMITER));
            }
            return carLoanDO;
        } catch (Exception e){
            log.info("用carLoanOrderDetailDTO 装配 carLoanDO时报错：carLoanOrderDetailDTO = {} e={}", JSON.toJSONString(carLoanOrderDetailDTO), e);
        }
        return new CarLoanDO();
    }

//    public DaasOnlinePriceDO assembleDaasOnlinePriceDO(CarOnlinePriceDTO carOnlinePriceDTO){
//        try {
//            DaasOnlinePriceDO daasOnlinePriceDO = (DaasOnlinePriceDO)BeanUtil.copyPorp2DO(DaasOnlinePriceDO.class, carOnlinePriceDTO);
//            if (StringUtils.isNotBlank(carOnlinePriceDTO.getWeekName())) {
//                //2017年1月第一周
//                //转化为年 月 周
//                String weekDesc = carOnlinePriceDTO.getWeekName();
//                Integer year = Integer.valueOf(weekDesc.substring(0,weekDesc.indexOf("年")));
//                Integer month = Integer.valueOf(weekDesc.substring(weekDesc.indexOf("年")+1, weekDesc.indexOf("月")));
//                Integer week = getWeekInt(weekDesc.substring(weekDesc.indexOf("第")+1, weekDesc.indexOf("周")));
//                daasOnlinePriceDO.setDataYear(year);
//                daasOnlinePriceDO.setDataMonth(month);
//                daasOnlinePriceDO.setDataWeek(week);
//            }
//            return daasOnlinePriceDO;
//        } catch (Exception e){
//            log.info("carOnlinePriceDTO 装配 DaasOnlinePriceDO：carOnlinePriceDTO = {} e={}", JSON.toJSONString(carOnlinePriceDTO), e);
//        }
//        return new DaasOnlinePriceDO();
//    }
//
//    public DaasSalesDO assembleDaasSalesDO(CarSalesDTO carSalesDTO){
//        try {
//            DaasSalesDO daasSalesDO = (DaasSalesDO)BeanUtil.copyPorp2DO(DaasSalesDO.class, carSalesDTO);
//            if (StringUtils.isNotBlank(carSalesDTO.getMonth())) {
//                String monthDesc = carSalesDTO.getMonth();
//                //2016年8月
//                //转化为年 月
//                Integer year = Integer.valueOf(monthDesc.substring(0,monthDesc.indexOf("年")));
//                Integer month = Integer.valueOf(monthDesc.substring(monthDesc.indexOf("年")+1, monthDesc.indexOf("月")));
//                daasSalesDO.setDataYear(year);
//                daasSalesDO.setDataMonth(month);
//            }
//            return daasSalesDO;
//        } catch (Exception e){
//            log.info("CarSalesDTO 装配 DaasSalesDO：carSalesDTO = {} e={}", JSON.toJSONString(carSalesDTO), e);
//        }
//        return new DaasSalesDO();
//    }

//    private Integer getWeekInt(String weekName){
//        switch(weekName) {
//            case "一":
//                return 1;
//            case "二":
//                return 2;
//            case "三":
//                return 3;
//            case "四":
//                return 4;
//            case "五":
//                return 5;
//            default:
//                return 0;
//        }
//    }

    public List<CarLoanOrderDetailDTO> assemblyCarLoanOrderDetailDTOs(List<CarLoanDO> carLoanDOs) {
        if (CollectionUtils.isEmpty(carLoanDOs)) {
            return new ArrayList<>();
        }
        List<CarLoanOrderDetailDTO> detailDTOs = Lists.newArrayList();
        Map<Long, List<CarLoanDO>> carId2CarLoansMap = CollectionUtil.groupList2Map(carLoanDOs,carLoanDO -> carLoanDO.getCarId());
        List<CarDO> carDOS = carAO.getAllCarsByIds(new ArrayList<>(carId2CarLoansMap.keySet()));
        carDOS.forEach(carDO -> {
            List<CarLoanDO> carLoanTemps = carId2CarLoansMap.get(carDO.getCarId());
            if (CollectionUtils.isNotEmpty(carLoanTemps)) {
                for (CarLoanDO carLoanTemp : carLoanTemps) {
                    CarLoanOrderDetailDTO detailDTO = new CarLoanOrderDetailDTO();
                    BeanUtil.copyProperties(carDO, detailDTO);
                    if (com.alibaba.dubbo.common.utils.StringUtils.isNotEmpty(carDO.getImgDamage())) {
                        detailDTO.setImgDamage(Arrays.asList(carDO.getImgDamage().split(",")));
                    }
                    BeanUtil.copyProperties(carLoanTemp, detailDTO);
                    if (com.alibaba.dubbo.common.utils.StringUtils.isNotEmpty(carLoanTemp.getImgFormality())) {
                        detailDTO.setImgFormality(Arrays.asList(carLoanTemp.getImgFormality().split(",")));
                    }
                    detailDTOs.add(detailDTO);
                }
            }
        });
        return detailDTOs.stream().sorted(Comparator.comparing(CarLoanOrderDetailDTO::getCarLoanOrderNo)).collect(Collectors.toList());
    }



    private CarDO suppleCarDOField(CarDO carDO){
        if(carDO == null){
            return new CarDO();
        }
        if(StringUtils.isEmpty(carDO.getSpecName()) && carDO.getSpecId() != null ) {
            carDO.setSpecName(CarStandardEnum.getDescByStatus(carDO.getSpecId() + ""));
        }
        if(StringUtils.isEmpty(carDO.getBrandName()) && carDO.getBrandId() != null ) {
            carDO.setBrandName(brandAO.getBrandNameById(carDO.getBrandId()));
        }
        if(StringUtils.isEmpty(carDO.getSeriesName()) && carDO.getSeriesId() != null) {
            carDO.setSeriesName(seriesAO.getSeriesNameById(carDO.getSeriesId()));
        }
        if(StringUtils.isEmpty(carDO.getModelName()) && carDO.getModelId() != null) {
            carDO.setModelName(modelAO.getModelNameById(carDO.getModelId()));
        }
        if(StringUtils.isEmpty(carDO.getGuidePrice()) && carDO.getModelId() != null) {
            carDO.setGuidePrice(modelAO.getGuidePriceById(carDO.getModelId()));
        }
        return carDO;
    }
}
