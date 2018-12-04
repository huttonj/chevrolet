/**
 * Allrights Reserved,Designed By www.maihaoche.com
 * @Package com.chevrolet.core.ao.impl
 * @author 加菲 (jiafei@maihaoche.com)
 * @date 2018/4/18 11:44
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.chevrolet.core.ao.impl;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.chevrolet.api.dto.CarHisDTO;
import com.chevrolet.api.dto.query.CarHisQueryDTO;
import com.chevrolet.core.ao.CarHisAO;
import com.chevrolet.core.utils.BeanCopierUtil;
import com.chevrolet.dal.dao.domain.CarHisDO;
import com.chevrolet.dal.dao.domain.query.CarHisQuery;
import com.chevrolet.dal.dao.manager.CarHisManager;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <p> 车辆历史记录 </p>
 *
 * @author 加菲（jiafei@maihaoche.com）
 * @date 2018/4/18 11:44
 * @since V1.0
 */
@Service
public class CarHisAOImpl implements CarHisAO {

    @Autowired
    private CarHisManager carHisManager;

    @Override
    public List<CarHisDTO> queryCarHis(CarHisQueryDTO carHisQuery) {
        CarHisQuery query = new CarHisQuery();
        query.createCriteria().andCarIdIn(Lists.newArrayList(carHisQuery.getIdAndUpdateTime().keySet()));
        query.setOrderByClause("gmt_create desc");
        List<CarHisDO> carHisDOs = carHisManager.selectByQuery(query);
        if (CollectionUtils.isEmpty(carHisDOs)) {
            return Lists.newArrayList();
        }
        // 按carid分组
        Map<Long, List<CarHisDO>> map = carHisDOs.stream().collect(Collectors.groupingBy(CarHisDO::getCarId));

        List<CarHisDTO> carHisDTOs = Lists.newArrayList();
        map.keySet().forEach(k -> {
            List<CarHisDO> carHisDOS = map.get(k);
            // 如果查询的时间超过最新的记录时间，返回最新的记录
            if (carHisQuery.getIdAndUpdateTime().get(k).after(carHisDOS.get(0).getGmtCreate())) {
                CarHisDTO carHisDTO = BeanCopierUtil.convert(carHisDOS.get(0), CarHisDTO.class);
                carHisDTOs.add(carHisDTO);
            } else {
                for (CarHisDO carHisDO : carHisDOS) {
                    // 精确到日
                    DateFormat dateFormat = DateFormat.getDateInstance();
                    if (dateFormat.format(carHisQuery.getIdAndUpdateTime().get(k)).equals(dateFormat.format(carHisDO.getGmtCreate()))) {
                        CarHisDTO carHisDTO = BeanCopierUtil.convert(carHisDO, CarHisDTO.class);
                        carHisDTOs.add(carHisDTO);
                        break;
                    }
                }
            }
        });
        return carHisDTOs;
    }
}
