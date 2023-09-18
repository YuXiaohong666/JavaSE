package com.learning02.method_lifecycle;

/**
 * @author yuxiaohong
 * @package com.learning02.method_lifecycle
 * @date 2023/8/30 9:50
 * @description
 */
public class EvenNumberTest {
    public static void main(String[] args) {
        // 3.创建Thread的子类的对象
        PrintNumber t1 = new PrintNumber();

        // 4.通过对象调用start()
        t1.start();

        PrintNumber t2 = new PrintNumber();
        t2.start();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i + "***********************");
            }
        }

    }
}

// 1.创建一个继承于Thread类的子类
class PrintNumber extends Thread {
    // 2.重写Thread类中的run方法
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);  // 获取当前执行的线程的名字
            }
        }
    }
}