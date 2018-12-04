package com.chevrolet.core.config;

import com.google.gson.Gson;
import com.mhc.subaru.session.common.SessionIdGeneratorWithSnowFlake;
import com.mhc.subaru.session.common.SessionWithCookie;
import com.mhc.subaru.snowflake.SnowFlake;
import com.mhc.subaru.snowflake.SnowFlakeFactory;
import com.mhc.subaru.snowflake.WorkIdGeneratorWithRedis;
import com.mhc.subaru.validation.holder.impl.CurrentUserHolderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;

/**
 * Created by maihe on 2017/7/20.
 * tesla基础的配置，主要是会话管理和权限配置
 */
@Configuration
public class ChevroletBaseConfiguration {
    @Autowired
    AppProperties appProperties;

    @Autowired
    private JedisPool jedisPool;

    @Bean
    public Gson gson() {
        return new Gson();
    }

    @Bean
    public WorkIdGeneratorWithRedis workIdGeneratorWithRedis() {
        return new WorkIdGeneratorWithRedis(jedisPool, appProperties.getName());
    }

    @Bean
    public SnowFlake snowFlake() throws Exception {
        return new SnowFlakeFactory(this.workIdGeneratorWithRedis()).getObject();
    }

    @Bean
    public SessionIdGeneratorWithSnowFlake sessionIdGeneratorWithSnowFlake() throws Exception {
        return new SessionIdGeneratorWithSnowFlake(this.snowFlake());
    }

    @Bean
    public SessionWithCookie sessionWithRedis() throws Exception {
        return new SessionWithCookie(appProperties.getExpire(), appProperties.getName(),
                this.sessionIdGeneratorWithSnowFlake(), jedisPool);
    }

    @Bean
    public CurrentUserHolderImpl currentUserHolder() throws Exception {
        return new CurrentUserHolderImpl(this.sessionWithRedis(), this.gson());
    }
}