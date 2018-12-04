package com.chevrolet.core.utils;

import com.chevrolet.api.dto.BaseCarDTO;
import com.chevrolet.api.dto.CarHisDTO;
import com.chevrolet.api.dto.CarLoanOrderDetailDTO;
import com.chevrolet.dal.dao.domain.CarDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.lang.reflect.Field;

/**
 * Created by maihe on 2017/7/3.
 */
@Slf4j
public class CarCenterUtil {
    public static Class<?> carHisDTOClazz = CarHisDTO.class;
    public static boolean modifyKeyCarField(CarDO local, Object remote) {
        if(local == null || remote == null){
            return false;
        }
        //目前车辆信息更新只有这两个入口
        try {
            if(remote instanceof BaseCarDTO || remote instanceof CarLoanOrderDetailDTO) {
                BeanWrapper carDOWrapper = new BeanWrapperImpl(local);
                BeanWrapper objWrapper = new BeanWrapperImpl(remote);
                for (Field field : carHisDTOClazz.getDeclaredFields()) {
                    if("serialVersionUID".equals(field.getName())){
                        continue;
                    }
                    field.setAccessible(true);
                    Object val1 = carDOWrapper.getPropertyValue(field.getName());
                    Object val2 = objWrapper.getPropertyValue(field.getName());
                    if(val2 != null) {
                        if (!val2.equals(val1)) {//新值不等于当前值
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
           log.error("CarCenterUtil modifyKeyCarField e={}",e);
        }
        return false;
    }
}
