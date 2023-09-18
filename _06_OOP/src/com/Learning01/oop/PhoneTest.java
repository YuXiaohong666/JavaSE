package com.Learning01.oop;

/**
 * @author yuxiaohong
 * @package com.Learning01.oop
 * @date 2023/7/18 14:07
 * @description
 */
public class PhoneTest {  // Phone类的一个测试类
    public static void main(String[] args) {

        // 创建Phone对象
        Phone p1 = new Phone();

        // 通过Phone的对象，调用其内部声明的属性或者方法
        // 格式：对象.属性或者对象.方法
        p1.name = "huawei p30";
        p1.price = 4000;

        System.out.println("name=" + p1.name + ",price=" + p1.price);

        // 调用方法
        p1.call();
        p1.playGame();
        p1.sendMessage("你好");
    }
}
