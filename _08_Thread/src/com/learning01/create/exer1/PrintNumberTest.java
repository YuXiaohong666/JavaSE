package com.learning01.create.exer1;

/**
 * @author yuxiaohong
 * @package com.learning01.create.exer1
 * @date 2023/8/28 15:33
 * @description
 */
public class PrintNumberTest {
    public static void main(String[] args) {
        // EvenNumberPrint t1 = new EvenNumberPrint();
        // OddNumberTest t2 = new OddNumberTest();
        //
        // t1.start();
        // t2.start();

        // 方式2：创建Thread类的匿名子类的匿名对象
        new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();

    }
}

// 打印偶数
class EvenNumberPrint extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class OddNumberTest extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}