package com.Learning09.polymorphism.exer3;

/**
 * @author yuxiaohong
 * @package com.Learning09.polymorphism.exer3
 * @date 2023/8/1 15:01
 * @description
 */
public class Man extends Person {
    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void toilet() {
        super.toilet();
    }

    public void smoke() {
        System.out.println("男人抽烟");
    }
}
