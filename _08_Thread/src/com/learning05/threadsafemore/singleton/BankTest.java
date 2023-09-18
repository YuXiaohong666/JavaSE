package com.learning05.threadsafemore.singleton;

/**
 * @author yuxiaohong
 * @package com.learning05.threadsafemore.singleton
 * @date 2023/8/31 22:58
 * @description 实现线程安全的懒汉式
 */
public class BankTest {
    static Bank b1 = null;
    static Bank b2 = null;

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                b1 = Bank.getInstance();
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                b2 = Bank.getInstance();
            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(b1);
        System.out.println(b2);  // 可以看到两个地址值是相同的
        System.out.println(b1 == b2);  // true
    }
}

class Bank {
    private Bank() {

    }

    private static Bank instance = null;

    // 实现线程安全的方式1
    // public static synchronized Bank getInstance() {
    //     try {
    //         Thread.sleep(1000);  // 当睡眠时间够长，就会导致单例模式失效
    //     } catch (InterruptedException e) {
    //         e.printStackTrace();
    //     }
    //     if (instance == null) {
    //
    //         instance = new Bank();
    //     }
    //     return instance;
    // }

    // 实现线程安全的方式二
    public static Bank getInstance() {
        synchronized (Bank.class) {
            try {
                Thread.sleep(1000);  // 当睡眠时间够长，就会导致单例模式失效
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (instance == null) {

                instance = new Bank();
            }
            return instance;
        }
    }
}