package com.Learning09.polymorphism;

/**
 * @author yuxiaohong
 * @package com.Learning09.polymorphism
 * @date 2023/7/28 17:19
 * @description
 */
public class Woman extends Person {
    boolean isBeauty;

    @Override
    public void eat() {
        System.out.println("女人吃饭");
    }

    @Override
    public void walk() {
        System.out.println("女人走路");
    }

    public void goShopping() {
        System.out.println("女人逛街");
    }
}
