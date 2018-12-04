package com.chevrolet.boot;

import com.alibaba.dubbo.config.spring.ReferenceBean;
import com.chevrolet.api.service.*;
import com.mhc.spring.boot.DubboAutoConfiguration;
import com.mhc.spring.boot.DubboBasedAutoConfiguration;
import com.mhc.spring.boot.DubboProperties;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by suclogger on 2017/4/14.
 */
@Configuration
@AutoConfigureAfter(DubboAutoConfiguration.class)
@EnableConfigurationProperties(ChevroletProperties.class)
public class ChevroletAutoConfiguration extends DubboBasedAutoConfiguration {

    @Autowired
    private DubboProperties dubboProperties;

    @Autowired
    private ChevroletProperties chevroletProperties;

    private String getVersion() {
        return StringUtils.isEmpty(chevroletProperties.getVersion())? getVersion():chevroletProperties.getVersion();
    }
    
    @Bean
    public ReferenceBean<CarLoanOrderService> carLoanOrderService() {
        ReferenceBean<CarLoanOrderService> ref = getConsumerBean(CarLoanOrderService.class, getVersion(), dubboProperties.getConsumer().getTimeout());
        ref.setCheck(dubboProperties.getConsumer().getCheck());
        return ref;
    }

    @Bean
    public ReferenceBean<BaseCarService> baseCarService() {
        ReferenceBean<BaseCarService> ref = getConsumerBean(BaseCarService.class, getVersion(), dubboProperties.getConsumer().getTimeout());
        ref.setCheck(dubboProperties.getConsumer().getCheck());
        return ref;
    }

    @Bean
    public ReferenceBean<CarToolBoxService> loanCarService() {
        ReferenceBean<CarToolBoxService> ref = getConsumerBean(CarToolBoxService.class, getVersion(), dubboProperties.getConsumer().getTimeout());
        ref.setCheck(dubboProperties.getConsumer().getCheck());
        return ref;
    }

    @Bean
    public ReferenceBean<WmsCarService> wmsCarService() {
        ReferenceBean<WmsCarService> ref = getConsumerBean(WmsCarService.class, getVersion(), dubboProperties.getConsumer().getTimeout());
        ref.setCheck(dubboProperties.getConsumer().getCheck());
        return ref;
    }

    @Bean
    public ReferenceBean<TmsCarService> tmsCarService() {
        ReferenceBean<TmsCarService> ref = getConsumerBean(TmsCarService.class, getVersion(), dubboProperties.getConsumer().getTimeout());
        ref.setCheck(dubboProperties.getConsumer().getCheck());
        return ref;
    }

    @Bean
    public ReferenceBean<CarRiskConfirmService> carRiskConfirmService() {
        ReferenceBean<CarRiskConfirmService> ref = getConsumerBean(CarRiskConfirmService.class, getVersion(), dubboProperties.getConsumer().getTimeout());
        ref.setCheck(dubboProperties.getConsumer().getCheck());
        return ref;
    }

    @Bean
    public ReferenceBean<CarLoanOrderSearchService> carLoanOrderSearchService() {
        ReferenceBean<CarLoanOrderSearchService> ref = getConsumerBean(CarLoanOrderSearchService.class, getVersion(), dubboProperties.getConsumer().getTimeout());
        ref.setCheck(dubboProperties.getConsumer().getCheck());
        return ref;
    }

    @Bean
    public ReferenceBean<CarAssetService> carAssetService() {
        ReferenceBean<CarAssetService> ref = getConsumerBean(CarAssetService.class, getVersion(), dubboProperties.getConsumer().getTimeout());
        ref.setCheck(dubboProperties.getConsumer().getCheck());
        return ref;
    }

    @Bean
    public ReferenceBean<CarSalesService> carSalesService() {
        ReferenceBean<CarSalesService> ref = getConsumerBean(CarSalesService.class, dubboProperties.getConsumer().getVersion(), dubboProperties.getConsumer().getTimeout());
        ref.setCheck(dubboProperties.getConsumer().getCheck());
        return ref;
    }

    @Bean
    public ReferenceBean<CarStatusLockService> carStatusLockService() {
        ReferenceBean<CarStatusLockService> ref = getConsumerBean(CarStatusLockService.class, getVersion(), dubboProperties.getConsumer().getTimeout());
        ref.setCheck(dubboProperties.getConsumer().getCheck());
        return ref;
    }

    @Bean
    public ReferenceBean<CarSearchService> carSearchService() {
        ReferenceBean<CarSearchService> ref = getConsumerBean(CarSearchService.class, getVersion(), dubboProperties.getConsumer().getTimeout());
        ref.setCheck(dubboProperties.getConsumer().getCheck());
        return ref;
    }

    @Bean
    public ReferenceBean<FinancingCarService> financingCarService() {
        ReferenceBean<FinancingCarService> ref = getConsumerBean(FinancingCarService.class, getVersion(), dubboProperties.getConsumer().getTimeout());
        ref.setCheck(dubboProperties.getConsumer().getCheck());
        return ref;
    }


}
