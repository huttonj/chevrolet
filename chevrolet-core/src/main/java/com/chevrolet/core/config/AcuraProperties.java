package com.chevrolet.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

/**
 * Created by maihe on 2017/7/20.
 */
@Data
@Component
@ConfigurationProperties(prefix = "spring.acura")
public class AcuraProperties {
    public static final String TICKET_FILED = "ticket";     // 讴歌回传数据ticket的参数名称
    public static final String UNION_ID_FILED = "unionId";  // 讴歌回传数据unionId的参数名称
    public static final String REFERRER = "referrer";       // 讴歌回传需要跳转的地址

    private String casDomain;
    private String appKey;
    private String appId;

    public String casLoginUrl() throws UnsupportedEncodingException {
        return String.format("%s/verify.htm?appid=%s", casDomain, appId);
    }

    public String casLogoutUrl() throws UnsupportedEncodingException {
        return String.format("%s/logout.htm?appid=%s", casDomain, appId);
    }
}
