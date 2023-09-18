package com.learning03.threadsafe.threadsafe;

/**
 * @author yuxiaohong
 * @package com.learning03.threadsafe.threadsafe
 * @date 2023/8/31 10:19
 * @description 使用同步方法解决继承Thread类中的线程安全问题
 */
public class WindowTest2 {
    public static void main(String[] args) {
        SaleTicket2 s1 = new SaleTicket2();
        SaleTicket2 s2 = new SaleTicket2();
        SaleTicket2 s3 = new SaleTicket2();

        s1.setName("窗口1");
        s2.setName("窗口2");
        s3.setName("窗口3");

        s1.start();
        s2.start();
        s3.start();
    }
}

class SaleTicket2 extends Thread {
    static int ticket = 100;
    static Boolean isFlag = true;

    @Override
    public void run() {

        while (isFlag) {
            show();
        }
    }

    public void show() {
        synchronized (SaleTicket2.class) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                ticket--;
            } else {
                isFlag = false;
            }
        }

    }
}
