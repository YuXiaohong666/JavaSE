package com.learning01.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author yuxiaohong
 * @package com.learning01.collection
 * @date 2023/9/27 18:56
 * @description 测试Collection中方法的使用
 */
public class CollectionTest {
    @Test
    public void test1() {
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add(123);  // 自动装箱
        coll.add("扫黄大队");
        coll.add(new Object());
        coll.add(new Person("Tom", 33));
        System.out.println(coll);


        Collection coll1 = new ArrayList();
        coll1.addAll(coll);
        System.out.println(coll1);
        System.out.println(coll.size());

        coll1.add(coll);
        System.out.println(coll1);
        System.out.println(coll1.size());
    }

    @Test
    public void test2() {
        Collection collection = new ArrayList();
        collection.add("Aa");
        // isEmpty()
        System.out.println(collection.isEmpty());
        // contains()
        System.out.println(collection.contains("Aa"));
        // containsAll(Collection other)，判断集合other中的元素是否在当前集合都存在
        Collection collection1 = new ArrayList();
        collection1.add("cc");
        System.out.println(collection.containsAll(collection1));
    }

    @Test
    public void test3() {
        String arr[] = new String[]{"AA", "BB", "CC"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);  //[AA,BB,CC]
    }
}
