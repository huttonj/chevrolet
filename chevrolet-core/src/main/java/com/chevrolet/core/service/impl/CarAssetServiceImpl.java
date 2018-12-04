package com.chevrolet.core.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.chevrolet.api.dto.*;
import com.chevrolet.api.enums.AssetRightDefaultEnum;
import com.chevrolet.api.enums.AssetRightTypeEnum;
import com.chevrolet.api.service.CarAssetService;
import com.chevrolet.core.ao.CarAO;
import com.chevrolet.core.ao.CarAssetAO;
import com.chevrolet.core.utils.BeanUtil;
import com.subaru.common.entity.BizResult;
import com.subaru.common.entity.ErrorCodeEnum;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author maihe
 */
@Data
@Slf4j
@Component
@Service(interfaceClass = CarAssetService.class)
public class CarAssetServiceImpl implements CarAssetService {

    @Autowired
    private CarAssetAO carAssetAO;
    @Autowired
    private CarAO carAO;

    @Override
    public BizResult<Boolean> transferAsset(TransferAssetDTO transferAssetDTO) {
        try {
            log.info("CarAssetService transferAsset transferAssetDTO ={}",JSON.toJSONString(transferAssetDTO));
            List<Long> carIds = transferAssetDTO.getCarIds();
            Long assetRight = transferAssetDTO.getAssetRight();
            Integer assetRightType = transferAssetDTO.getAssetRightType().getCode();
            Long oAssetRight = transferAssetDTO.getOldAssetRight();
            Integer oAssetRightType= transferAssetDTO.getAssetRightType().getCode();
            if (BeanUtil.paramNotNull(carIds,assetRight,assetRightType,oAssetRight,oAssetRightType)){
                int count = carAssetAO.transferAsset(transferAssetDTO);
                if(count == 0) {
                    return BizResult.create(ErrorCodeEnum.UPDATE_FAIL);
                }
                return BizResult.create(true);
            }
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        } catch (Exception e) {
            log.error("CarAssetService transferAsset e={}", e);
        }
        return BizResult.create(ErrorCodeEnum.DATA_ERROR);
    }

    @Override
    public BizResult<Map<Long,List<CarAssetChgLogDTO>>> queryAssetTransferLog(TransferAssetDTO transferAssetDTO){
        try {
            log.info("CarAssetService assetTransferLog transferAssetDTO ={}",JSON.toJSONString(transferAssetDTO));
            if (transferAssetDTO == null || CollectionUtils.isEmpty(transferAssetDTO.getCarIds())){
                return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
            }
            return BizResult.create(carAssetAO.queryAssetTransferLog(transferAssetDTO.getCarIds()));
        } catch (Exception e) {
            log.error("CarAssetService assetTransferLog e={}", e);
        }
        return BizResult.create(ErrorCodeEnum.DATA_ERROR);
    }

    @Override
    public BizResult<Boolean> releaseAssetRight(TransferAssetDTO transferAssetDTO) {
        try {
            log.info("CarAssetService releaseAssetRight transferAssetDTO ={}",JSON.toJSONString(transferAssetDTO));
            List<Long> carIds = transferAssetDTO.getCarIds();
            Long oAssetRight = transferAssetDTO.getOldAssetRight();
            Integer oAssetRightType= transferAssetDTO.getAssetRightType().getCode();
            if (BeanUtil.paramNotNull(carIds,oAssetRight,oAssetRightType)){
                transferAssetDTO.setAssetRight(AssetRightDefaultEnum.DEFAULT_ASSET_RIGHT.getCode());
                transferAssetDTO.setAssetRightType(AssetRightTypeEnum.DEFAULT);
                int count = carAssetAO.transferAsset(transferAssetDTO);
                if(count == 0) {
                    return BizResult.create(ErrorCodeEnum.NO_DATA);
                }
                return BizResult.create(true);
            }
            return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
        } catch (Exception e) {
            log.error("CarAssetService releaseAssetRight e={}", e);
        }
        return BizResult.create(ErrorCodeEnum.DATA_ERROR);
    }

    @Override
    public BizResult<Long> applyAssetRightChg(AssetRightChgApplyDTO assetRightChgApplyDTO) {
        try {
            log.info("CarAssetService applyAssetRightChg assetRightChgApplyDTO={}",JSON.toJSONString(assetRightChgApplyDTO));
            //防止carIds有重复
            if(assetRightChgApplyDTO != null && !CollectionUtils.isEmpty(assetRightChgApplyDTO.getCarIds())){
                List<Long> carIds = assetRightChgApplyDTO.getCarIds();
                assetRightChgApplyDTO.setCarIds(carIds.stream().distinct().collect(Collectors.toList()));
            }
            Long inserted = carAssetAO.applyAssetRightChg(assetRightChgApplyDTO);
            if(inserted > 0){
                return BizResult.create(inserted);
            }
        } catch (Exception e){
            log.error("CarAssetService applyAssetRightChg e={}", e);
        }
        return BizResult.create(ErrorCodeEnum.INSERT_FAIL);
    }

    @Override
    public BizResult<Boolean> signChgRecord(AssetRightChgDTO assetRightChgDTO) {
        try {
            log.info("CarAssetService signChgRecord assetRightChgDTO={}",JSON.toJSONString(assetRightChgDTO));
            if(assetRightChgDTO.getContractId() == null){
                log.info("signChgRecord 签约时合同id为空 assetRightChgDTO={}", JSON.toJSONString(assetRightChgDTO));
                return BizResult.create("","合同id不能为空");
            }
            Integer signed = carAssetAO.signChgRecord(assetRightChgDTO);
            if(signed > 0){
                return BizResult.create(true);
            }
            return BizResult.create(false);
        } catch (Exception e){
            log.error("CarAssetService signChgRecord e={}", e);
        }
        return BizResult.create(ErrorCodeEnum.UPDATE_FAIL);
    }

    @Override
    public BizResult<Boolean> confirmChgRecord(AssetRightChgDTO assetRightChgDTO) {
        try {
            log.info("CarAssetService confirmChgRecord assetRightChgDTO={}", JSON.toJSONString(assetRightChgDTO));
            Integer confirmed = carAssetAO.confirmChgRecord(assetRightChgDTO);
            //已经可以确定物权人，直接操作物权转移
            if(confirmed > 0){
                return BizResult.create(true);
            }
            return BizResult.create(false);
        } catch (Exception e){
            log.error("CarAssetService confirmChgRecord e={}", e);
        }
        return BizResult.create(ErrorCodeEnum.UPDATE_FAIL);
    }

    @Override
    public BizResult<Boolean> initAssetRight(AssetRightChgDTO assetRightChgDTO) {
        try {
            log.info("CarAssetService initAssetRight assetRightChgDTO={}",JSON.toJSONString(assetRightChgDTO));
            Long assetRight = assetRightChgDTO.getAssetRight();
            String assetRightName = assetRightChgDTO.getAssetRightName();
            Integer assetRightType = assetRightChgDTO.getAssetRightType().getCode();
            String receiveTel = assetRightChgDTO.getReceiveTel();
            String receiveName = assetRightChgDTO.getReceiveName();
            String receiveCertNo = assetRightChgDTO.getReceiveCertNo();
            if(BeanUtil.paramNotNull(assetRight,assetRightName,assetRightType,receiveTel,receiveName,receiveCertNo)){
                return BizResult.create(carAssetAO.initAssetRight(assetRightChgDTO));
            }
            return BizResult.create(false);
        } catch (Exception e){
            log.error("CarAssetService initAssetRight e={}", e);
        }
        return BizResult.create(ErrorCodeEnum.UPDATE_FAIL);
    }

    @Override
    public BizResult<Boolean> cancelChgRecord(AssetRightChgDTO assetRightChgDTO) {
        try {
            log.info("AssetRightChgDTO cancelChgRecord assetRightChgDTO={}",JSON.toJSONString(assetRightChgDTO));
            Integer count = carAssetAO.cancelChgRecord(assetRightChgDTO);
            if(count > 0){
                return BizResult.create(true);
            }
            return BizResult.create(false);
        } catch (Exception e){
            log.error("CarAssetService cancelChgRecord e={}", e);
        }
        return BizResult.create(ErrorCodeEnum.UPDATE_FAIL);
    }

    @Override
    public BizResult<List<AssetRightChgResultDTO>> queryAssetRightChgRecords(AssetRightChgQueryDTO assetRightChgQueryDTO) {
        try {
            if(assetRightChgQueryDTO.getAssetRightChgRecordId() == null && assetRightChgQueryDTO.getAssetRight() == null){
                return BizResult.create(ErrorCodeEnum.PARAM_ERROR);
            }
            return BizResult.create(carAssetAO.queryAssetRightChgRecords(assetRightChgQueryDTO));
        } catch (Exception e){
            log.error("CarAssetService queryAssetRightChgRecords e={}", e);
        }
        return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
    }
}
