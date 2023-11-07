package com.learning03.more;

import org.junit.Test;

import java.util.List;

/**
 * @author yuxiaohong
 * @package com.learning03.more
 * @date 2023/11/6 18:53
 * @description
 */
public class GenericTest1 {
    @Test
    public void test1() {
        List<?> list = null;
        List<Object> list1 = null;
        List<String> list2 = null;

        list1.add("add");

        list = list1;
        // list = list2;

        // 只能写Object类型，不能写String类型，因为?是不确定类型，但肯定是Object类型，所以使用Object来接受
        Object o = list.get(0);

        // 写入数据
        // list.add("AA");  会报错
        // 特例：
        list.add(null);
    }

    // 测试，有限制条件的通配符的测试
    @Test
    public void test2() {

    }
}
