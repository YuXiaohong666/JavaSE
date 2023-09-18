package com.learning03._throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author yuxiaohong
 * @package com.learning03._throws
 * @date 2023/8/22 10:20
 * @description
 */
public class ThrowTest {

    public static void main(String[] args) {
        method2();
    }

    public static void method2() {
        try {
            method1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void method1() throws FileNotFoundException {
        File file = new File("hello.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        System.out.println("读取数据结束");
    }
}
