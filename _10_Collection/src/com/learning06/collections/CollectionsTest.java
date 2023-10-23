package com.learning06.collections;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {
    @Test
    public void Test1() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//        反转list中的元素
        Collections.reverse(list);
        System.out.println(list);

//        打乱顺序
        Collections.shuffle(list);
        System.out.println(list);

//        使用自然排序
        Collections.sort(list);
        System.out.println(list);

//        定制排序，进行降序排列
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 instanceof Integer && o2 instanceof Integer) {
                    Integer i1 = (Integer) o1;
                    Integer i2 = (Integer) o2;

                    return -(i1 - i2);
                }
                throw new RuntimeException("类型不匹配");
            }
        });

        System.out.println(list);
    }

    @Test
    public void Test2() {
        List list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Object max = Collections.max(list);
        System.out.println(max);

        Collections.max(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Integer && o2 instanceof Integer) {
                    Integer i1 = (Integer) o1;
                    Integer i2 = (Integer) o2;

                    return -(i1 - i2);
                }
                throw new RuntimeException("类型不匹配");
            }
        });
        System.out.println(list);
    }
}
