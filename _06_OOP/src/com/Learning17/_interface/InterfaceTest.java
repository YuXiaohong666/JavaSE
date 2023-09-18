package com.Learning17._interface;

/**
 * @author yuxiaohong
 * @package com.Learning17._interface
 * @date 2023/8/8 12:54
 * @description
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MIN_SPEED);
        System.out.println(Flyable.MAX_SPEED);
        plane plane = new plane();
        plane.fly();
    }
}

interface Flyable {
    // 全局常量
    public static final int MIN_SPEED = 0;
    // public static final可以省略
    int MAX_SPEED = 7900;

    // 方法，也可以省略public abstract
    public abstract void fly();
}

interface Attackable {
    void attack();
}

class plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("飞机可以飞");
    }
}