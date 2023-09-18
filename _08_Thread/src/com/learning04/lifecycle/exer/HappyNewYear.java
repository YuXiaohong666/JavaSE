package com.learning04.lifecycle.exer;

/**
 * @author yuxiaohong
 * @package com.learning04.lifecycle.exer
 * @date 2023/8/31 12:03
 * @description
 */
public class HappyNewYear {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i > 0) {
                System.out.println(i);
            } else {
                System.out.println("新年快乐！");
            }

        }
    }
}
