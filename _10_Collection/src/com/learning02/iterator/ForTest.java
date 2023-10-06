package com.learning02.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author yuxiaohong
 * @package com.learning02.iterator
 * @date 2023/10/6 0:40
 * @description
 */
public class ForTest {
    @Test
    public void test1() {
        Collection collection = new ArrayList();
        collection.add("AA");
        collection.add("BB");
        collection.add("CC");

        for (Object obj : collection) {
            System.out.println(obj);
        }
    }

    @Test
    public void test2() {
        int[] arr = new int[]{1, 2, 3};
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
