package com.Learning14.block;

/**
 * @author yuxiaohong
 * @package com.Learning14.block
 * @date 2023/8/4 15:14
 * @description 代码块测试类
 */
public class BlockTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
    }
}

class Person {
    String name;
    int age;

    public void eat() {
        System.out.println("人吃饭");
    }

    public Person() {
    }

    // 非静态代码块
    {
        System.out.println("非静态代码块1");
    }

    // 静态代码块
    static {
        System.out.println("静态代码块1");
    }
}
