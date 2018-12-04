package com.chevrolet.core.aspect;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.fastjson.JSON;
import com.chevrolet.api.dto.BaseCarDTO;
import com.chevrolet.api.dto.CarLoanOrderDetailDTO;
import com.chevrolet.core.utils.BeanUtil;
import com.chevrolet.core.utils.CarCenterUtil;
import com.chevrolet.core.utils.ThreadPoolUtils;
import com.chevrolet.dal.dao.domain.CarDO;
import com.chevrolet.dal.dao.domain.CarHisDO;
import com.chevrolet.dal.dao.manager.CarHisManager;
import com.chevrolet.dal.dao.manager.CarManager;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by maihe on 2017/7/4.
 */
@Component
@Aspect
@Slf4j
public class CarInfoHisAspect {
    @Autowired
    private CarManager carManager;
    @Autowired
    private CarHisManager carHisManager;

    @Before(value = "@annotation(com.chevrolet.core.annotation.CarInfoHisLogger)")
    public void before(JoinPoint joinPoint) {
        try {
            Object[] args = joinPoint.getArgs();
            if(args[0] instanceof Collection<?>){
                recordCarInfoHis((List<?>) args[0],joinPoint.getTarget().getClass());
            }else{
                recordCarInfoHis(Arrays.asList(args[0]),joinPoint.getTarget().getClass());
            }
        } catch (Exception e){
            log.error("CarInfoHisAspect before e={}",e);
        }
    }

    private void recordCarInfoHis(List<?> remotes, Class<?> serviceClazz) {
        //目前只支持1.baseCarDTO 2.CarLoanOrderDetailDTO
        try {
            if (CollectionUtils.isNotEmpty(remotes) && serviceClazz != null) {
                if(!(remotes.get(0) instanceof BaseCarDTO) && !(remotes.get(0) instanceof CarLoanOrderDetailDTO)){
                    return;
                }
                final String remoteAddress = RpcContext.getContext().getRemoteHost();
                String serviceName = serviceClazz.getName();
                final String interfaceName = serviceName.substring(serviceName.lastIndexOf(".") + 1) + "." + RpcContext.getContext().getMethodName();
                //涉及的车辆信息一次性全部取出
                List<Long> carIds = Lists.newArrayList();
                final Map<Long,Object> carId2RemoteMap = Maps.newConcurrentMap();
                remotes.forEach(remote ->{
                    BeanWrapper remoteWrapper = new BeanWrapperImpl(remote);
                    Long carId = (Long) remoteWrapper.getPropertyValue("carId");
                    if(carId != null) {
                        carIds.add(carId);
                        carId2RemoteMap.put(carId,remote);
                    }
                });
                final List<CarDO> carDOS = carManager.selectByCarIds(carIds);
                //有关键车辆信息修改，操作需记录
                ThreadPoolUtils.getThreadPool().execute(() -> carDOS.forEach(carDO -> {
                    Object remote = carId2RemoteMap.get(carDO.getCarId());
                    if (CarCenterUtil.modifyKeyCarField(carDO, remote)) {
                        CarHisDO carHisDO = (CarHisDO) BeanUtil.copyPorp2DO(CarHisDO.class, carDO);
                        carHisDO.setRemoteAddress(remoteAddress);
                        carHisDO.setInterfaceName(interfaceName);
                        carHisManager.insertSelective(carHisDO);
                    }
                }));
            }
        } catch (Exception e) {
            log.info("CarInfoHisAspect recordCarInfoHis e={} remotes={} serviceClazz={}", e, JSON.toJSONString(remotes), serviceClazz);
        }
    }

}
