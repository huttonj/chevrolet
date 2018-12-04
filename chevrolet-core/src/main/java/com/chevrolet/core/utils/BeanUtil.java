package com.chevrolet.core.utils;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by suclogger on 16/5/23.
 */
public class BeanUtil extends  BeanUtils{
    static Object[] EMPTY_PARAM = new Object[0];
    static Map<Class<?>, Map<String, Method>> methodCache = new ConcurrentHashMap<Class<?>, Map<String,Method>>(20);

    public static <T> T copyPorp2DO(Class<T> destClaz, Object obi) throws RuntimeException {
        try {
            T destObj = destClaz.newInstance();
            BeanUtils.copyProperties(obi, destObj);
            return destObj;
        } catch (Exception e) {
            throw new RuntimeException("Copy prop error.", e);
        }
    }

    public static <T,V> List<V> copyPorp2DOs(Class<V> destClaz, List<T> obis) throws RuntimeException {
        try {
            if(CollectionUtils.isEmpty(obis)){
                return null;
            }
            List<V> list = Lists.newArrayList();
            V destObj = null;
            for (Object obi : obis) {
                destObj = destClaz.newInstance();
                BeanUtils.copyProperties(obi, destObj);
                list.add(destObj);
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException("Copy prop error.", e);
        }
    }

    public static <T,V> List<V> copyPorp2DOs(Class<V> destClaz, List<T> obis, IConvert<V,T> iConvert) throws RuntimeException {
        try {
            if(CollectionUtils.isEmpty(obis)){
                return null;
            }
            List<V> list = Lists.newArrayList();
            V destObj = null;
            for (T obi : obis) {
                destObj = destClaz.newInstance();
                BeanUtils.copyProperties(obi, destObj);
                iConvert.convert(destObj,obi);
                list.add(destObj);
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException("Copy prop error.", e);
        }
    }

    //对批量复制的特殊字段做处理
    public interface IConvert<V, T> {
        void convert(V v,T t);
    }

    public static <T> T createCloneBean(Object obi, Class<T> destClaz) {
        try {
            T destObj = destClaz.newInstance();
            BeanUtils.copyProperties(obi, destObj);
            return destObj;
        } catch (Exception e) {
            throw new RuntimeException("Copy prop error.", e);
        }

    }

    public static void  copyNonNullProperties(Object target, Object in) {
        if (in == null || target == null || target.getClass() != in.getClass()) {
            return;
        }

        final BeanWrapper src = new BeanWrapperImpl(in);
        final BeanWrapper trg = new BeanWrapperImpl(target);

        for (final Field property : target.getClass().getDeclaredFields()) {
            Object providedObject = src.getPropertyValue(property.getName());
            if (providedObject != null && !(providedObject instanceof Collection<?>)) {
                trg.setPropertyValue(
                        property.getName(),
                        providedObject);
            }
        }
    }

    public static void copyProperties(Object source, Object target){
        BeanUtils.copyProperties(source, target);
    }

    //入参全部非空
    public static Boolean paramNotNull(Object... objects){
        for (Object obj : objects) {
            if(obj == null){
                return false;
            }
        }
        return true;
    }
}
