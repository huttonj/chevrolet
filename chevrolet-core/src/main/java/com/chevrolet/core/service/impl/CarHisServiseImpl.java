/**
 * Allrights Reserved,Designed By www.maihaoche.com
 * @Package com.chevrolet.core.service.impl
 * @author 加菲 (jiafei@maihaoche.com)
 * @date 2018/4/18 11:36
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.chevrolet.core.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.chevrolet.api.dto.CarHisDTO;
import com.chevrolet.api.dto.query.CarHisQueryDTO;
import com.chevrolet.api.service.CarHisService;
import com.chevrolet.core.ao.CarHisAO;
import com.subaru.common.entity.APIResult;
import com.subaru.common.entity.ErrorCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * <p> 车辆历史记录服务接口实现类 </p>
 *
 * @author 加菲（jiafei@maihaoche.com）
 * @date 2018/4/18 11:36
 * @since V1.0
 */
@Component
@Slf4j
@Service(interfaceClass = CarHisService.class)
public class CarHisServiseImpl implements CarHisService {

    @Autowired
    private CarHisAO carHisAO;

    @Override
    public APIResult<List<CarHisDTO>> queryCarHis(CarHisQueryDTO carHisQuery) {
        try {
            checkCarHisQuery(carHisQuery);
            return APIResult.create(carHisAO.queryCarHis(carHisQuery));
        } catch (IllegalArgumentException e) {
            log.error("参数错误，param:{}，错误原因:{}", JSON.toJSONString(carHisQuery), e.getMessage());
            return APIResult.create(ErrorCodeEnum.PARAM_ERROR.getErrCode(), e.getMessage());
        } catch (Exception ex) {
            log.error("查询车辆历史记录异常", ex);
            return APIResult.create(ErrorCodeEnum.EXCEPTION);
        }
    }

    /**
     * 检查参数正确性
     * @param carHisQuery
     * @return
     */
    private void checkCarHisQuery(CarHisQueryDTO carHisQuery) {
        if (Objects.isNull(carHisQuery) || MapUtils.isEmpty(carHisQuery.getIdAndUpdateTime())) {
            throw new IllegalArgumentException("查询条件为空");
        }
        for (Map.Entry<Long, Date> entry : carHisQuery.getIdAndUpdateTime().entrySet()) {
            if (Objects.isNull(entry.getValue())) {
                throw new IllegalArgumentException("存在更改时间为空的查询条件");
            }
        }
    }
}
