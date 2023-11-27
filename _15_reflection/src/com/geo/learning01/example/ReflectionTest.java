package com.geo.learning01.example;

import org.junit.Test;

import java.lang.reflect.Constructor;
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
    // @Test
    // public void test() {
    //     Person tom = new Person("Tom", 23);
    //     System.out.println(tom.age);
    //     tom.show();
    // }

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
    @Test
    public void test3() throws Exception {
        // 1.调用私有的构造器创建Person的实例
        Class clazz = Person.class;
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class);
        // 因为构造器是私有的，所以会报没有访问权限的错误，通过下面这行代码解决
        declaredConstructor.setAccessible(true);
        Person p1 = (Person) declaredConstructor.newInstance("Tom", 12);

        // 2.调用私有的属性
        Field declaredField = clazz.getDeclaredField("name");
        declaredField.setAccessible(true);
        declaredField.set(p1, "jerry");

        // 3.调用私有的方法

        Method showName = clazz.getDeclaredMethod("showName", String.class);
        showName.setAccessible(true);
        String info = (String) showName.invoke(p1, "李晓杰");
        System.out.println(info);
    }
}
