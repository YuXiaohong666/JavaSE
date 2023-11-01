package com.learning02.selfdefine.exer3;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author yuxiaohong
 * @package com.learning02.selfdefine.exer3
 * @date 2023/11/1 18:29
 * @description
 */
public class Exer03 {
    public static <E> void method2(E[] e) {
        for (int i = 0, j = e.length - 1; i < j; i++, j--) {
            E temp = e[i];
            e[i] = e[j];
            e[j] = temp;
        }
    }

    @Test
    public void test1() {
        Integer arr[] = {1, 2, 3, 4, 5};
        method2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
