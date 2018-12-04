package com.chevrolet.core.adaptor;

import com.maihaoche.acura.api.IStaffService;
import com.maihaoche.acura.api.model.Staff;
import com.subaru.common.entity.BizResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by maihe on 2017/7/20.
 */
@Slf4j
@Component
public class AcuraDubboAdapter {
    @Autowired
    IStaffService staffService;

    /**
     * 通过三个参数获取员工信息
     * @param appId 应用在acura注册时生成的
     * @param ticketId 在acura完成登录后的返回参数解密得到
     * @param unionId 在acura完成登录后的返回参数解密得到
     * @return 调用结果
     */
    public BizResult<Staff> findStaffBy(Long appId, Long unionId, String ticketId) {
        BizResult<Staff> bizResult = null;
        try {
            bizResult = staffService.findBy(appId, unionId, ticketId);
        } catch (Exception e) {
            log.error("调用acura接口异常", e);
        }
        return bizResult;
    }
}

