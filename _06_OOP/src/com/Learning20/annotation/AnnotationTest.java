package com.Learning20.annotation;

/**
 * @author yuxiaohong
 * @package com.Learning20.annotation
 * @date 2023/8/15 23:29
 * @description
 */
public class AnnotationTest {
}

class Person {
    String name;
    int age;

    public void eat() {
        System.out.println("人吃饭");
    }
}

class Student extends Person {
    @Override
    public void eat() {
        System.out.println("学生吃饭");
    }
}