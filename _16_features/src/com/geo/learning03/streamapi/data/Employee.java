package com.geo.learning03.streamapi.data;

/**
 * @author yuxiaohong
 * @package com.geo.learning03.streamapi.data
 * @date 2023/12/1 18:19
 * @description
 */
public class Employee {
    int id;
    String name;
    int age;
    double salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

}
