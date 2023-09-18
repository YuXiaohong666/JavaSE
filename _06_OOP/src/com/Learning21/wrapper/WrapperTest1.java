package com.Learning21.wrapper;

import org.junit.Test;

/**
 * @author yuxiaohong
 * @package com.Learning21.wrapper
 * @date 2023/8/17 19:02
 * @description String与包装类、基本数据类型之间的转换
 */
public class WrapperTest1 {
    // 基本数据类型、包装类转换为String类型：调用String的静态方法valueOf()
    @Test
    public void test() {
        int i1 = 10;
        String s = String.valueOf(i1);
        System.out.println(s);  //"10"，控制台打印的是没有引号的，实际上是有的

        boolean b1 = true;
        String s1 = String.valueOf(b1);
        System.out.println(s1);

        Float f1 = 12.3f;
        String s2 = String.valueOf(f1);
        System.out.println(s2);
    }

    @Test
    public void test1() {
        // String类型转换为基本数据类型、包装类：调用包装类的静态方法parseXxx()
        String s1 = "123";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1);
    }
}
