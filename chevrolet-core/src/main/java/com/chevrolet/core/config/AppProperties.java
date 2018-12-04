package com.chevrolet.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by maihe on 2017/7/20.
 */
@Data
@Component
@ConfigurationProperties(prefix = "spring.application")
public class AppProperties {
    private String name;
    private Integer expire;
}

