package com.geo.learning02._class;

import org.junit.Test;

public class ClassTest {
    @Test
    public void Test1() throws ClassNotFoundException {
        //1.调用运行时类的静态属性
        Class<User> userClass = User.class;
        System.out.println(userClass);

        //2.调用运行时类的对象的getClass()
        User u1 = new User();
        Class user2 = u1.getClass();

        //3.调用Class的静态方法forName(String className)
        String className = "com.geo.learning02._class.User";
        Class<?> aClass = Class.forName(className);
        System.out.println(userClass == user2);  //true
        System.out.println(userClass == aClass);  //true

        //4.使用类的加载器
        Class<?> aClass1 = ClassLoader.getSystemClassLoader().loadClass("com.geo.learning02._class.User");
        System.out.println(aClass1 == userClass);  //true
    }
}
