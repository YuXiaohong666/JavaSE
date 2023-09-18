package com.Learging10.object.equals;

import java.util.Objects;

/**
 * @author yuxiaohong
 * @package com.Learging10.object.equals
 * @date 2023/8/2 10:58
 * @description
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User("小红", 23);
        User user1 = new User("小红", 23);
        System.out.println(user.equals(user1));  // false，判断user和user1的地址值是否相同
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

    // 重写equals()

    // @Override
    // public boolean equals(Object obj) {
    //     // 如果地址一样，内容也肯定一样，直接返回true
    //     if (this == obj) {
    //         return true;
    //     }
    //     if (obj instanceof User) {
    //         User user = (User) obj;
    //         if (user.age == this.age && user.name.equals(this.name)) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }


    // // IDEA自动生成
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }
}