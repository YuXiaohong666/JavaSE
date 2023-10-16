package com.learning05.map;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest {
    @Test
    public void Test1() {
        TreeMap map = new TreeMap();
        map.put("CC", 89);
        map.put("BB", 77);
        map.put("AA", 84);
        map.put("DD", 62);

        for (Object o : map.entrySet()) {
            System.out.println(o);
        }
    }

    @Test
    public void Test2() {
        TreeMap map = new TreeMap<>();
        map.put(new User("小杰", 23), 63);
        map.put(new User("小红", 22), 62);
        map.put(new User("效民", 21), 61);

        for (Object o : map.keySet()) {
            System.out.println(o);
        }
    }

    //    定制排序
    @Test
    public void Test3() {
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User u1 = (User) o1;
                    User u2 = (User) o2;

                    int value = u1.getName().compareTo(u2.getName());
                    if (value != 0) {
                        return value;
                    }
                    return u1.getAge() - u2.getAge();
                }
                throw new RuntimeException("类型不匹配");
            }
        };

        TreeMap map = new TreeMap(comparator);
        map.put(new User("小杰", 23), 63);
        map.put(new User("小红", 22), 62);
        map.put(new User("效民", 21), 61);

        for (Object o : map.keySet()) {
            System.out.println(o);
        }
    }
}
