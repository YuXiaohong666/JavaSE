package com.learning06.collections;

import org.junit.Test;

import java.util.*;

/**
 * @author yuxiaohong
 * @package com.learning06.collections
 * @date 2023/10/23 11:00
 * @description
 */
public class CollectionsTest {
    /*
     * 排序
     * */
    @Test
    public void test1() {
        List<Integer> list = Arrays.asList(45, 12, 33, 87, 56);
        // reverse()，将集合中的内容进行翻转
        Collections.reverse(list);
        System.out.println(list);

        // shuffle()，将集合中的内容随机排序
        Collections.shuffle(list);
        System.out.println(list);

        // sort()，根据元素的自然排序对指定集合进行升序排序
        Collections.sort(list);
        System.out.println(list);

        // 根据Comparator指定的顺序进行排序
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 instanceof Integer && o2 instanceof Integer) {
                    Integer i1 = (Integer) o1;
                    Integer i2 = (Integer) o2;
                    return -(i1.intValue() - i2.intValue());
                }
                throw new RuntimeException("类型不匹配");
            }
        });
        System.out.println(list);

        // swap()：将集合中的i处和j处的元素互换
        Collections.swap(list, 0, 1);
        System.out.println(list);
    }

    /*
     * 查找
     * */
    @Test
    public void test2() {
        List<Integer> list = Arrays.asList(45, 12, 33, 87, 56);
        // max()，根据元素的自然顺序，返回给定集合当中的最大元素（排序之后最右边的元素）
        Integer max = Collections.max(list);
        System.out.println(max);
        // max()，根据Comparator指定的顺序，返回给定集合当中的最大元素
//         实际上下方这个Comparator排序之后，最右方的元素是最小值
        Integer max1 = Collections.max(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 instanceof Integer && o2 instanceof Integer) {
                    Integer i1 = (Integer) o1;
                    Integer i2 = (Integer) o2;
                    return -(i1.intValue() - i2.intValue());
                }
                throw new RuntimeException("类型不匹配");
            }
        });
        System.out.println(max1);

        // min()，返回集合中自然排序最小的元素
        Integer min = Collections.min(list);
        System.out.println(min);

        // min()，根据Comparator指定的顺序，返回最小值（集合中最左边的元素）

        // binarySearch(List list,T key)，在集合中查找某个元素的下标，但是List的元素必须是T或者T的子类
        int i = Collections.binarySearch(list, 23);
        System.out.println(i);
        // binarySearch(List list, T key, Comparator)

        // frequency(Collection collection, Object o)，返回指定集合当中指定元素的出现次数
        int frequency = Collections.frequency(list, 55);
        System.out.println(frequency);

    }

    /*
     * 复制、替换
     * */
    @Test
    public void test3() {
        List<Integer> list = Arrays.asList(45, 12, 33, 87, 56);
        // 错误的写法，会报异常
        // List dest = new ArrayList();
        // 正确的写法
        List<Object> dest = Arrays.asList(new Object[list.size()]);
        // copy()，将一个集合中的内容复制到另一个集合当中
        Collections.copy(dest, list);
        System.out.println(dest);

        // replaceAll()，使用新值替换list中的所有旧值
    }

    @Test
    public void test4() {
        // 提供了多个unmodifiableXxx()方法，该方法返回指定Xxx不可修改的视图
        // list可以写入数据
        List list = new ArrayList();
        list.add(34);
        list.add(22);
        list.add(12);

        // 返回的集合只能读不能写
        List list1 = Collections.unmodifiableList(list);
        list1.add(38);
    }

    /*
     * 添加、同步
     * */
    @Test
    public void test5() {
        // Collections.addAll()，将所有的指定元素添加到Collection中

        // Collections类中提供了多个SynchronizedXxx()方法
        List list = new ArrayList();
        // 此时，返回的list1就是线程安全的
        List list1 = Collections.synchronizedList(list);

    }
}

