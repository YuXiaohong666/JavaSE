package com.geo.learning01.lambda;

import org.junit.Test;

/**
 * @author yuxiaohong
 * @package com.geo.learning01.lambda
 * @date 2023/11/30 12:57
 * @description
 */
public class LambdaTest {
    @Test
    public void test1() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("123456");
            }
        };
        r1.run();

        System.out.println("************");

        // Lambda表达式的写法
        Runnable r2 = () -> {
            System.out.println("123456");
        };

        r2.run();
    }
}
