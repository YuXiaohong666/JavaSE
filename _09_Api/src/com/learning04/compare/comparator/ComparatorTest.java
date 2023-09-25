package com.learning04.compare.comparator;

import com.learning04.compare.Product;
import org.junit.Test;

import java.nio.DoubleBuffer;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author yuxiaohong
 * @package com.learning04.compare.comparator
 * @date 2023/9/25 9:40
 * @description
 */
public class ComparatorTest {
    @Test
    public void test1() {
        Product[] arr = new Product[5];
        arr[0] = new Product("HuaWeiMate60Pro", 6999);
        arr[1] = new Product("Xiaomi13Pro", 4999);
        arr[2] = new Product("VivoX90", 5999);
        arr[3] = new Product("IPhone14ProMax", 9999);
        arr[4] = new Product("HonorMagic4", 6299);

        // 创建一个实现了comparator接口的实现类对象
        Comparator comparator = new Comparator() {
            // 如何判断两个对象的大小，其标准就是此方法的方法体要编写的逻辑
            // 如：按照价格从低到高进行排序
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Product && o2 instanceof Product) {
                    Product p1 = (Product) o1;
                    Product p2 = (Product) o2;

                    return Double.compare(p1.getPrice(), p2.getPrice());
                }
                throw new RuntimeException("类型不匹配");
            }
        };
        // 将数组arr按照comparator进行排序
        Arrays.sort(arr, comparator);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 按名字进行排序
        Comparator comparator1 = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Product && o2 instanceof Product) {
                    Product p1 = (Product) o1;
                    Product p2 = (Product) o2;

                    // 实现降序排列只需要在return后加个负号即可
                    return p1.getName().compareTo(p2.getName());
                }
                throw new RuntimeException("类型不匹配");
            }
        };

        Arrays.sort(arr, comparator1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // 将该数组降序排列
    @Test
    public void test2() {
        String[] arr = new String[]{"Tom", "Jerry", "Tony", "Rose", "Jack", "Lucy"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("类型不匹配");
            }
        });

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
