package com.Learning16._abstract.exer;

/**
 * @author yuxiaohong
 * @package com.Learning16._abstract.exer
 * @date 2023/8/8 11:30
 * @description
 */
public class HourlyEmployee extends Employee {
    private double wage;  // 单位小时的工资
    private int hour;  // 月工作的小时数

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double earning() {
        return wage * hour;
    }

    public String toString() {
        return "HourlyEmployee[" + super.toString() + "]";
    }
}
