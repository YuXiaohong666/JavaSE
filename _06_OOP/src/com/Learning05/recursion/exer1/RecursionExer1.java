package com.Learning05.recursion.exer1;

/**
 * @author yuxiaohong
 * @package com.Learning05.recursion.exer1
 * @date 2023/7/20 17:15
 * @description
 */
public class RecursionExer1 {
    // 练习1：
    // 已知一个数列，f(20)=1，f(21)=4，f(n+2)=2*f(n+1)+f(n)
    // 已知n是大于0的整数，求f(10)的值

    public static void main(String[] args) {
        RecursionExer1 res = new RecursionExer1();
        System.out.println(res.f(10));
    }

    public int f(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        } else {
            return f(n + 2) - 2 * f(n + 1);
        }
    }
}
