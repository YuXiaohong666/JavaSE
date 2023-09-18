package com.Learning16._abstract.template;

/**
 * @author yuxiaohong
 * @package com.Learning16._abstract.template
 * @date 2023/8/8 9:42
 * @description 抽象的应用：模板方法的设计模式
 */
public class TemplateTest {
    public static void main(String[] args) {
        PrintPrimeNumber printPrimeNumber = new PrintPrimeNumber();
        printPrimeNumber.spendTime();
    }
}

abstract class template {
    // 计算某段代码的执行花费的时间
    public void spendTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("执行此段代码花费的时间" + (end - start));
    }

    public abstract void code();
}

class PrintPrimeNumber extends template {
    @Override
    public void code() {
        for (int i = 2; i < 100000; i++) {
            boolean isFlag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break;
                }
            }
            if (isFlag) {
                System.out.println(i);
            }
        }
    }
}