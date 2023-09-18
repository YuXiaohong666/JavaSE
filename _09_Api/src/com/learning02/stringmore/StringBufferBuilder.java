package com.learning02.stringmore;

import org.junit.Test;

public class StringBufferBuilder {

    @Test
    public void Test1() {
        StringBuilder sBuilder = new StringBuilder();
        StringBuilder append = sBuilder.append("abc").append(123).append("def");  //方法链调用
        System.out.println(append);
    }

    @Test
    public void Test2() {
        StringBuilder stringBuilder = new StringBuilder("hello");
        stringBuilder.insert(2, 1);
        System.out.println(stringBuilder);
    }

    @Test
    public void Test3() {
        StringBuilder stringBuilder = new StringBuilder("hello");
        stringBuilder.setLength(2);
        System.out.println(stringBuilder);
        stringBuilder.setLength(10);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.charAt(6) == 0);  //true，说明将长度增加之后会用0填充
    }
}
