package com.learning03.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    @Test
    public void Test1() {
        List list = new ArrayList();
        list.add("AA");
        list.add("bb");
        list.add("cc");
        System.out.println(list);

//        插入，在索引为1的位置插入ACC
        list.add(1, "ACC");
        System.out.println(list);
//        将list1中的所有元素插入到当前list中
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        list.addAll(list1);
        System.out.println(list);
//        将list1作为一个整体插入到当前list当中
        list.add(list1);
        System.out.println(list);
//        移除索引2的元素
        list.remove(2);
        System.out.println(list);
//        移除数据2,需要传的参数2必须是对象.才不会被识别为index
        list.remove(Integer.valueOf(2));
        System.out.println(list);

//        使用迭代器进行遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //使用iter快捷键可以快速创建foreach以对数组或集合进行迭代
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
