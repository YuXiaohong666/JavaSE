package com.Learning02.memory;

/**
 * @author yuxiaohong
 * @package com.Learning02.memory
 * @date 2023/7/18 14:27
 * @description Person类
 */
public class Person {

    String name;
    int age;
    char gender;

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void interest(String hobby) {
        System.out.println("爱好：" + hobby);
    }

    public Person(String s) {
        name = s;
    }
}
