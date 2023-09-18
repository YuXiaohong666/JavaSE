package com.learning01.create.runnable;

/**
 * @author yuxiaohong
 * @package com.learning01.create.runnable
 * @date 2023/8/28 16:31
 * @description
 */
public class EvenNumberTest {
    public static void main(String[] args) {
        // 3.创建当前实现类的对象
        EvenNumberPrint p = new EvenNumberPrint();
        // 4.将此对象作为参数传递给Thread对象
        new Thread(p).start();

        // main方法对应的主线程执行的操作
        for (int i = 1; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

// 1.创建一个实现Runnable接口的类
class EvenNumberPrint implements Runnable {
    // 2.实现接口中的run()
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}