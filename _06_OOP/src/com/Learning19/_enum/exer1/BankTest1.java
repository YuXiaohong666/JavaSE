package com.Learning19._enum.exer1;

/**
 * @author yuxiaohong
 * @package com.Learning19._enum.exer1
 * @date 2023/8/15 23:00
 * @description
 */
public class BankTest1 {
}

// jdk5.0之前使用枚举类定义单例模式
class Bank1 {
    private Bank1() {

    }

    public static final Bank1 instance = new Bank1();
}

// jdk5.0之后使用枚举类定义单例模式

enum Bank2 {
    CPB;
}