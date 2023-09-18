package com.Learning18.inner;

/**
 * @author yuxiaohong
 * @package com.Learning18.inner
 * @date 2023/8/14 18:37
 * @description 局部内部类的使用
 */
public class OuterClassTest1 {
    public void method1() {
        // 局部内部类
        class A {
            // 可以声明属性、方法等

        }
    }

    // 开发中的场景
    public Comparable getInstance() {
        // 提供了实现了Comparable接口的实例
        // 方式1：提供了接口的实现类的匿名对象
        // class MyComparable implements Comparable {
        //     @Override
        //     public int compareTo(Object o) {
        //         return 0;
        //     }
        // }
        // return new MyComparable();

        // 方式2：提供了接口的匿名实现类的实现对象
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
