package com.Learning09.polymorphism.exer2;

/**
 * @author yuxiaohong
 * @package com.Learning09.polymorphism.exer2
 * @date 2023/8/1 14:16
 * @description
 */
public class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name:" + name + "\n" + "age:" + age;
    }
}
