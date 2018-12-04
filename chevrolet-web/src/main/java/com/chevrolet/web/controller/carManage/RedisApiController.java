package com.chevrolet.web.controller.carManage;

import com.alibaba.fastjson.JSON;
import com.chevrolet.core.wrapper.RedisWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redisManage")
@Slf4j
public class RedisApiController {

    @Autowired
    private RedisWrapper redisWrapper;

//    //get
//    @RequestMapping("/get.json")
//    public Object get(RedisApiParamDTO redisApiParamDTO){
//        try {
//            log.info("RedisApiController get redisApiParamDTO={}", JSON.toJSONString(redisApiParamDTO));
//            String key = redisApiParamDTO.getKey();
//            return redisWrapper.getString(key);
//        } catch (Exception e){
//            log.error("RedisApiController set e={}",e);
//            return "fail";
//        }
//    }
//
//
//    //get
//    @RequestMapping("/set.json")
//    public Object set(RedisApiParamDTO redisApiParamDTO){
//        try {
//            log.info("RedisApiController set redisApiParamDTO={}", JSON.toJSONString(redisApiParamDTO));
//            String key = redisApiParamDTO.getKey();
//            String value = redisApiParamDTO.getValue();
//            redisWrapper.putJson(key,value);
//        } catch (Exception e){
//            log.error("RedisApiController set e={}",e);
//            return "fail";
//        }
//        return "success";
//    }
//
//
//    //get
//    @RequestMapping("/del.json")
//    public Object del(RedisApiParamDTO redisApiParamDTO){
//        try {
//            log.info("RedisApiController del redisApiParamDTO={}", JSON.toJSONString(redisApiParamDTO));
//            String key = redisApiParamDTO.getKey();
//            redisWrapper.delete(key);
//        } catch (Exception e){
//            log.error("RedisApiController del e={}",e);
//            return "fail";
//        }
//        return "success";
//    }







}
