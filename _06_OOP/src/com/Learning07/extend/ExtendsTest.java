package com.Learning07.extend;

/**
 * @author yuxiaohong
 * @package com.Learning07.extend
 * @date 2023/7/28 9:19
 * @description 测试类
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "小杰";
        person.age = 23;
        person.eat();

        Student student = new Student();
        student.name = "小红";
        student.age = 23;
        student.eat();
    }
}
