package com.chevrolet.core.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 * something
 *
 * @author keben
 * @date 2017/6/27
 */
public class DateUtil {

    /**
     * 计算两个日期之间的天数
     *
     * @param smdate
     * @param bdate
     * @return
     * @throws ParseException
     */
    public static int daysBetween(Date smdate, Date bdate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        smdate = sdf.parse(sdf.format(smdate));
        bdate = sdf.parse(sdf.format(bdate));
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days = (time2 - time1) / (1000 * 3600 * 24);

        return Integer.parseInt(String.valueOf(between_days));
    }

    /**
     * 将localDateTime转成date
     *
     * @param ldt
     * @return
     */
    public static Date ofDate(LocalDateTime ldt) {
        if (ldt == null) {
            return null;
        } else {
            return Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
        }
    }
}
