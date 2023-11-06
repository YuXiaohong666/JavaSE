package com.learning03.more;

import org.junit.Test;

import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yuxiaohong
 * @package com.learning03.more
 * @date 2023/11/6 18:07
 * @description
 */
public class GenericTest {
    @Test
    public void test1() {
        Object obj = null;
        String str = null;
        obj = str;  // 给予继承性的多态的使用


    }


    @Test
    public void test2() {
        ArrayList<Object> list1 = null;
        ArrayList<String> list2 = null;
        /*
         不可以
         list1 = list2;
        */
    }

    @Test
    public void test4() {
        List<String> list1 = null;
        ArrayList<String> list2 = null;
        list1 = list2;
    }
}
