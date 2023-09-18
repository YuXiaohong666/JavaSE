package com.Learning09.polymorphism.exer2;

/**
 * @author yuxiaohong
 * @package com.Learning09.polymorphism.exer2
 * @date 2023/8/1 14:16
 * @description
 */
public class Student extends Person {

    protected String school = "geo";

    public String getInfo() {
        return "Name：" + name + "\nage：" + age + "\nSchool：" + school;
    }
}
