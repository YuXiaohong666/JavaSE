package com.Learning03.field;

/**
 * @author yuxiaohong
 * @package com.Learning03.field
 * @date 2023/7/18 17:23
 * @description 成员变量与局部变量
 */
public class FieldTest {
    public static void main(String[] args) {

    }
}

class Person {
    // 属性，成员变量
    String name;
    int age;
    char gender;

    public void eat() {
        String food = "面条";  // 局部变量
        System.out.println("我喜欢吃：" + food);
    }

    public void sleep(int hour) {  // 形参，也属于局部变量

    }
}