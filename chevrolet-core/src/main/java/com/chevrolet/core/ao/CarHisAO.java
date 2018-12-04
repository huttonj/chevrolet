/**
 * Allrights Reserved,Designed By www.maihaoche.com
 * @Package com.chevrolet.core.ao
 * @author 加菲 (jiafei@maihaoche.com)
 * @date 2018/4/18 11:42
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.chevrolet.core.ao;

import com.chevrolet.api.dto.CarHisDTO;
import com.chevrolet.api.dto.query.CarHisQueryDTO;

import java.util.List;

/**
 * <p> 车辆历史记录AO </p>
 *
 * @author 加菲（jiafei@maihaoche.com）
 * @date 2018/4/18 11:42
 * @since V1.0
 */
public interface CarHisAO {

    /**
     * 查找车辆记录
     * @param carHisQuery
     * @return
     */
    List<CarHisDTO> queryCarHis(CarHisQueryDTO carHisQuery);
}
