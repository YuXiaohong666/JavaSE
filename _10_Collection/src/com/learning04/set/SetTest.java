package com.learning04.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author yuxiaohong
 * @package com.learning04.set
 * @date 2023/10/6 15:57
 * @description
 */
public class SetTest {
    @Test
    public void test1() {
        Set set = new HashSet();
        set.add("aa");
        set.add("bb");
        set.add("cc");
        set.add("dd");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
