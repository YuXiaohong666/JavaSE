package com.Learning09.polymorphism;

/**
 * @author yuxiaohong
 * @package com.Learning09.polymorphism
 * @date 2023/7/28 17:37
 * @description 多态性测试
 */
public class PersonTest {
    public static void main(String[] args) {
        // 多态性之前的使用场景
        Person person = new Person();
        Man man = new Man();

        // 多态性：
        Person person1 = new Man();
        // 多态性的应用：虚拟方法调用
        /*
         *在多态的场景下，调用方法时
         *编译时：认为方法是左边声明的父类的类型
         *运行时：实际执行的是子类重写父类的方法
         *          * */
        person1.eat();  // 打印出来的是Man类中的方法
    }
}
