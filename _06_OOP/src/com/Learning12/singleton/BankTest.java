package com.Learning12.singleton;

/**
 * @author yuxiaohong
 * @package com.Learning12.singleton
 * @date 2023/8/4 10:44
 * @description 单例模式，饿汉式
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = Bank.getBank();
    }
}

class Bank {
    // 类的构造器私有化，避免类的外部创建对象
    private Bank() {

    }

    // 在类的内部创建当前类的实例
    private static Bank bank = new Bank();

    // 使用get方法获取当前类的实例，必须声明为static
    public static Bank getBank() {
        return bank;
    }
}