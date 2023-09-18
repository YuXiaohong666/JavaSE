package com.Learning02.memory;

/**
 * @author yuxiaohong
 * @package com.Learning02.memory
 * @date 2023/7/18 14:27
 * @description Person测试类
 */
public class PersonTest {
    public static void main(String[] args) {

        // 创建对象\类的实例化
        Person p1 = new Person("小杰");
        p1.age = 23;
        p1.gender = '男';

        System.out.println("姓名：" + p1.name + "年龄：" + p1.age + "性别：" + p1.gender);
        p1.eat();
        p1.sleep();
        p1.interest("打游戏");
    }
}
