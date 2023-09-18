package com.learning03.threadsafe.notsafe;

/**
 * @author yuxiaohong
 * @package com.learning03.threadsafe.notsafe
 * @date 2023/8/30 16:56
 * @description
 */
public class WindowTest1 {
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
    int ticket = 100;

    @Override
    public void run() {

        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}
