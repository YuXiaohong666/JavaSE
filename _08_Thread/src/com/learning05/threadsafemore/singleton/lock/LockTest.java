package com.learning05.threadsafemore.singleton.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author yuxiaohong
 * @package com.learning05.threadsafemore.singleton.lock
 * @date 2023/9/5 22:19
 * @description
 */
public class LockTest {
    public static void main(String[] args) {
        SaleTicket1 s1 = new SaleTicket1();
        SaleTicket1 s2 = new SaleTicket1();
        SaleTicket1 s3 = new SaleTicket1();

        s1.setName("窗口1");
        s2.setName("窗口2");
        s3.setName("窗口3");


        s1.start();
        s2.start();
        s3.start();
    }
}

class SaleTicket1 extends Thread {
    static int ticket = 100;

    // 1.创建lock的实例，需要确保多个线程共用一个Lock，需要将这个对象声明为static
    private static ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {

        while (true) {


            try {
                // 2.执行lock方法，锁定对共享资源的调用
                lock.lock();
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {    // 为了确保unlock一定会被执行，所以要放在finally中
                // 3.调用unlock，释放对共享数据的锁定
                lock.unlock();
            }


        }
    }
}
