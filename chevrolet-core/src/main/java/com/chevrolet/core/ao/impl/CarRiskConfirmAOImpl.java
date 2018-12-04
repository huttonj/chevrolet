package com.chevrolet.core.ao.impl;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.chevrolet.api.dto.BaseCarDTO;
import com.chevrolet.api.dto.CarRiskConfirmDTO;
import com.chevrolet.core.ao.CarRiskConfirmAO;
import com.chevrolet.core.utils.BeanUtil;
import com.chevrolet.dal.dao.domain.CarRiskConfirmDO;
import com.chevrolet.dal.dao.domain.query.CarRiskConfirmQuery;
import com.chevrolet.dal.dao.manager.CarRiskConfirmManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Component
@Slf4j
public class CarRiskConfirmAOImpl implements CarRiskConfirmAO{

    @Autowired
    private CarRiskConfirmManager carRiskConfirmManager;

    @Override
    public Long saveCarRiskConfirmDTO(CarRiskConfirmDTO carRiskConfirmDTO) {
        //前置校验
        CarRiskConfirmQuery carRiskConfirmQuery = new CarRiskConfirmQuery();
        carRiskConfirmQuery.or().andCarIdEqualTo(carRiskConfirmDTO.getCarId());
        int count = carRiskConfirmManager.countByQuery(carRiskConfirmQuery);
        CarRiskConfirmDO carRiskConfirmDO = (CarRiskConfirmDO)BeanUtil.copyPorp2DO(CarRiskConfirmDO.class,carRiskConfirmDTO);
        if(count > 0){
            //更新操作
            carRiskConfirmManager.updateByCarIdSelective(carRiskConfirmDO);
        } else {
            //插入操作
            carRiskConfirmManager.insertSelective(carRiskConfirmDO);
        }
        return carRiskConfirmDO.getCarId();
    }
}
