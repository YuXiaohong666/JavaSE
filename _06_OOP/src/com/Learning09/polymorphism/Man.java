package com.Learning09.polymorphism;

/**
 * @author yuxiaohong
 * @package com.Learning09.polymorphism
 * @date 2023/7/28 17:19
 * @description
 */
public class Man extends Person {
    boolean isSmoke;

    @Override
    public void eat() {
        System.out.println("男人吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("男人睡觉");
    }

    public void earnMoney() {
        System.out.println("男人赚钱");
    }
}
