package com.geo.learning01.lambda;

import org.junit.Test;

import java.util.Comparator;

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

    @Test
    public void Test2() {
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };

        int compare1 = com1.compare(12, 21);
        System.out.println(compare1);

        System.out.println("*****************");

        //Lambda表达式的写法

        Comparator<Integer> com2 = ((o1, o2) -> Integer.compare(o1, o2));
        int compare2 = com2.compare(23, 21);
        System.out.println(compare2);

        System.out.println("***********************");

        //方法引用
        Comparator<Integer> com3 = Integer::compare;
        int compare3 = com3.compare(23, 21);
        System.out.println(compare3);
    }
}
