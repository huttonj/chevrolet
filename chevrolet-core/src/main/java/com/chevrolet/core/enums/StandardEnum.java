package com.chevrolet.core.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Muchan on 16/5/20.
 */
public enum StandardEnum {
    /**
     * 国产
     */
    MadeInChina("国产", 1 << 0),
    /**
     * 中规 1
     */
    China("中规", 1 << 1),
    /**
     * 美规 2
     */
    America("美规", 1 << 2),
    /**
     * 加规 3
     */
    Canada("加规", 1 << 3),
    /**
     * 中东 4
     */
    East("中东", 1 << 4),
    /**
     * 欧规 5
     */
    Europe("欧规", 1 << 5),

    /**
     * 墨西哥版 6
     */
    Mexico("墨西哥版", 1 << 6),

    /**
     * 中规车, 包括 MadeInChina + China
     */
    AllChina("中规", 100);

    private String desc;

    private Integer status;

    StandardEnum(String desc, Integer status) {
        this.desc = desc;
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public Integer getStatus() {
        return status;
    }

    public int value() {
        return this.status;
    }


    public static void main(String[] args) {
        //int a =  StandardEnum.MadeInChina.value()+StandardEnum.America.value();
        //System.out.println(((a&StandardEnum.Europe.value()) > 0));

        String[] star = getStandardValue(124);
        for (String str : star) {
            System.out.println(str);
        }
        //System.out.println(StandardEnum.America.getStatus());
    }

    public static Integer getStandard(Integer standard) {
        switch (standard) {
            case 0:
                return StandardEnum.MadeInChina.value();
            case 1:
                return StandardEnum.China.value();
            case 2:
                return StandardEnum.America.value();
            case 3:
                return StandardEnum.Canada.value();
            case 4:
                return StandardEnum.East.value();
            case 5:
                return StandardEnum.Europe.value();
            case 6:
                return StandardEnum.Mexico.value();
            default:
                return null;
        }
    }

    public static Integer getStandardByName(String spec) {
        if (!StringUtils.isBlank(spec)) {
            for (StandardEnum standard : values()) {
                if (standard.desc.equals(spec)) {
                    return standard.status;
                }
            }
        }
        return null;
    }

    public static String[] getStandardValue(Integer standard) {

        String result = "";
        if ((standard & StandardEnum.MadeInChina.value()) > 0) {
            result += ",0";
        }
        if ((standard & StandardEnum.China.value()) > 0) {
            result += ",1";
        }
        if ((standard & StandardEnum.America.value()) > 0) {
            result += ",2";
        }
        if ((standard & StandardEnum.Canada.value()) > 0) {
            result += ",3";
        }
        if ((standard & StandardEnum.East.value()) > 0) {
            result += ",4";
        }
        if ((standard & StandardEnum.Europe.value()) > 0) {
            result += ",5";
        }
        if ((standard & StandardEnum.Mexico.value()) > 0) {
            result += ",6";
        }

        return result.substring(1, result.length()).split(",");
    }

}
