package com.Learning21.wrapper;

/**
 * @author yuxiaohong
 * @package com.Learning21.wrapper
 * @date 2023/8/16 18:20
 * @description
 */
public class WrapperTest {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(33);
        System.out.println(myInteger);
    }
}

class MyInteger {
    int value;

    public MyInteger() {
    }

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyInteger{" +
                "value=" + value +
                '}';
    }
}