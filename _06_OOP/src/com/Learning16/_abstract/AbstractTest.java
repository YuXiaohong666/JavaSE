package com.Learning16._abstract;

/**
 * @author yuxiaohong
 * @package com.Learning16._abstract
 * @date 2023/8/4 18:55
 * @description 抽象类测试类
 */
public class AbstractTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.eat();
    }
}

// 抽象类
abstract class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 抽象方法，大括号都不能保留
    public abstract void eat();

    public void sleep() {
        System.out.println("人睡觉");
    }
}

class Student extends Person {
    String school;

    public Student() {
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    @Override
    public void eat() {
        System.out.println("学生吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("学生睡觉");
    }
}