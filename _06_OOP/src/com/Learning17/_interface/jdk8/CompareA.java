package com.Learning17._interface.jdk8;

/**
 * @author yuxiaohong
 * @package com.Learning17._interface.jdk8
 * @date 2023/8/9 11:51
 * @description
 */
public interface CompareA {

    // jdk8中新定义的静态方法
    public static void method() {
        System.out.println("接口中的静态方法，只能接口自己调用，实现类无法调用");
    }

    // jdk8中新定义的接口默认方法
    public default void method1() {
        System.out.println("接口中的默认方法，实现类可以进行重写");
    }

    // jdk9中新定义的接口私有方法
    private void method2() {
        System.out.println("供接口自己使用");
    }
}
