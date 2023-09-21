package com.learning03.date.jdk8;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * @author yuxiaohong
 * @package com.learning03.date.jdk8
 * @date 2023/9/21 9:53
 * @description
 */
public class DateTimeTest {
    // jdk8中的api，LocalDate, LocalTime, LocalDateTime
    @Test
    public void test1() {
        // now()：获取当前日期和时间对应的实例
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);  // 2023-09-21
        System.out.println(localTime);  // 10:26:25.292232800
        System.out.println(localDateTime);  // 2023-09-21T10:26:25.292232800

        // of()：获取指定日期时间对应的实例
        LocalDate localDate1 = LocalDate.of(2021, 5, 3);
        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 12, 5, 11, 23, 45);
        System.out.println(localDate1);  // 2021-05-03
        System.out.println(localDateTime1);  // 2022-12-05T11:23:45

        // get相关的操作
        LocalDate localDate2 = LocalDate.now();
        System.out.println(localDate2.getDayOfMonth());  // 21

        LocalDate localDate3 = localDate2.withDayOfMonth(15);
        // 体现了新日期api的不可变性，更改日期之后会返回一个新的对象，之前的日期本身不会更改
        System.out.println(localDate2);  // 2023-09-21
        System.out.println(localDate3);  // 2023-09-15

    }

    // Instant()
    @Test
    public void test2() {
        Instant now = Instant.now();
        System.out.println(now);  // 2023-09-21T02:39:50.395129800Z得到的是格林尼治标准时间，与北京相差八小时
        // 通过时区偏移量得到正确的本地时间
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);  // 2023-09-21T10:41:28.807036+08:00

        Instant instant = Instant.ofEpochMilli(24123123312L);
        System.out.println(instant);
    }

    // DateTimeFormatter的使用
    @Test
    public void test3() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();

        // 格式化：日期时间  -->  字符串
        String format = dateTimeFormatter.format(localDateTime);
        System.out.println(format);

        // 解析：字符串  -->  日期时间
        TemporalAccessor parse = dateTimeFormatter.parse("2023-09-21 10:49:44");
        System.out.println(parse);
    }
}
