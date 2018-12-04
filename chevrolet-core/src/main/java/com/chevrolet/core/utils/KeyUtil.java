package com.chevrolet.core.utils;

import com.chevrolet.core.enums.PrefixEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maihe on 2017/5/25.
 */
public class KeyUtil {
    /**
     * 获取redis的值通过2个条件
     * @param id1 可能为系列Id或者品牌Id
     * @param id2 可能为0为查询国产,1为查询中规,2为查询美规,3为查询加规,4为查询中东,5为查询欧规
     * @param prefixEnum
     * @return
     */
    public static String getListKey(Object id1,Object id2,PrefixEnum prefixEnum) {
        return prefixEnum.getValue() + id1 + ":" + id2;
    }

    public static String getKey(Object id,PrefixEnum prefixEnum){
        return prefixEnum.getValue()+id;
    }

    public static String getPatternKey(PrefixEnum prefixEnum){
        return prefixEnum.getValue()+"*";
    }

    public static String getPatternKey(PrefixEnum prefixEnum,Object id) {
        return prefixEnum.getValue() + id + "*";
    }


    public static List<String> getKeys(List<Long> ids, PrefixEnum prefixEnum) {
        List<String> result = new ArrayList<String>();
        for (Long id : ids){
            String key = prefixEnum.getValue() + id;
            result.add(key);
        }
        return result;
    }

    /**
     * 传入天数，获取总共的秒数
     * @param days
     * @return
     */
    public static int getSecondByDays(int days){
        if(days>0){
            return 60*60*24*days;
        }return 0;
    }
}
