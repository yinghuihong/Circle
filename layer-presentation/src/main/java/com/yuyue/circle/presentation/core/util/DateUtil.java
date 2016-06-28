package com.yuyue.circle.presentation.core.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yinghuihong on 16/5/16.
 */
public class DateUtil {


    /**
     * long to string
     *
     * @return 字符串 yyyyMMdd HHmmss
     */
    public static String longToString(long timeMills) {
        Date currentTime = new Date(timeMills);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = formatter.format(currentTime);
        return dateString;
    }

    /**
     * long to string
     *
     * @return 字符串 HH:mm
     */
    public static String longToString2(long timeMills) {
        Date currentTime = new Date(timeMills);
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        String dateString = formatter.format(currentTime);
        return dateString;
    }

}
