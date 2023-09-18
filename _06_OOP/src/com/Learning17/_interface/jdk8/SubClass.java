package com.Learning17._interface.jdk8;

import com.Learning17._interface.exer2.CompareObject;

/**
 * @author yuxiaohong
 * @package com.Learning17._interface.jdk8
 * @date 2023/8/9 11:54
 * @description
 */
public class SubClass implements CompareA {
    @Override
    public void method1() {
        System.out.println("实现类进行重写后的默认方法");
    }
}
