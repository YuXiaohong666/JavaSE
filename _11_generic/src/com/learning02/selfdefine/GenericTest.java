package com.learning02.selfdefine;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author yuxiaohong
 * @package com.learning02.selfdefine
 * @date 2023/10/31 9:33
 * @description
 */
public class GenericTest {
    @Test
    public void test1() {
        Person person = new Person();

        ArrayList<String> list = new ArrayList<>();
    }

    // 测试自定义的泛型类
    @Test
    public void test2() {
        // 实例化时，就可以指明类的泛型参数类型
        Order order = new Order<>();

        Order<String> order1 = new Order<>();
        order1.setT("aka");
    }

    @Test
    public void test3() {

    }
}