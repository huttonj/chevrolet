package com.chevrolet.web.interceptor;

import com.chevrolet.core.config.ChevroletBaseConfiguration;
import com.chevrolet.core.config.AcuraProperties;
import com.mhc.subaru.validation.holder.CurrentUserHolder;
import com.mhc.subaru.validation.interceptor.IdentityInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by zhouxiaoliu on 2017/4/20.
 * 拦截器的配置
 */
@Configuration
@AutoConfigureAfter(ChevroletBaseConfiguration.class)
public class InterceptorConfig extends WebMvcConfigurerAdapter {
    @Autowired
    AcuraProperties chevroletProperties;
    @Autowired
    CurrentUserHolder currentUserHolder;

    @Bean
    public IdentityInterceptor identityInterceptor() {
        return new IdentityInterceptor(currentUserHolder, chevroletProperties.getAppId(), chevroletProperties.getCasDomain());
    }

    @Bean
    public ChevroletBaseInterceptor teslaBaseInterceptor() {
        return new ChevroletBaseInterceptor(currentUserHolder);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(identityInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/health.htm")
                .excludePathPatterns("/error.htm");
        registry.addInterceptor(teslaBaseInterceptor())
                .addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
