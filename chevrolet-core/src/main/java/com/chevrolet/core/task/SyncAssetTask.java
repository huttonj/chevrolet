package com.chevrolet.core.task;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.camaro.starter.mq.annotation.MQConsumer;
import com.camaro.starter.mq.base.AbstractMQPushConsumer;
import com.chevrolet.api.enums.AssetRightTypeEnum;
import com.chevrolet.core.ao.CarAO;
import com.chevrolet.core.utils.ThreadPoolFactory;
import com.chevrolet.core.wrapper.RedisWrapper;
import com.chevrolet.dal.dao.domain.CarDO;
import com.chevrolet.dal.dao.domain.CarLoanDO;
import com.chevrolet.dal.dao.domain.query.CarLoanQuery;
import com.chevrolet.dal.dao.manager.CarLoanManager;
import com.chevrolet.dal.dao.manager.CarManager;
import com.chevrolet.dal.dao.mapper.ext.CarLoanExtMapper;
import com.gtr.api.service.IDubboCarLoanOrder;
import com.maybach.dubbo.api.model.Partner;
import com.subaru.common.entity.BizResult;
import com.subaru.common.model.request.FpOrderAuditReq;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * Created by suclogger on 2017/11/23
 * Modified by
 * Description:
 */
@Slf4j
@MQConsumer(topic = "tp_sync_asset_right", consumerGroup = "cid_sync_asset_right")
public class SyncAssetTask extends AbstractMQPushConsumer<String> {

    final static String SYNC_ASSET_REDIS_KEY = "SYNC_ASSET_REDIS_KEY";

    private RedisWrapper redisWrapper;

    private CarLoanExtMapper carLoanExtMapper;

    private IDubboCarLoanOrder dubboCarLoanOrder;

    private CarAO carAO;

    private CarManager carManager;

    @Autowired
    public void setCarManager(CarManager carManager) {
        this.carManager = carManager;
    }

    @Autowired
    public void setCarAO(CarAO carAO) {
        this.carAO = carAO;
    }

    @Autowired
    public void setiDubboCarLoanOrder(IDubboCarLoanOrder dubboCarLoanOrder) {
        this.dubboCarLoanOrder = dubboCarLoanOrder;
    }

    @Autowired
    public void setRedisWrapper(RedisWrapper redisWrapper) {
        this.redisWrapper = redisWrapper;
    }

    @Autowired
    public void setCarLoanExtMapper(CarLoanExtMapper carLoanExtMapper) {
        this.carLoanExtMapper = carLoanExtMapper;
    }

    @Override
    public boolean process(String message, Map<String, Object> extMap) {
        log.info("start sync asset right task..");
        ThreadPoolFactory.getThreadPool().execute(new SyncAsset());
        return true;
    }

    class SyncAsset implements Runnable {

        @Override
        public void run() {

            if(!StringUtils.isEmpty(redisWrapper.getString(SYNC_ASSET_REDIS_KEY))) {
                return;
            }
            redisWrapper.put(SYNC_ASSET_REDIS_KEY, "SYNCING", 600);

            List<String> carLoanOrderNOs = carLoanExtMapper.getDistinctLoanOrderNo();
            log.info("get car loan order list done, size : {}", carLoanOrderNOs.size());
            carLoanOrderNOs.parallelStream().forEach(orderNO ->{
                log.info("sync car loan order no : {}", orderNO);
                try {
                    FpOrderAuditReq fpOrderAuditReq = new FpOrderAuditReq();
                    fpOrderAuditReq.setOrderNo(orderNO);
                    BizResult<JSONObject> result = dubboCarLoanOrder.orderDetail(fpOrderAuditReq);
                    if ( result.getData() != null) {
                        try {
                            Partner provider = result.getData().getObject("provider", Partner.class);
                            Long providerId = provider == null ? -2l: provider.getId();
                            Partner dealer = result.getData().getObject("dealerPartnerInfo", Partner.class);
                            Long dealerId = dealer == null ? -2l : dealer.getId();
                            try {
                                //刷在贷车
                                CarLoanQuery carLoanQuery = new CarLoanQuery();
                                carLoanQuery.or().andCarLoanOrderNoEqualTo(orderNO).andCarStatusIn(Arrays.asList(20, 30, 40, 50, 100));
                                List<CarLoanDO> onLoan = carLoanExtMapper.selectByQuery(carLoanQuery);
                                if(!CollectionUtils.isEmpty(onLoan)){
                                    List<Long> carIds = onLoan.stream().map(carLoanDO -> carLoanDO.getCarId()).collect(Collectors.toList());
                                    if(!CollectionUtils.isEmpty(carIds)) {
                                        CarDO carDO = new CarDO();
                                        carDO.setAssetRight(dealerId);
                                        carDO.setAssetRightType(AssetRightTypeEnum.ENTERPRISE.getCode());
                                        carManager.updateAssetRightByCarIdsTemp(carDO, carIds);
                                        log.info("updating onloan car asset right for orderNo={} carIds : {} to {}", orderNO, JSON.toJSONString(carIds), dealerId);
                                    }
                                }
                            } catch (Exception e){
                                e.printStackTrace();
                            }

                            try {
                                //刷非在贷车
                                CarLoanQuery carLoanQuery = new CarLoanQuery();
                                carLoanQuery.or().andCarLoanOrderNoEqualTo(orderNO).andCarStatusNotIn(Arrays.asList(20, 30, 40, 50, 100));
                                List<CarLoanDO> notOnLoan = carLoanExtMapper.selectByQuery(carLoanQuery);
                                if(!CollectionUtils.isEmpty(notOnLoan)){
                                    List<Long> carIds = notOnLoan.stream().map(carLoanDO -> carLoanDO.getCarId()).collect(Collectors.toList());
                                    if(!CollectionUtils.isEmpty(carIds)) {
                                        CarDO carDO = new CarDO();
                                        carDO.setAssetRight(providerId);
                                        carDO.setAssetRightType(AssetRightTypeEnum.ENTERPRISE.getCode());
                                        carManager.updateAssetRightByCarIdsTemp(carDO, carIds);
                                        log.info("updating notOnloan car asset right for orderNo={} carIds : {} to {}", orderNO, JSON.toJSONString(carIds), providerId);
                                    }
                                }
                            } catch (Exception e){
                                e.printStackTrace();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
                } catch (Exception e){
                   log.info("调gtr接口报错 orderNo={}",orderNO);
                }
            });
            try {
                log.info("end sync asset right task");
            } catch (Exception e){
                e.printStackTrace();
            }

        }
    }

}
