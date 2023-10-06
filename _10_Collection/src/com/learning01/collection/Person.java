package com.learning01.collection;

/**
 * @author yuxiaohong
 * @package com.learning01.collection
 * @date 2023/10/5 0:42
 * @description
 */
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
