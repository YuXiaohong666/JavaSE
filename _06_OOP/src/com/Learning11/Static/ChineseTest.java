package com.Learning11.Static;

/**
 * @author yuxiaohong
 * @package com.Learning11.Static
 * @date 2023/8/2 17:16
 * @description
 */
public class ChineseTest {
    public static void main(String[] args) {
        Chinese chinese = new Chinese("小红", 23);
        chinese.nation = "China";
        System.out.println(chinese.toString());
        Chinese chinese1 = new Chinese("小杰", 22);
        System.out.println(chinese1.toString());
        System.out.println(chinese.nation);  // China
        System.out.println(chinese1.nation);  // China
        Chinese.show();
        chinese1.show();
        chinese.show();
    }
}

class Chinese {
    // 非静态变量，实例变量
    String name;
    int age;
    // 静态变量，类变量
    static String nation;

    public Chinese(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void show() {
        System.out.println("我是一个中国人");
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
