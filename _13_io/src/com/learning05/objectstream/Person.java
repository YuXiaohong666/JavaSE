package com.learning05.objectstream;

import java.io.Serializable;

/**
 * @author yuxiaohong
 * @package com.learning05.objectstream
 * @date 2023/11/21 14:44
 * @description
 */
public class Person implements Serializable {  // 标识接口，没有任何需要重写的方法，表示对象是可以序列化的
    private static final long serialVersionUID = 42234234L;
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
