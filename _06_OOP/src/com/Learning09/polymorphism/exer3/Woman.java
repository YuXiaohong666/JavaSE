package com.Learning09.polymorphism.exer3;

/**
 * @author yuxiaohong
 * @package com.Learning09.polymorphism.exer3
 * @date 2023/8/1 15:03
 * @description
 */
public class Woman extends Person {
    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void toilet() {
        super.toilet();
    }

    public void makeup() {
        System.out.println("女人化妆");
    }
}
