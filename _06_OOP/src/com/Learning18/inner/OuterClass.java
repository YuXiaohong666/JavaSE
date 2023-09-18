package com.Learning18.inner;

/**
 * @author yuxiaohong
 * @package com.Learning18.inner
 * @date 2023/8/9 13:49
 * @description
 */
public class OuterClass {
    public static void main(String[] args) {
        // 1.创建Person静态成员内部类的实例
        Person.Dog dog = new Person.Dog();
        dog.eat();

        // 创建Person的非静态的成员内部类的实例
        Person person = new Person();
        Person.Bird bird = person.new Bird();
        bird.eat();
        bird.show("jack");
        bird.show1();
    }
}

// 外部类
class Person {

    String name = "Tom";

    public void eat() {
        System.out.println("人吃饭");
    }


    // 静态的成员内部类
    static class Dog {
        public void eat() {
            System.out.println("狗可以啃骨头");
        }
    }

    // 非静态的成员内部类
    class Bird {
        String name = "Jerry";

        public void eat() {
            System.out.println("鸟吃虫子");
        }

        public void show(String name) {
            System.out.println("形参中的name" + name);
            System.out.println("Bird类中的name" + this.name);
            System.out.println("Person类中的name" + Person.this.name);
        }

        public void show1() {
            eat();
            this.eat();
            // 调用外部类的eat方法
            Person.this.eat();
        }
    }

    public void method() {
        // 方法中的局部内部类
        class InnerClass1 {

        }
    }

    public Person() {
        // 构造器中的局部内部类
        class InnerClass2 {

        }
    }
}