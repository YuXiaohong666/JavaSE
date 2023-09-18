package com.geo.exer1;

/**
 * @author yuxiaohong
 * @package com.geo.exer1
 * @date 2023/7/12 18:08
 * @description 定义一个int的一维数组，包含10个元素，分别赋一些随机整数，然后求出相应的特征值，并输出出来。
 */
public class ArrayExer1 {
    public static void main(String[] args) {
        // 1.使用动态初始化方法初始化数组
        int arr[] = new int[10];
        // 2.通过循环给数组元素赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1)) + 10;
        }
        System.out.println("该数组中的元素为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // 3.1 求最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("该数组中最大值为：" + max);
        // 3.2 求最小值
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("该数组中最小值为：" + min);
        // 3.3 求总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("该数组中所有元素的总和为：" + sum);
        // 3.4 求平均值
        double avar = sum / arr.length;
        System.out.println("该数组中平均值为：" + avar);
    }

}
