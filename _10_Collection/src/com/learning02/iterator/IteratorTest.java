package com.learning02.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author yuxiaohong
 * @package com.learning02.iterator
 * @date 2023/10/5 23:38
 * @description
 */
public class IteratorTest {
    @Test
    public void test1() {
        Collection collection = new ArrayList();
        collection.add("AA");
        collection.add("BB");
        collection.add("CC");

        // 获取迭代器对象
        Iterator iterator = collection.iterator();
        // 方式一：
        // System.out.println(iterator.next());
        // System.out.println(iterator.next());
        // System.out.println(iterator.next());
        // 如果超出了集合中元素的个数，会报异常
        // System.out.println(iterator.next());

        // 方式二：采用循环
        // for (int i = 0; i < collection.size(); i++) {
        //     System.out.println(iterator.next());
        // }

        // 方式三：hasNext()
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
