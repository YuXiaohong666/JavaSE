package com.learning06.communication;

/**
 * @author yuxiaohong
 * @package com.learning06.communication
 * @date 2023/9/6 10:33
 * @description 使用两个线程打印1-100，两个线程交替打印
 */
public class PrintNumberTest {
    public static void main(String[] args) {
        PrintNumber p1 = new PrintNumber();
        Thread t1 = new Thread(p1, "线程一");
        Thread t2 = new Thread(p1, "线程二");

        t1.start();
        t2.start();
    }
}

class PrintNumber implements Runnable {
    private static int number = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                notify();
                if (number <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        // 线程一旦执行此方法，就会进入等待状态，同时会释放对同步监视器的调用
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}