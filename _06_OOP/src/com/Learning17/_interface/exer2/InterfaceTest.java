package com.Learning17._interface.exer2;

/**
 * @author yuxiaohong
 * @package com.Learning17._interface.exer2
 * @date 2023/8/9 10:28
 * @description
 */
public class InterfaceTest {


    public static void main(String[] args) {
        ComparableCircle comparableCircle = new ComparableCircle(3.5);
        ComparableCircle comparableCircle1 = new ComparableCircle(3.6);
        System.out.println(comparableCircle.compareTo(123));

    }
}
