package com.Learning09.polymorphism.apply;

/**
 * @author yuxiaohong
 * @package com.Learning09.polymorphism.apply
 * @date 2023/7/31 14:40
 * @description 多态的实际应用
 */
public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
        animalTest.adopt(new Dog());          // Animal animal = new Dog()
        animalTest.adopt(new Cat());          // Animal animal = new Cat()
    }

    // 有了多态性，我们就不必单独为每一个类声明对应的方法，使代码更加简洁
    public void adopt(Animal animal) {
        animal.eat();
        animal.jump();
    }
}

class Animal {
    public void eat() {
        System.out.println("动物吃饭");
    }

    public void jump() {
        System.out.println("动物跳跃");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void jump() {
        System.out.println("狗跳");
    }

    public void watchDoor() {
        System.out.println("狗能看家");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void jump() {
        System.out.println("猫跳");
    }

    public void catchMouse() {
        System.out.println("猫能抓老鼠");
    }
}