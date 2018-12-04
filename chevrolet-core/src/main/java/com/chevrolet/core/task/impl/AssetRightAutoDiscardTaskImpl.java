package com.chevrolet.core.task.impl;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.fastjson.JSON;
import com.chevrolet.api.enums.AssetRightChgStatusEnum;
import com.chevrolet.api.enums.AssetRightInChangeEnum;
import com.chevrolet.core.ao.CarAO;
import com.chevrolet.core.task.AssetRightAutoDiscardTask;
import com.chevrolet.core.utils.CollectionUtil;
import com.chevrolet.core.wrapper.RedisWrapper;
import com.chevrolet.dal.dao.domain.AssetRightChgRecordDO;
import com.chevrolet.dal.dao.domain.query.AssetRightChgRecordQuery;
import com.chevrolet.dal.dao.manager.AssetRightChgRecordManager;
import com.google.common.collect.Lists;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * @author maihe
 */
@Slf4j
@Component
@Data
public class AssetRightAutoDiscardTaskImpl implements AssetRightAutoDiscardTask{
    private final int SIZE = 50;
    @Autowired
    private AssetRightChgRecordManager assetRightChgRecordManager;

    @Autowired
    private CarAO carAO;

    @Autowired
    private RedisWrapper redisWrapper;

    private static String key = "AssetRightAutoDiscardTask";

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void autoDiscard() {
        try {
            if(redisWrapper.lock(key,30)) {
                //取100条超时记录（每半分钟执行一次）
                Integer needSign = AssetRightChgStatusEnum.NEED_SIGN.getCode();
                Integer needConfirm = AssetRightChgStatusEnum.NEED_CONFIRM.getCode();
                //当前时间减少24小时
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.DAY_OF_YEAR, -1);
                AssetRightChgRecordQuery query = new AssetRightChgRecordQuery();
                query.or().andRecordStatusIn(Arrays.asList(needSign, needConfirm)).andGmtCreateLessThanOrEqualTo(cal.getTime());
                query.setPageNo(1);
                query.setPageSize(SIZE);
                List<AssetRightChgRecordDO> assetRightChgRecordDOS = assetRightChgRecordManager.selectByQuery(query);
                if (CollectionUtils.isNotEmpty(assetRightChgRecordDOS)) {
                    List<Long> assetRightChgRecordIds = CollectionUtil.beanToVarList(assetRightChgRecordDOS,
                            e -> e.getAssetRightChgRecordId());
                    List<Long> carIds = Lists.newArrayList();
                    CollectionUtil.beanToVarList(assetRightChgRecordDOS,
                            e -> carIds.addAll(genCarList(e.getCarIdList())));
                    log.info("AssetRightAutoDiscardTask autoDiscard cal={} assetRightChgRecordIds={} carIds={}", cal.getTime(), JSON.toJSONString(assetRightChgRecordIds),
                            JSON.toJSONString(carIds));
                    assetRightChgRecordManager.discardByChgRecordIds(assetRightChgRecordIds);
                    //车辆还原非变更中状态
                    carAO.alterCarAssetRightInChange(AssetRightInChangeEnum.NORMAL.getCode(), carIds);
                }
            }
        } finally {
            redisWrapper.delete(key);
        }
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
