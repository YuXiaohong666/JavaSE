package com.learning01.create;

/**
 * @author yuxiaohong
 * @package com.learning01.create
 * @date 2023/8/28 14:29
 * @description
 */
public class EvenNumberTest {
    public static void main(String[] args) {
        // 3.创建Thread的子类的对象
        PrintNumber t1 = new PrintNumber("线程一");

        // 4.通过对象调用start()
        t1.start();

        PrintNumber t2 = new PrintNumber();
        t2.start();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i + "***********************");
            }

            if (i % 20 == 0) {
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}

// 1.创建一个继承于Thread类的子类
class PrintNumber extends Thread {

    public PrintNumber() {

    }

    public PrintNumber(String name) {
        super(name);
    }

    // 2.重写Thread类中的run方法
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            // sleep方法的使用
            // try {
            //     sleep(1000);
            // } catch (InterruptedException e) {
            //     throw new RuntimeException(e);
            // }
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);  // 获取当前执行的线程的名字
            }
            // if (i % 20 == 0) {
            //     Thread.yield();
            // }
        }
    }
}