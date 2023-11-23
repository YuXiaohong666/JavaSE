package com.geo.learning01.example;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author yuxiaohong
 * @package com.geo.learning01.example
 * @date 2023/11/22 18:35
 * @description
 */
public class ReflectionTest {

    // 之前使用的创建对象的方法
    @Test
    public void test() {
        Person tom = new Person("Tom", 23);
        System.out.println(tom.age);
        tom.show();
    }

    // 使用反射实现
    @Test
    public void test2() throws Exception {
        // 1.创建Person类的实例
        Class<Person> person = Person.class;
        Person person1 = person.newInstance();
        System.out.println(person1);

        // 2.调用属性
        Field ageField = person.getField("age");
        ageField.set(person1, 10);
        System.out.println(ageField.get(person1));

        // 3.调用方法
        Method showMethod = person.getMethod("show");
        showMethod.invoke(person1);
    }

    /*出了Person类之后*/
}
