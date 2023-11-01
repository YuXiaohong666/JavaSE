package com.learning02.selfdefine.exer2;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author yuxiaohong
 * @package com.learning02.selfdefine.exer2
 * @date 2023/11/1 18:19
 * @description
 */
public class Exer02 {
    public static <E> void method(E[] e, int a, int b) {
        E temp = e[a];
        e[a] = e[b];
        e[b] = temp;
    }

    @Test
    public void test1() {
        String[] arr = new String[]{"AA", "Bb", "CC"};
        method(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
}
