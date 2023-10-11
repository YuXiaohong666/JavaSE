package com.learning04.set;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    @Test
    public void Test1() {
//        自然排序
        TreeSet treeSet = new TreeSet();
        treeSet.add("AA");
        treeSet.add("BB");
        treeSet.add("CC");
//        会报错
//        treeSet.add(123);

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void Test2() {
//        自然排序
        TreeSet treeSet = new TreeSet();
        treeSet.add(new User("小杰", 23));
        treeSet.add(new User("小红", 23));
        treeSet.add(new User("小民", 23));

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void Test3() {
//        定制排序
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User user1 = (User) o1;
                    User user2 = (User) o2;

                    int value = user1.getName().compareTo(user2.getName());
                    if (value != 0) {
                        return value;
                    }
                    return -(user1.getAge() - user2.getAge());
                }
                throw new RuntimeException("类型不匹配");
            }
        };
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.add(new User("小杰", 23));
        treeSet.add(new User("小红", 22));

        for (Object o : treeSet) {
            System.out.println(o);
        }
    }
}
