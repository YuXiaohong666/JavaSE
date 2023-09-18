package com.Learning01.throwable;

import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author yuxiaohong
 * @package com.Learning01.throwable
 * @date 2023/8/18 18:04
 * @description
 */
public class ExceptionTest {

    // java.lang.ArrayIndexOutOfBoundsException
    @Test
    public void test() {
        int arr[] = new int[10];
        System.out.println(arr[10]);
    }

    // java.lang.NullPointerException
    @Test
    public void test1() {
        // String str = "hello";
        // str = null;
        // System.out.println(str.toString());

        // int arr[] = new int[10];
        // arr = null;
        // System.out.println(arr[0]);

        int[][] arr1 = new int[10][];
        System.out.println(arr1[0][0]);
    }

    // java.lang.ClassCastException
    @Test
    public void test2() {
        Object obj = new String();
        Date date = (Date) obj;
    }

    // java.lang.NumberFormatException
    @Test
    public void test3() {
        String str = "123";
        str = "abc";
        int i = Integer.parseInt(str);
        System.out.println(i);
    }

    // java.util.InputMismatchException，输入了除数字之外的其他类型
    @Test
    public void test4() {
        try {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            // System.out.println("出现了InputMismatchException的异常");
            e.printStackTrace();
        }
        System.out.println("异常处理结束，代码继续执行");

    }

    // java.lang.ArithmeticException，算数异常
    @Test
    public void test5() {
        int num = 10;
        System.out.println(num / 0);
    }
    // 以上是运行时异常

    // java.lang.ClassNotFoundException
    @Test
    public void test6() {
        // Class clz = Class.forName("java.lang.String");
    }

    // java.io.FileNotFoundException
    @Test
    public void test7() {
        try {
            File file = new File("hello.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("读取数据结束");
    }
}
