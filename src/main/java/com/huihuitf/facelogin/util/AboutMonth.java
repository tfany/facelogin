package com.huihuitf.facelogin.util;

import java.util.Calendar;
import java.util.Date;

public class AboutMonth {
    /**
     * 得到n个月前的第一天
     * @param amount 月份
     * @return date对象
     */
    public static Date getFirstDay(int amount){
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, -amount);
        c.set(Calendar.DAY_OF_MONTH, 1);//设置为1号,当前日期既为本月第一天
        //将小时至0
        c.set(Calendar.HOUR_OF_DAY, 0);
        //将分钟至0
        c.set(Calendar.MINUTE, 0);
        //将秒至0
        c.set(Calendar.SECOND,0);
        //将毫秒至0
        c.set(Calendar.MILLISECOND, 0);
        // 获取本月第一天的时间戳
        return new Date(c.getTimeInMillis());
    }

    /**
     * n月前的最后一天
     * @param amount 月数
     * @return date对象
     */
    public static Date getLastDay(int amount){
        //获取当前月最后一天
        Calendar ca = Calendar.getInstance();
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
        ca.add(Calendar.MONTH,-amount);
        //将小时至0
        ca.set(Calendar.HOUR_OF_DAY, 23);
        //将分钟至0
        ca.set(Calendar.MINUTE, 59);
        //将秒至0
        ca.set(Calendar.SECOND,59);
        //将毫秒至0
        ca.set(Calendar.MILLISECOND, 999);
        // 获取本月最后一天的时间戳
        return new Date(ca.getTimeInMillis());
    }

    public static void main(String[] args) {
        System.out.println(getFirstDay(3));
        System.out.println(getLastDay(4));
    }
}
