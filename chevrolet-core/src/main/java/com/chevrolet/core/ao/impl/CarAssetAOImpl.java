package com.chevrolet.core.ao.impl;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.fastjson.JSON;
import com.chevrolet.api.dto.*;
import com.chevrolet.api.enums.AssetRightChgStatusEnum;
import com.chevrolet.api.enums.AssetRightInChangeEnum;
import com.chevrolet.api.enums.AssetRightTypeEnum;
import com.chevrolet.core.ao.CarAO;
import com.chevrolet.core.ao.CarAssetAO;
import com.chevrolet.core.utils.BeanUtil;
import com.chevrolet.core.utils.CollectionUtil;
import com.chevrolet.core.wrapper.RedisWrapper;
import com.chevrolet.dal.dao.domain.AssetRightChgRecordDO;
import com.chevrolet.dal.dao.domain.CarAssetChglogDO;
import com.chevrolet.dal.dao.domain.CarDO;
import com.chevrolet.dal.dao.domain.query.AssetRightChgRecordQuery;
import com.chevrolet.dal.dao.domain.query.CarAssetChglogQuery;
import com.chevrolet.dal.dao.manager.AssetRightChgRecordManager;
import com.chevrolet.dal.dao.manager.CarAssetChglogManager;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * @author maihe
 */
@Slf4j
@Component
@Transactional
public class CarAssetAOImpl implements CarAssetAO {
    @Autowired
    private RedisWrapper redisWrapper;
    @Autowired
    private CarAO carAO;

    @Autowired
    private AssetRightChgRecordManager assetRightChgRecordManager;

    @Autowired
    private CarAssetChglogManager carAssetChglogManager;

    public static final String prefix = "applyAssetRightChg:";

    public static final int EXPIRE = 5;

    @Override
    public int transferAsset(TransferAssetDTO transferAssetDTO) {
        if (carAO.existCarInChange(transferAssetDTO.getCarIds())) {
            return 0;
        }
        CarDO carDO = new CarDO();
        carDO.setAssetRight(transferAssetDTO.getAssetRight());
        carDO.setAssetRightName(transferAssetDTO.getAssetRightName());
        carDO.setAssetRightType(transferAssetDTO.getAssetRightType().getCode());
        int count = carAO.updateAssetRightByCarIds(carDO, transferAssetDTO.getCarIds(), transferAssetDTO.getOldAssetRight(),
                transferAssetDTO.getOldAssetRightType().getCode());
        if (count > 0) {
            if (count != transferAssetDTO.getCarIds().size()) {
                log.error("物权变更车辆数与实际不一致，回滚 count={} size={}", count, transferAssetDTO.getCarIds().size());
                throw new RuntimeException("物权变更车辆数与实际不一致，回滚");
            }
        }
        return count;
    }

    @Override
    public Map<Long,List<CarAssetChgLogDTO>> queryAssetTransferLog(List<Long> carIds){
        CarAssetChglogQuery carAssetChglogQuery = new CarAssetChglogQuery();
        carAssetChglogQuery.or().andCarIdIn(carIds);
        List<CarAssetChglogDO> carAssetChglogDOS = carAssetChglogManager.selectByQuery(carAssetChglogQuery);
        if(CollectionUtils.isNotEmpty(carAssetChglogDOS)){
            List<CarAssetChgLogDTO> carAssetChgLogDTOS = BeanUtil.copyPorp2DOs(CarAssetChgLogDTO.class, carAssetChglogDOS);
            return CollectionUtil.groupList2Map(carAssetChgLogDTOS,e -> e.getCarId());
        }
        return null;
    }

    @Override
    public Long applyAssetRightChg(AssetRightChgApplyDTO assetRightChgApplyDTO) {
        String key = prefix + assetRightChgApplyDTO.getAssetRight() + "_" + assetRightChgApplyDTO.getAssetRightType().getCode();
        try {
            if (redisWrapper.lock(key, EXPIRE)) {
                Long applied = applyRecord(assetRightChgApplyDTO);
                if(applied > 0){
                    return applied;
                }
                redisWrapper.delete(key);
            }
        } catch (Exception e) {
            redisWrapper.delete(key);
            log.error("CarAssetAO applyAssetRightChg e={}", e);
        }
        return 0L;
    }

    public Long applyRecord(AssetRightChgApplyDTO assetRightChgApplyDTO){
        //车辆变更中
        if (carAO.existCarInChange(assetRightChgApplyDTO.getCarIds())) {
            log.error("本次变更包含的车辆，有车处于变更中 carIds={}", JSON.toJSONString(assetRightChgApplyDTO.getCarIds()));
            throw new RuntimeException("本次变更包含的车辆，有车处于变更中");
        }
        AssetRightChgRecordDO assetRightChgRecordDO = BeanUtil.copyPorp2DO(AssetRightChgRecordDO.class, assetRightChgApplyDTO);
        assetRightChgRecordDO.setAssetRightType(assetRightChgApplyDTO.getAssetRightType().getCode());
        //保存接收人key
        assetRightChgRecordDO.setReceiveKey(genReceiveKey(assetRightChgApplyDTO.getReceiveTel(),
                assetRightChgApplyDTO.getReceiveName(), assetRightChgApplyDTO.getReceiveCertNo()));
        //保存关联车辆
        assetRightChgRecordDO.setCarIdList(genCarIds(assetRightChgApplyDTO.getCarIds()));
        assetRightChgRecordDO.setRecordStatus(AssetRightChgStatusEnum.NEED_SIGN.getCode());
        Long id = assetRightChgRecordManager.insertSelective(assetRightChgRecordDO);
        if (id > 0) {
            Integer count = carAO.alterCarAssetRightInChange(AssetRightInChangeEnum.IN_CHANGE.getCode(), assetRightChgApplyDTO.getCarIds());
            if (count != assetRightChgApplyDTO.getCarIds().size()) {
                log.error("发起物权变更车辆数与实际不一致，回滚 count={} size={}", count, assetRightChgApplyDTO.getCarIds().size());
                throw new RuntimeException("发起物权变更车辆数与实际不一致，回滚");
            }
            return id;
        }
        return 0L;
    }

    @Override
    public Integer signChgRecord(AssetRightChgDTO assetRightChgDTO) {
        AssetRightChgRecordDO recordDO = assetRightChgRecordManager.selectByPrimaryKey(assetRightChgDTO.getAssetRightChgRecordId());
        if (recordDO != null) {
            List<Long> carIds = this.genCarList(recordDO.getCarIdList());
            if (recordDO.getPartnerId() != null) {
                //签章成功,如果有企业信息，直接转移物权
                AssetRightChgRecordDO assetRightChgRecordDO = new AssetRightChgRecordDO();
                assetRightChgRecordDO.setAssetRightChgRecordId(assetRightChgDTO.getAssetRightChgRecordId());
                assetRightChgRecordDO.setContractId(assetRightChgDTO.getContractId());
                assetRightChgRecordDO.setSignTime(new Date());
                assetRightChgRecordDO.setConfirmTime(new Date());
                assetRightChgRecordDO.setRecordStatus(AssetRightChgStatusEnum.FINISHED.getCode());
                int count = assetRightChgRecordManager.updateByPrimaryKeySelectiveWithStatus(assetRightChgRecordDO,
                        Arrays.asList(AssetRightChgStatusEnum.NEED_SIGN.getCode()));
                if (count > 0) {
                    CarDO carDO = new CarDO();
                    carDO.setAssetRight(recordDO.getPartnerId());
                    carDO.setAssetRightName(recordDO.getPartnerName());
                    carDO.setAssetRightType(AssetRightTypeEnum.ENTERPRISE.getCode());
                    carDO.setAssetRightInChange(AssetRightInChangeEnum.NORMAL.getCode());
                    int updates = carAO.updateAssetRightByCarIds(carDO, carIds, recordDO.getAssetRight(), recordDO.getAssetRightType());
                    if (updates != carIds.size()) {
                        log.error("签章时变更物权车辆，与实际不一致 assetRightChgRecordId={}", assetRightChgDTO.getAssetRightChgRecordId());
                        throw new RuntimeException("签章时变更物权车辆，与实际不一致，回滚");
                    }
                    return count;
                }
            } else {
                AssetRightChgRecordDO assetRightChgRecordDO = new AssetRightChgRecordDO();
                assetRightChgRecordDO.setAssetRightChgRecordId(assetRightChgDTO.getAssetRightChgRecordId());
                assetRightChgRecordDO.setContractId(assetRightChgDTO.getContractId());
                assetRightChgRecordDO.setSignTime(new Date());
                assetRightChgRecordDO.setRecordStatus(AssetRightChgStatusEnum.NEED_CONFIRM.getCode());
                return assetRightChgRecordManager.updateByPrimaryKeySelectiveWithStatus(assetRightChgRecordDO,
                        Arrays.asList(AssetRightChgStatusEnum.NEED_SIGN.getCode()));
            }
        }
        return 0;
    }

    @Override
    public Integer confirmChgRecord(AssetRightChgDTO assetRightChgDTO) {
        AssetRightChgRecordDO assetRightChgRecordDO = new AssetRightChgRecordDO();
        assetRightChgRecordDO.setAssetRightChgRecordId(assetRightChgDTO.getAssetRightChgRecordId());
        assetRightChgRecordDO.setConfirmTime(new Date());
        assetRightChgRecordDO.setRecordStatus(AssetRightChgStatusEnum.FINISHED.getCode());
        Integer count = assetRightChgRecordManager.updateByPrimaryKeySelectiveWithStatus(assetRightChgRecordDO,
                Arrays.asList(AssetRightChgStatusEnum.NEED_CONFIRM.getCode()));
        if (count > 0) {
            //买方确认成功,如果有注册个人信息，直接转移物权
            AssetRightChgRecordDO recordDO = assetRightChgRecordManager.selectByPrimaryKey(assetRightChgDTO.getAssetRightChgRecordId());
            if (recordDO.getUserId() != null) {
                List<Long> carIds = this.genCarList(recordDO.getCarIdList());
                CarDO carDO = new CarDO();
                carDO.setAssetRight(recordDO.getUserId());
                carDO.setAssetRightName(recordDO.getUserName());
                carDO.setAssetRightType(AssetRightTypeEnum.PERSONAL.getCode());
                carDO.setAssetRightInChange(AssetRightInChangeEnum.NORMAL.getCode());
                int updates = carAO.updateAssetRightByCarIds(carDO, carIds, recordDO.getAssetRight(), recordDO.getAssetRightType());
                if (updates != carIds.size()) {
                    log.error("接收人物权车辆确认时，与实际不一致 assetRightChgRecordId={}", assetRightChgDTO.getAssetRightChgRecordId());
                    throw new RuntimeException("接收人物权车辆确认时，与实际不一致，回滚");
                }
            } else {
                if (assetRightChgDTO.getAssetRight() != null && assetRightChgDTO.getAssetRightType() != null) {
                    List<Long> carIds = this.genCarList(recordDO.getCarIdList());
                    CarDO carDO = new CarDO();
                    carDO.setAssetRight(assetRightChgDTO.getAssetRight());
                    carDO.setAssetRightName(assetRightChgDTO.getAssetRightName());
                    carDO.setAssetRightType(assetRightChgDTO.getAssetRightType().getCode());
                    carDO.setAssetRightInChange(AssetRightInChangeEnum.NORMAL.getCode());
                    int updates = carAO.updateAssetRightByCarIds(carDO, carIds, recordDO.getAssetRight(), recordDO.getAssetRightType());
                    if (updates != carIds.size()) {
                        log.error("接收人物权车辆确认时，与实际不一致 assetRightChgRecordId={}", assetRightChgDTO.getAssetRightChgRecordId());
                        throw new RuntimeException("接收人物权车辆确认时，与实际不一致，回滚");
                    }
                }
            }
            return count;
        }
        return 0;
    }

    @Override
    public Boolean initAssetRight(AssetRightChgDTO assetRightChgDTO) {
        try {
            String key = this.genReceiveKey(assetRightChgDTO.getReceiveTel().trim(), assetRightChgDTO.getReceiveName().trim(),
                    assetRightChgDTO.getReceiveCertNo().trim());
            AssetRightChgRecordQuery assetRightChgRecordQuery = new AssetRightChgRecordQuery();
            assetRightChgRecordQuery.or().andReceiveKeyEqualTo(key).andRecordStatusEqualTo(AssetRightChgStatusEnum.FINISHED.getCode());
            List<AssetRightChgRecordDO> assetRightChgRecordDOS = assetRightChgRecordManager.selectByQuery(assetRightChgRecordQuery);
            if (CollectionUtils.isNotEmpty(assetRightChgRecordDOS)) {
                assetRightChgRecordDOS.forEach(e -> {
                    CarDO carDO = new CarDO();
                    carDO.setAssetRight(assetRightChgDTO.getAssetRight());
                    carDO.setAssetRightName(assetRightChgDTO.getAssetRightName());
                    carDO.setAssetRightType(assetRightChgDTO.getAssetRightType().getCode());
                    carDO.setAssetRightInChange(AssetRightInChangeEnum.NORMAL.getCode());
                    carAO.updateAssetRightByCarIds(carDO, this.genCarList(e.getCarIdList()), e.getAssetRight(), e.getAssetRightType());
                });
            }
            return true;
        } catch (Exception e) {
            log.error("CarAssetAO initAssetRight error={}", e);
        }
        return false;
    }

    @Override
    public Integer cancelChgRecord(AssetRightChgDTO assetRightChgDTO) {
        AssetRightChgRecordDO assetRightChgRecordDO = BeanUtil.copyPorp2DO(AssetRightChgRecordDO.class, assetRightChgDTO);
        assetRightChgRecordDO.setRecordStatus(AssetRightChgStatusEnum.CANCELED.getCode());
        int updated = assetRightChgRecordManager.updateByPrimaryKeySelectiveWithStatus(assetRightChgRecordDO,
                Arrays.asList(AssetRightChgStatusEnum.NEED_SIGN.getCode(),
                        AssetRightChgStatusEnum.NEED_CONFIRM.getCode()));
        if (updated > 0) {
            AssetRightChgRecordDO curr = assetRightChgRecordManager.selectByPrimaryKey(assetRightChgDTO.getAssetRightChgRecordId());
            if (curr != null) {
                List<Long> carIds = this.genCarList(curr.getCarIdList());
                Integer count = carAO.alterCarAssetRightInChange(AssetRightInChangeEnum.NORMAL.getCode(), carIds);
                if (count != carIds.size()) {
                    log.error("取消物权变更时车辆数与实际不一致，回滚 count={} size={}", count, carIds.size());
                    throw new RuntimeException("取消物权变更时车辆数与实际不一致，回滚");
                }
            } else {
                log.error("取消物权变更时车辆数与实际不一致，回滚 recordId", assetRightChgDTO.getAssetRightChgRecordId());
                throw new RuntimeException("取消时没有查到变更单记录，回滚，recordId=" + assetRightChgDTO.getAssetRightChgRecordId());
            }
        }
        return 0;
    }

    @Override
    public List<AssetRightChgResultDTO> queryAssetRightChgRecords(AssetRightChgQueryDTO assetRightChgQueryDTO) {
        try {
            AssetRightChgRecordQuery query = new AssetRightChgRecordQuery();
            AssetRightChgRecordQuery.Criteria criteria = query.or();
            if (assetRightChgQueryDTO.getAssetRight() != null && assetRightChgQueryDTO.getAssetRightType() != null) {
                Long assetRight = assetRightChgQueryDTO.getAssetRight();
                Integer assetRightType = assetRightChgQueryDTO.getAssetRightType().getCode();
                criteria.andAssetRightEqualTo(assetRight).andAssetRightTypeEqualTo(assetRightType);
            }
            Long assetRightChgRecordId = assetRightChgQueryDTO.getAssetRightChgRecordId();
            if (assetRightChgRecordId != null) {
                criteria.andAssetRightChgRecordIdEqualTo(assetRightChgRecordId);
            }
            query.setOrderByClause("record_status asc,gmt_create desc");
            return BeanUtil.copyPorp2DOs(AssetRightChgResultDTO.class, assetRightChgRecordManager.selectByQuery(query), (assetRightChgResultDTO, assetRightChgRecordDO) -> {
                //对cars字段特殊处理
                List<Long> carIds = genCarList(assetRightChgRecordDO.getCarIdList());
                if (CollectionUtils.isNotEmpty(carIds)) {
                    assetRightChgResultDTO.setCars(carAO.queryCarsByQueryReq(carIds));
                }

                if (assetRightChgRecordDO.getReceiveKey() != null) {
                    String[] key = this.analyzeReveiveKey(assetRightChgRecordDO.getReceiveKey());
                    //手机
                    assetRightChgResultDTO.setReceiveTel(key[0]);
                    //姓名
                    assetRightChgResultDTO.setReceiveName(key[1]);
                    //身份证
                    assetRightChgResultDTO.setReceiveCertNo(key[2]);
                }
                if (assetRightChgRecordDO.getRecordStatus() != null) {
                    AssetRightChgStatusEnum status = AssetRightChgStatusEnum.getRecordStatusEnum(assetRightChgRecordDO.getRecordStatus());
                    if (status != null) {
                        assetRightChgResultDTO.setRecordStatusDesc(status.getDesc());
                    }
                }
            });
        } catch (Exception e) {
            log.error("CarAssetAO queryAssetRightChgRecords error={}", e);
        }
        return new ArrayList<>();
    }

    private String genReceiveKey(String receiveTel, String receiveName, String receiveCertNo) {
        if (receiveTel == null || receiveName == null || receiveCertNo == null) {
            return null;
        }
        return receiveTel + "_" + receiveName + "_" + receiveCertNo;
    }

    private String[] analyzeReveiveKey(String key) {
        if (key == null) {
            return null;
        }
        return key.split("_");
    }

    private String genCarIds(List<Long> carIds) {
        StringBuffer sb = new StringBuffer();
        carIds.forEach(carId -> sb.append(carId).append(","));
        return sb.toString().substring(0, sb.length() - 1);
    }

    private List<Long> genCarList(String carIds) {
        if (StringUtils.isBlank(carIds)) {
            return null;
        }
        List<Long> list = Lists.newArrayList();
        String[] temp = carIds.split(",");
        for (String s : temp) {
            list.add(Long.valueOf(s));
        }
        return list;
    }
}
