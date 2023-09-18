package com.learning03.threadsafe.threadsafe;

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
    static int ticket = 100;

    @Override
    public void run() {
        // 使用ctrl+alt+t选择包围方式
        synchronized (SaleTicket1.class) {  // 结构：Class alz = SaleTicket1.class，是唯一的。
            while (true) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
