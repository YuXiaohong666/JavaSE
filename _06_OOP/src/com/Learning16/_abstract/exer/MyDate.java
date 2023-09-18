package com.Learning16._abstract.exer;

/**
 * @author yuxiaohong
 * @package com.Learning16._abstract.exer
 * @date 2023/8/8 11:05
 * @description
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toDataString() {
        return year + "年" + month + "月" + day + "日";
    }
}
