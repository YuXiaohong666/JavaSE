package com.learning05.map;

import org.junit.Test;

import java.util.*;

public class MapTest {
    @Test
    public void Test1() {
        Map map = new HashMap();
        map.put(null, null);
        System.out.println(map);
    }

    @Test
    public void Test2() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tom", 33);
        linkedHashMap.put("tom", 33);
        linkedHashMap.put("aaa", 45);

        System.out.println(linkedHashMap);
    }

    //    测试map中的常用方法
    @Test
    public void Test3() {
        Map map = new HashMap();
//        添加
        map.put("aa", 56);
        map.put("bb", 56);
        map.put("cc", 56);
        System.out.println(map);
//删除
        Object aa = map.remove("aa");
        System.out.println(map);
        System.out.println(aa);

//        修改
        map.put("bb", 88);
        System.out.println(map);

//        遍历key集
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        遍历value集
        Collection collection = map.values();
        for (Object o : collection) {
            System.out.println(o);
        }

//遍历key-vaule集
        Set set1 = map.entrySet();
        for (Object o : set1) {
            System.out.println(o);
        }
    }

}
