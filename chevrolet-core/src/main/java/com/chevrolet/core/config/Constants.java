package com.chevrolet.core.config;

/**
 * Created by maihe on 2017/5/25.
 */
public class Constants {
    //redis key过期时间
    public static final int redis_expire_time = 5*60;

    public static final int DEFAULT_OFFSET = 0;
    public static final int MAX_PAGE_SIZE = 10000;

    public static final Long UNASSIGNED_ASSET = -2l;

    public static final String INDEX_NO_LOGIN_TIP = "您还未登录，请先登录";
    public static final String INDEX_LOGIN_TIP = "您好，%s，欢迎使用";
}
