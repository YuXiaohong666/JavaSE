package com.learning03.threadsafe.runnablesafe;

/**
 * @author yuxiaohong
 * @package com.learning03.threadsafe.runnablesafe
 * @date 2023/8/31 10:07
 * @description 使用同步方法的方式解决线程同步安全的问题
 */
public class WindowTest1 {
    public static void main(String[] args) {
        SaleTicket1 s = new SaleTicket1();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);


        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class SaleTicket1 implements Runnable {
    int ticket = 100;

    Boolean isFlag = true;

    @Override
    public void run() {
        while (isFlag) {
            show();
        }
    }

    public synchronized void show() {  // 此时的同步监视器是this
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
            ticket--;
        } else {
            isFlag = false;
        }
    }
}