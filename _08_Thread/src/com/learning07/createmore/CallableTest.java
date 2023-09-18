package com.learning07.createmore;

import java.util.concurrent.Callable;

/**
 * @author yuxiaohong
 * @package com.learning07.createmore
 * @date 2023/9/6 17:46
 * @description
 */
public class CallableTest {
    public static void main(String[] args) {

    }
}

// 1.创建一个实现Callable的实现类
class NumThread implements Callable {
    // 2.实现call方法，将此线程需要执行的操作声明在call()中
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return sum;
    }
}