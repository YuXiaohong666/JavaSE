package com.learning01.string;

import org.junit.Test;

/**
 * @author yuxiaohong
 * @package com.learning01.string
 * @date 2023/9/18 10:13
 * @description
 */
public class StringMethodTest1 {
    @Test
    public void test() {
        String s1 = "hello";
        String s2 = s1.replace('l', 'w');
        System.out.println(s1);
        System.out.println(s2);

        String s3 = s1.replace("ll", "wwww");
        System.out.println(s3);
    }
}
