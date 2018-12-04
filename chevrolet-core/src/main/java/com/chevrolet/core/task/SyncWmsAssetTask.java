package com.chevrolet.core.task;

import com.camaro.starter.mq.annotation.MQConsumer;
import com.camaro.starter.mq.base.AbstractMQPushConsumer;
import com.chevrolet.api.enums.AssetRightTypeEnum;
import com.chevrolet.dal.dao.domain.CarDO;
import com.chevrolet.dal.dao.domain.WmsCarDO;
import com.chevrolet.dal.dao.domain.WmsOrderDO;
import com.chevrolet.dal.dao.domain.query.WmsCarQuery;
import com.chevrolet.dal.dao.domain.query.WmsOrderQuery;
import com.chevrolet.dal.dao.manager.CarManager;
import com.chevrolet.dal.dao.mapper.ext.WmsCarExtMapper;
import com.chevrolet.dal.dao.mapper.ext.WmsOrderExtMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by suclogger on 2017/12/16
 * Modified by
 * Description:
 */
@MQConsumer(topic = "tp_sync_asset_right", consumerGroup = "cid_sync_asset_right_wms")
public class SyncWmsAssetTask extends AbstractMQPushConsumer<String> {

    @Autowired
    private WmsCarExtMapper wmsCarExtMapper;

    @Autowired
    private WmsOrderExtMapper wmsOrderExtMapper;

    @Autowired
    private CarManager carManager;

    @Override
    public boolean process(String message, Map<String, Object> extMap) {

        WmsOrderQuery wmsOrderQuery = new WmsOrderQuery();
        wmsOrderQuery.or().andOrderTypeIn(Arrays.asList(3, 8));
        List<WmsOrderDO> wmsOrderDOList = wmsOrderExtMapper.selectByQuery(wmsOrderQuery);

        wmsOrderDOList.forEach(wmsOrderDO -> {
            Long pid= wmsOrderDO.getOrderId();
            WmsCarQuery wmsCarQuery = new WmsCarQuery();
            wmsCarQuery.or().andOrderIdEqualTo(wmsOrderDO.getOrderId());
            List<WmsCarDO> wmsCarDOS = wmsCarExtMapper.selectByQuery(wmsCarQuery);
            CarDO carDO = new CarDO();
            carDO.setAssetRight(pid);
            carDO.setAssetRightType(AssetRightTypeEnum.ENTERPRISE.getCode());
            carManager.updateAssetRightByCarIdsTemp(carDO, wmsCarDOS.stream().map(wmsCarDO -> wmsCarDO.getCcCarId()).collect(Collectors.toList()));
        });
        return true;
    }
}
