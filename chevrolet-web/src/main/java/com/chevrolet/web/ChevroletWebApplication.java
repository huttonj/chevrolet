package com.chevrolet.web;

import com.camaro.starter.mq.annotation.EnableMQConfiguration;
import com.mhc.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by maihe on 2017/7/6.
 */
@SpringBootApplication
@EnableDubboConfiguration
@EnableTransactionManagement
@ComponentScan(basePackages="com.chevrolet")
@ImportResource("classpath:chevrolet-all.xml")
@EnableDiscoveryClient
@EnableMQConfiguration
public class ChevroletWebApplication {
    public static void main(String[] args){
        SpringApplication.run(ChevroletWebApplication.class,args);
    }
}

