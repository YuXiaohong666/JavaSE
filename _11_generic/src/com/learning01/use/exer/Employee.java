package com.learning01.use.exer;

import java.util.Comparator;
import java.util.EnumMap;

/**
 * @author yuxiaohong
 * @package com.learning01.use.exer
 * @date 2023/10/24 9:16
 * @description
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public int compareTo(Employee o) {
        // 按照name从低到高进行排序
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
