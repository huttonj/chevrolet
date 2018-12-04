package com.chevrolet.core.template;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import sun.misc.Cache;

/**
 * Created by maihe on 2017/5/25.
 */
@Slf4j
public class CacheTemplate {
    //防止缓存击穿的template方法
    public static <T> T getCache(Object lock,CacheBuilder<T> builder){
        try {
            T cache = builder.getCache();
            if(cache != null){
                return cache;
            }else{
                synchronized (lock){
                    cache = builder.getCache();
                    if(cache != null){return cache;}
                    cache = builder.init();
                    return cache;
                }
            }

        } catch (Exception e){
            log.error("CacheTemplate getCache方法报错 e={}",e.getMessage());
        }
        return null;
    }
    public interface CacheBuilder<T> {
        //从缓存中获取，支持应用缓存，redis
        T getCache();
        //重新init,数据init方式比较多，可能从db，磁盘，甚至是应用计算生成，这里做抽象处理
        T init();
    }
}

