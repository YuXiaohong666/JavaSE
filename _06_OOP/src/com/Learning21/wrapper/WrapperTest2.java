package com.Learning21.wrapper;

import com.Learning14.block.BlockTest;
import org.junit.Test;

/**
 * @author yuxiaohong
 * @package com.Learning21.wrapper
 * @date 2023/8/16 18:57
 * @description 包装类和基本数据类型之间的转换
 */
public class WrapperTest2 {
    // 基本数据类型--->包装类，1.使用包装类的构造器   2.建议使用valueOf(xxx)
    @Test
    public void test1() {
        int i1 = 10;
        Integer i = new Integer(i1);
        System.out.println(i.toString());

        float f1 = 12.3F;
        Float ff1 = new Float(f1);
        System.out.println(ff1.toString());

        boolean b1 = true;
        Boolean bb1 = new Boolean(b1);
        System.out.println(bb1.toString());

        // 推荐使用
        Integer i2 = Integer.valueOf(i1);
        Boolean b = Boolean.valueOf(b1);
        Float v = Float.valueOf(f1);
        System.out.println(i2.toString() + b.toString() + v.toString());
    }

    // 包装类--->基本数据类型，调用包装类的xxxValue()实现
    @Test
    public void test2() {
        Integer i = new Integer(11);
        int i1 = i.intValue();
        System.out.println(++i1);

        Float f = new Float(12.3F);
        float f1 = f.floatValue();
        System.out.println(++f1);

        Boolean b = new Boolean(true);
        boolean b1 = b.booleanValue();
        System.out.println(b1 + "123");
    }

    // jdk5新特性：自动装箱、自动拆箱
    @Test
    public void test3() {
        // 自动装箱
        int i1 = 10;
        Integer ii1 = i1;
        System.out.println(ii1.toString());

        Boolean bb1 = true;
        Float f1 = 12.3F;

        // 自动拆箱
        int ii2 = ii1;
        System.out.println(ii2);
    }


}
