package com.learning04.lifecycle.exer1;

/**
 * @author yuxiaohong
 * @package com.learning04.lifecycle.exer1
 * @date 2023/8/31 13:36
 * @description
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        Customer customer1 = new Customer(account, "甲");
        Customer customer2 = new Customer(account, "乙");

        customer1.start();
        customer2.start();
    }
}

class Account {
    private double balance;  // 余额

    public synchronized void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "存钱1000元，余额为：" + balance);
    }
}

class Customer extends Thread {
    Account account = new Account();

    public Customer(Account acct) {
        this.account = acct;
    }

    public Customer(Account acct, String name) {
        super(name);
        this.account = acct;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.deposit(1000);
        }
    }
}