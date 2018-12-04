package com.chevrolet.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author wenruo
 * @date 2017/7/11.
 */
@Configuration
@ImportResource("classpath:dubbo/dubbo-all.xml")
public class DubboConfiguration {
}
