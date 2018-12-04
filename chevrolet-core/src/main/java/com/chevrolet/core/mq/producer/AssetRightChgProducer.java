package com.chevrolet.core.mq.producer;

import com.alibaba.fastjson.JSON;
import com.camaro.starter.mq.annotation.MQProducer;
import com.camaro.starter.mq.base.AbstractMQProducer;
import com.chevrolet.api.message.CarAssetChgMessage;
import com.chevrolet.core.utils.SpringContextUtil;
import com.chevrolet.core.utils.ThreadPoolUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author maihe
 */
@Slf4j
@MQProducer(topic = "chevrolet.assetRight.topic" , tag= "carAssetChgMessage")
public class AssetRightChgProducer extends AbstractMQProducer {

    public void sendCarAssetChgMessage(List<Long> carIds,Long oldRight, Integer oldRightType, Long right, Integer rightType) {
        NotifyAssetChgTask task = new NotifyAssetChgTask(right,rightType,oldRight,oldRightType,carIds);
        ThreadPoolUtils.getThreadPool().execute(task);
    }

    @AllArgsConstructor
    @Data
    class NotifyAssetChgTask implements Runnable {
        private Long right;
        private Integer rightType;
        private Long oldRight;
        private Integer oldRightType;
        private List<Long> carIds;

        @Override
        public void run() {
            try {
                AssetRightChgProducer producer = SpringContextUtil.getBean(AssetRightChgProducer.class);
                CarAssetChgMessage message = new CarAssetChgMessage(right,rightType,oldRight,oldRightType,carIds);
                log.info("物权发生变更 message={}", JSON.toJSONString(message));
                producer.syncSend(message);
            } catch (Exception e){
                log.error("NotifyAssetChgTask run e={}", e);
            }
        }
    }
}
