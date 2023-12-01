package com.geo.learning01.lambda.fuction;

import org.junit.Test;

/**
 * @author yuxiaohong
 * @package com.geo.learning01.lambda.fuction
 * @date 2023/12/1 12:03
 * @description
 */
public class MyFunctionalInterfaceTest {
    @Test
    public void test1() {
        MyFunctionalInterface my = () -> System.out.println("abc");
        my.option();
    }
}
