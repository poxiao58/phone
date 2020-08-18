package com.poxiao.phone.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 时间工具类
 *
 * @author 李俊
 * @date 2019-01-15
 */
public class DateUtil {

    public final static SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public final static SimpleDateFormat sdfEsnTime = new SimpleDateFormat("yyyy-M-d HH:mm:ss");

    private static SimpleDateFormat sdf_date_format = new SimpleDateFormat("yyyy-MM-dd");
    private static SimpleDateFormat sdf_sfm_format = new SimpleDateFormat("HH:mm");

    /**
     * 获取当前时间的YYYY-MM-DD HH:mm:ss格式
     *
     * @return
     */
    public static String getTime() {
        return sdfTime.format(new Date());
    }

    public static String getTimes() {
        return sdf_date_format.format(new Date());
    }

    public static String getTimesBySf() {
        return sdf_sfm_format.format(new Date());
    }

    public static String getEsnTime() {
        return sdfEsnTime.format(new Date());
    }

    /**
     * 日期比较，如果s>=e 返回true 否则返回false
     *
     * @param s
     * @param e
     * @return
     */
    public static boolean compareDate(String s, String e) {
        if (fomatDate(s) == null || fomatDate(e) == null) {
            return false;
        }
//        return fomatDate(s).getTime() >=fomatDate(e).getTime();
        return s.compareTo(e) > 0;
    }

    public static boolean compareDates(String s, String e) {
        if (fomatStringToDate(s) == null || fomatStringToDate(e) == null) {
            return false;
        }
//        return fomatDate(s).getTime() >=fomatDate(e).getTime();
        return s.compareTo(e) > 0;
    }

    /**
     * 格式化日期
     *
     * @param date
     * @return
     */
    public static Date fomatDate(String date) {
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return fmt.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date fomatDateToHM(String date) {
        DateFormat fmt = new SimpleDateFormat("HH:mm");
        try {
            return fmt.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 格式化日期
     *
     * @param date
     * @return
     */
    public static Date fomatStringToDate(String date) {
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return fmt.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取当前时间的后i天
     *
     * @param i
     * @return
     */
    public static String getAddDay(int i) {
        String currentTime = DateUtil.getTime();
        GregorianCalendar gCal = new GregorianCalendar(
                Integer.parseInt(currentTime.substring(0, 4)),
                Integer.parseInt(currentTime.substring(5, 7)) - 1,
                Integer.parseInt(currentTime.substring(8, 10)));
        gCal.add(GregorianCalendar.DATE, i);
        return sdf_date_format.format(gCal.getTime());
    }

    /**
     * 获取当前时间的后i天
     * 精确到秒
     *
     * @param i
     * @return
     */
    public static String getAddDayTime(int i) {
        Date date = new Date(System.currentTimeMillis() + i * 24 * 60 * 60 * 1000);
        return sdfTime.format(date);
    }

    /**
     * 获取当前时间的+多少秒
     * 精确到秒
     *
     * @param i
     * @return
     */
    public static String getAddDaySecond(int i) {
        Date date = new Date(System.currentTimeMillis() + i * 1000);
        return sdfTime.format(date);
    }

    /**
     * @param lo 毫秒数
     * @return String yyyy-MM-dd HH:mm:ss
     * @Description: long类型转换成日期
     */
    public static String longToDate(long lo) {
        Date date = new Date(lo);
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sd.format(date);
    }

    public static void main(String[] args) {
//        System.out.println(DateUtil.getEsnTime());
//        boolean res = DateUtil.compareDate("17:00:00", DateUtil.getTimesBySf());
        System.out.println(DateUtil.getTimesBySf());
    }
}
