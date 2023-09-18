package com.Learning09.polymorphism.exer2;

/**
 * @author yuxiaohong
 * @package com.Learning09.polymorphism.exer2
 * @date 2023/8/1 14:16
 * @description 建立InstanceTest类，在类中定义方法method(Person e)，在method中，根据e的类型调用相应类的getInfo方法，
 * 根据e的类型执行：
 * 如果e为Person类的对象，输出：a person
 * 如果e为Student类的对象，输出：a student  a person
 * 如果e为Graduate类的对象，则输出：a graduate student a student a person
 */

public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest instanceTest = new InstanceTest();
        instanceTest.method(new Person());
    }

    public void method(Person e) {
        System.out.println(e.getInfo());
        if (e instanceof Graduate) {
            System.out.println("a graduate student");
            System.out.println("a student");
            System.out.println("a person");
        } else if (e instanceof Student) {
            System.out.println("a student");
            System.out.println("a person");
        } else {
            System.out.println("a person");
        }
    }
}
