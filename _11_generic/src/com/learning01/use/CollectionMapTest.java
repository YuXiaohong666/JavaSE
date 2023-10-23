package com.learning01.use;

import org.junit.Test;

import java.lang.invoke.DelegatingMethodHandle$Holder;
import java.util.*;

/**
 * @author yuxiaohong
 * @package com.learning01.use
 * @date 2023/10/23 18:28
 * @description
 */
public class CollectionMapTest {

    // 体会使用泛型之前的场景
    @Test
    public void test1() {
        // 体会使用泛型之前的场景
        List arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(13);
        arrayList.add(12);
        // 问题1：类型不安全，参数是Object类型，意味着任意的对象都可以放入该集合。
        arrayList.add("AA");

        // 问题2：需要强转操作，繁琐。还有可能导致ClassCastException异常。
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer i = (Integer) iterator.next();
            int score = i;

            System.out.println(score);
        }
    }

    // 在集合中使用泛型的例子
    @Test
    public void test2() {
        List<Integer> list = new ArrayList<Integer>();
        // 编译报错，保证类型的一致性
        // list.add("AA");

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            // 因为添加的都是Integer类型，避免了强转操作
            Integer i = iterator.next();
        }
    }

    // 泛型在Map中使用的例子
    @Test
    public void test3() {
        Map<String, Integer> map = new HashMap<String, Integer>();

        // jdk7的新特性：类型推断，不需要在右方写类型
        Map<String, Integer> map1 = new HashMap<>();

        map1.put("tom", 33);

    }
}
