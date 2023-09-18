package com.Learning08.override;

/**
 * @author yuxiaohong
 * @package com.Learning07.extend
 * @date 2023/7/28 9:17
 * @description
 */
public class Student extends Person {
    // String name;
    // int age;
    String school;

    // public void eat() {
    //     System.out.println("吃饭");
    // }


    @Override
    public void sleep() {
        super.sleep();
    }

    public void study() {
        System.out.println("学习");
    }
}
