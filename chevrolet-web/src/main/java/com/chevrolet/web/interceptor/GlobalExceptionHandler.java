package com.chevrolet.web.interceptor;

import com.alibaba.fastjson.JSON;
import com.mhc.subaru.validation.exception.SessionExpiredException;
import com.subaru.common.entity.BizResult;
import com.subaru.common.entity.ErrorCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by yipin on 2017/5/11.
 * 全局异常处理器
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class) // 处理一切异常
    public void defaultExceptionHandle(HttpServletRequest request, HttpServletResponse response, Exception e) {
        if (e instanceof SessionExpiredException) {
            // 如果是会话失效的异常，直接登出
            try {
                response.sendRedirect("/logout.htm");
            } catch (IOException e1) {
                log.error("登出异常");
            }
            return;
        }
        log.error("发生未捕获的异常[url = {}]", request.getRequestURL(), e);
        int index = request.getRequestURI().lastIndexOf(".");
        String suffix = "";
        if (index > 0) {
            suffix = request.getRequestURI().substring(index);
        }
        if (".json".equals(suffix)) {
            // json请求返回json格式数据
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json; charset=utf-8");
            BizResult teslaBizResult = new BizResult<>();
            teslaBizResult.setCode(ErrorCodeEnum.EXCEPTION.getErrCode());
            teslaBizResult.setMessage(ErrorCodeEnum.EXCEPTION.getErrMsg());
            String json = JSON.toJSONString(teslaBizResult);
            Writer writer = null;
            try {
                writer = response.getWriter();
                writer.write(json);
                writer.flush();
            } catch (IOException e1) {
                log.error("返回json请求处理结果异常", e1);
            } finally {
                if (writer != null) {
                    try {
                        writer.close();
                    } catch (IOException ioe) {
                        log.error("关闭输出流异常", ioe);
                    }
                }
            }
        } else {
            try {
                response.sendRedirect("/error.htm");
            } catch (IOException e1) {
                log.error("返回除json以外的请求处理结果异常", e1);
            }
        }
    }
}
