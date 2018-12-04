package com.chevrolet.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by suclogger on 2017/6/13.
 */
@ConfigurationProperties(prefix = "chevrolet")
public class ChevroletProperties {

    /**
     * dubbo服务版本号,默认值为空
     */
    private String version = "";

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
