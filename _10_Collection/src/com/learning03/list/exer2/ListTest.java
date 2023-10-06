package com.learning03.list.exer2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author yuxiaohong
 * @package com.learning03.list.exer2
 * @date 2023/10/6 15:18
 * @description
 */
public class ListTest {
    public static void main(String[] args) {
        // 需求1，随机生成30个字符存放在ArrayList当中
        List list = new ArrayList();
        for (int i = 0; i < 30; i++) {
            // 'a'-'z' [97,122]
            list.add((char) (Math.random() * (122 - 97 + 1) + 97) + "");
        }
        System.out.println(list);
        // 需求2，遍历ArrayList，查找指定元素出现的次数
        System.out.println("a元素出现的次数是：" + listTest(list, "a"));
        System.out.println("b元素出现的次数是：" + listTest(list, "b"));
        System.out.println("c元素出现的次数是：" + listTest(list, "c"));
        System.out.println("x元素出现的次数是：" + listTest(list, "x"));
    }

    public static int listTest(Collection list, String s) {
        int count = 0;
        for (Object o : list) {
            if (o.equals(s))
                count++;
        }
        return count;
    }
}
