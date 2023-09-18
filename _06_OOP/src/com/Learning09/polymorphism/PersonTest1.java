package com.Learning09.polymorphism;

/**
 * @author yuxiaohong
 * @package com.Learning09.polymorphism
 * @date 2023/7/31 16:16
 * @description
 */
public class PersonTest1 {
    public static void main(String[] args) {
        Person person = new Man();
        // 动态无法调用子类特有的方法
        // person.earnMoney();

        // 在强制转型之前先使用instanceof进行判断，避免出现类型转换异常
        if (person instanceof Man) {
            // 向下转型，使用强转符
            Man man = (Man) person;
            man.earnMoney();
            System.out.println(man.isSmoke);
        }

    }
}
