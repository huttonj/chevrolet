package com.chevrolet.web.interceptor;

import com.maihaoche.acura.api.model.Staff;
import com.mhc.subaru.validation.holder.CurrentUserHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by maihe on 2017/7/20.
 * tesla基础拦截器，主要用于返回数据中增加用户信息
 */
@Slf4j
public class ChevroletBaseInterceptor extends HandlerInterceptorAdapter {
    private final CurrentUserHolder currentUserHolder;

    public ChevroletBaseInterceptor(CurrentUserHolder currentUserHolder) {
        this.currentUserHolder = currentUserHolder;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        if (modelAndView != null) {
            modelAndView.getModelMap().addAttribute("staff", currentUserHolder.get(Staff.class));
        }
    }
}
