package com.yuyue.circle.presentation.core.util;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by yinghuihong on 16/4/27.
 */
public class CalendarUtil {

    /**
     * 获取临界点时间
     *
     * @param index 0为当天24点,-1为前一天24点,1为后一天24点
     * @return 临界点时间
     */
    public static long getCriticalTime(int index) {
        Calendar calendar = Calendar.getInstance();  //得到日历
        calendar.setTime(new Date());//把当前时间赋给日历
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.add(Calendar.DAY_OF_MONTH, index);  //设置为前一天
        return calendar.getTimeInMillis();
    }
}
