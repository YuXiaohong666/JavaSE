package com.Learning16._abstract.exer;

/**
 * @author yuxiaohong
 * @package com.Learning16._abstract.exer
 * @date 2023/8/8 11:13
 * @description
 */
public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public abstract double earning();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toDataString() +
                '}';
    }
}
