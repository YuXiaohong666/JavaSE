package com.Learning20.annotation.junit;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author yuxiaohong
 * @package com.Learning20.annotation.junit
 * @date 2023/8/16 10:48
 * @description
 */
public class JUnitTest {
    int number = 10;

    @Test
    public void test() {
        System.out.println("这是JUnit的单元测试");
    }

    @Test
    public void test2() {
        System.out.println("number = " + number);
    }

    @Test
    public void test3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数值：");
        int i = scanner.nextInt();
        System.out.println(i);
    }

    public void test5() {
        System.out.println();
    }
}
