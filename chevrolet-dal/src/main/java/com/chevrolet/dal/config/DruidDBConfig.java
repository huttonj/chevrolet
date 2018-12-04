package com.chevrolet.dal.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by chris on 17/2/16.
 */
@Configuration
@Data
@Slf4j
public class DruidDBConfig {
    @Bean("datasource")
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSource(){
        DataSource dataSource =  DataSourceBuilder.create().type(DruidDataSource.class).build();
        return dataSource;
    }
}
