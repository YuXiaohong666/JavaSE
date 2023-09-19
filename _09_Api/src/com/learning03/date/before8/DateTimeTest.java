package com.learning03.date.before8;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author yuxiaohong
 * @package com.learning03.date.before8
 * @date 2023/9/19 9:29
 * @description
 */
public class DateTimeTest {
    @Test
    public void test() {
        Date date1 = new Date();  // 创建一个基于当前系统时间的Date的实例
        System.out.println(date1.toString());

        long time = date1.getTime();  // 获取当前时间的时间戳
        System.out.println("对应的毫秒数为：" + time);

        Date date2 = new Date(1675087138561L);  // 创建一个基于指定时间戳的Date的对象
        System.out.println(date2.toString());  // 可以打印出年月日时分秒
    }

    @Test
    public void test1() {
        // 因为在同一个类中已经使用了java.util.Date，所以这里需要写全类名
        java.sql.Date date = new java.sql.Date(1675087138561L);
        System.out.println(date.toString());  // 只能打印出年月日
    }

    @Test
    public void test2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        // 格式化：日期  --->  字符串
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println(format);

        // 解析：字符串  --->  日期
        Date parse = sdf.parse("2023/9/19 09:53");
        System.out.println(parse);
    }

    @Test
    public void test3() throws ParseException {
        // 以指定格式格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println(format);

        // 解析
        Date parse = sdf.parse("02023.九月.19 公元 10:01 上午");
        System.out.println(parse);
    }

    @Test
    public void test4() {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.getClass());

        // get(int field)
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));  // 19
        System.out.println(instance.get(Calendar.DAY_OF_WEEK));  // 3

        // set(int field, xx)
        instance.set(Calendar.DAY_OF_MONTH, 23);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));  // 23

        // add(int field, xx)
        instance.add(Calendar.DAY_OF_MONTH, 3);  // 加三天，可以为负数
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));  // 26

        // getTime()：Calendar ---> Date
        Date date = instance.getTime();
        System.out.println(date);

        // setTime()：使用指定的Date重置为Calender
        Date date1 = new Date();
        instance.setTime(date1);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
    }
}
