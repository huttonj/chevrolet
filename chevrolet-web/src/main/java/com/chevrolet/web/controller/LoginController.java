package com.chevrolet.web.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.chevrolet.core.adaptor.AcuraDubboAdapter;
import com.chevrolet.core.config.AcuraProperties;
import com.chevrolet.core.config.Constants;
import com.maihaoche.acura.api.model.Staff;
import com.mhc.subaru.validation.annotations.NoLogin;
import com.mhc.subaru.validation.annotations.NoPermission;
import com.mhc.subaru.validation.holder.CurrentUserHolder;
import com.subaru.common.entity.BizResult;
import com.subaru.common.util.AES;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;

/**
 * Created by maihe on 2017/7/20.
 */
@Slf4j
@Controller
@RequestMapping(value = "/")
public class LoginController {
    @Autowired
    AcuraProperties acuraProperties;
    @Autowired
    AcuraDubboAdapter acuraDubboAdapter;
    @Autowired
    CurrentUserHolder currentUserHolder;

    /**
     * 讴歌登录后回传数据的解析和处理
     * @param cypherText 加密后的登录完成信息
     * @param response Http响应对象，控制后续跳转
     */
    @NoLogin
    @RequestMapping(value = "validate.htm", method = RequestMethod.GET)
    public void doLogin(@RequestParam(value = "ct", required = false) String cypherText, HttpServletResponse response) {
        try {
            if (StringUtils.isEmpty(cypherText)) {
                log.info("没有收到acura的密文");
                response.sendRedirect(acuraProperties.casLoginUrl());
                return;
            }
            AES aes = new AES(acuraProperties.getAppKey());
            String plainText = new String(aes.decrypt(Base64.decodeBase64(cypherText)), "UTF-8");
            JSONObject jsonObject = JSON.parseObject(plainText);
            String ticket = jsonObject.getString(AcuraProperties.TICKET_FILED);
            String unionId = jsonObject.getString(AcuraProperties.UNION_ID_FILED);
            String appId = acuraProperties.getAppId();
            // 调用acura的接口获得用户信息
            BizResult<Staff> bizResult = acuraDubboAdapter.findStaffBy(Long.valueOf(appId), Long.valueOf(unionId), ticket);
            if (bizResult == null) {
                log.info("从acura没有获取到员工信息");
                response.sendRedirect("/error.htm");
                return;
            }
            // 拿到用户信息后交给subaru去管理会话和权限
            if (bizResult.isSuccess()) {
                Staff staff = bizResult.getData();
                log.info("登录用户信息: " + JSON.toJSONString(staff));
                currentUserHolder.add(bizResult.getData());
            } else {
                log.warn("登录失败[info: {}]", JSON.toJSONString(bizResult));
            }
            String referrer = jsonObject.getString(AcuraProperties.REFERRER);
            if (StringUtils.isEmpty(referrer)) {
                response.sendRedirect("/center.htm");
            } else {
                response.sendRedirect(URLDecoder.decode(referrer, "UTF-8"));
            }
        } catch (Exception e) {
            log.error("处理登录操作异常", e);
            try {
                response.sendRedirect("/error.htm");
            } catch (IOException e1) {
                log.error("重定向异常", e);
            }
        }
    }

    /**
     * 登录界面
     * @param response 控制跳转到讴歌的登录界面
     */
    @NoLogin
    @RequestMapping(value = {"", "login.htm"}, method = RequestMethod.GET)
    public void login(HttpServletResponse response) {
        try {
            response.sendRedirect(acuraProperties.casLoginUrl());
        } catch (IOException e) {
            log.error("重定向异常");
        }
    }

    /**
     * 退出登录
     * @param response 控制跳转到讴歌的登录界面
     */
    @NoLogin
    @RequestMapping(value = "logout.htm", method = RequestMethod.GET)
    public void logout(HttpServletResponse response) {
        try {
            currentUserHolder.logout();
        } catch (Exception e) {
            log.error("登出操作发生异常", e);
        }
        // 虽然登出异常，但还是继续弹回到登录页面
        try {
            response.sendRedirect(acuraProperties.casLogoutUrl());
        } catch (IOException e) {
            log.error("重定向异常");
        }
    }

    /**
     * 主界面
     * @param modelMap 填充视图参数的对象
     * @return 主界面的视图
     */
    @NoPermission
    @RequestMapping(value = "center.htm", method = RequestMethod.GET)
    public String center(ModelMap modelMap) {
        Staff staff = currentUserHolder.get(Staff.class);
        if (staff == null) {
            modelMap.addAttribute("pageTitle", Constants.INDEX_NO_LOGIN_TIP);
        } else {
            modelMap.addAttribute("pageTitle", String.format(Constants.INDEX_LOGIN_TIP, staff.getNickname()));
        }
        return "center";
    }

    /**
     * 错误页面
     * @return 错误页面的视图
     */
    @NoLogin
    @RequestMapping(value = "error.htm", method = RequestMethod.GET)
    public String error() {
        return "error";
    }
}
