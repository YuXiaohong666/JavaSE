package com.learning01.string;

import org.junit.Test;

/**
 * @author yuxiaohong
 * @package com.learning01.string
 * @date 2023/9/12 9:57
 * @description
 */
public class StringDemo {
    @Test
    public void test1() {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);  // true
    }

    @Test
    public void test2() {
        String s1 = "hello";
        String s2 = "hello";
        s2 = "h1";
        System.out.println(s1);  // hello
        System.out.println(s2);  // h1
    }

    @Test
    public void test3() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s2.replace('l', 'w');
        System.out.println(s1);  // hello
        System.out.println(s2);  // hello
        System.out.println(s3);  // hewwo
    }
}
