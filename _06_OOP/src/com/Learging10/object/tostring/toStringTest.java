package com.Learging10.object.tostring;

/**
 * @author yuxiaohong
 * @package com.Learging10.object.tostring
 * @date 2023/8/2 13:53
 * @description
 */
public class toStringTest {
    public static void main(String[] args) {
        User user = new User("小红", 23);
        System.out.println(user.toString());  // com.Learging10.object.tostring.User@7ef20235
        String s1 = new String("666");
        System.out.println(s1.toString());  // 666
    }
}

class User {
    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 手动重写toString()方法
    // public String toString() {
    //     return "User{ name = " + this.name + ", age = " + this.age + "}";
    // }

    // IDEA自动生成toString()重写方法
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}