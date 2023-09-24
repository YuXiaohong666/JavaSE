package com.learning04.compare.comparable;

import com.learning04.compare.Product;
import org.junit.Test;

import java.util.Arrays;

public class ComparableTest {
    @Test
    public void Test1() {
        String[] arr = new String[]{"Tom", "Jerry", "Tony", "Rose", "Jack", "Lucy"};
//        默认从小到大排序
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void Test2() {
        Product[] arr = new Product[5];
        arr[0] = new Product("HuaWeiMate60Pro", 6999);
        arr[1] = new Product("Xiaomi13Pro", 4999);
        arr[2] = new Product("VivoX90", 5999);
        arr[3] = new Product("iPhone14ProMax", 9999);
        arr[4] = new Product("HonorMagic4", 6299);

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
