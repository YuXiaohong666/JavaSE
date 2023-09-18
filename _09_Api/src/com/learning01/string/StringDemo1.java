package com.learning01.string;

import org.junit.Test;

/**
 * @author yuxiaohong
 * @package com.learning01.string
 * @date 2023/9/14 9:34
 * @description
 */
public class StringDemo1 {
    @Test
    public void test() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");

        System.out.println(s1 == s2);  // true
        System.out.println(s1 == s3);  // false
        System.out.println(s3 == s4);  // false
    }

    @Test
    public void test1() {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        String s4 = "hello" + "world";

        // 通过字节码文件发现调用了StringBuilder的toString()方法--->new String()，所以和上面的字符串不是同一个地址
        String s5 = s1 + "world";
        String s6 = "hello" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);  // true
        System.out.println(s3 == s5);  // false
        System.out.println(s3 == s6);  // false
        System.out.println(s3 == s7);  // false
        System.out.println(s5 == s6);  // false
        System.out.println(s3 == s7);  // false

        // intern()：返回的是字符串常量池中字面量的地址
        String s8 = s5.intern();
        System.out.println(s3 == s8);  // true
    }

    @Test
    public void test2() {
        final String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        String s4 = "hello" + "world";

        // 通过字节码文件发现调用了StringBuilder的toString()方法--->new String()，所以和上面的字符串不是同一个地址
        String s5 = s1 + "world";
        String s6 = "hello" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s5);  // true，因为加了final之后就变成常量了，所以不会再去new新的对象了
    }

    @Test
    public void test3() {
        String s1 = "hello";
        String s2 = "world";
        String s3 = s1.concat(s2);
        String s4 = "hello".concat("world");
        String s5 = s1.concat("world");
        
        System.out.println(s3 == s4);  // false
        System.out.println(s3 == s5);  // false
        System.out.println(s4 == s5);  // false
    }
}
