package com.geo.learning01.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaTest1 {
    // 语法格式一：无参，无返回值
    @Test
    public void Test1() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("123");
            }
        };

        r1.run();
        System.out.println("******************");


        Runnable r2 = () -> {
            System.out.println("123456");
        };

        r2.run();
    }

    // 语法格式二：Lambda需要一个参数，但没有返回值
    @Test
    public void Test2() {
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        con.accept("123456");
        System.out.println("****************");

        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("54163415");
    }

    // 语法格式三：数据类型可以省略，因为可由编译器推断得出，称为“类型推断”
    @Test
    public void Test3() {
        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("zxcv");

        System.out.println("****************");

        Consumer<String> con2 = (s) -> {
            System.out.println(s);
        };
        con2.accept("bbb");
    }

    // 语法格式四：Lambda若只需要一个参数时，参数的小括号可以省略
    @Test
    public void Test4() {
        Consumer<String> con1 = s -> {
            System.out.println(s);
        };
        con1.accept("asdasd");
    }

    // 语法格式五：Lambda需要两个或以上的参数，多条执行语句，并且可以有返回值
    @Test
    public void test5() {
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };
        System.out.println(com1.compare(22, 33));

        System.out.println("*********************");

        Comparator<Integer> com2 = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };

        System.out.println(com2.compare(22, 33));
    }

    // 语法格式六：当Lambda体只有一条语句时，return与大括号若有，则都可以省略
    @Test
    public void test6() {
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o1.compareTo(o2);
            }
        };

        System.out.println("*************************");
        Comparator<Integer> com2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(com2.compare(32, 26));
    }
}
