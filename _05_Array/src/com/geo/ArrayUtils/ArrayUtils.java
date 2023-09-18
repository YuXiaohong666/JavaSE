package com.geo.ArrayUtils;

import java.util.Arrays;

/**
 * @author yuxiaohong
 * @package com.geo.ArrayUtils
 * @date 2023/7/17 22:21
 * @description 数组的一些常用工具类
 */
public class ArrayUtils {
    public static void main(String[] args) {
        // 1.boolean equals(int[] a,int[] b)：比较两个数组元素是否依次相等
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        System.out.println(arr1 == arr2);  // false，因为数组中存的是地址值，所以两个数组就算元素都一致，但是使用双等号去依旧为false。

        boolean isEquals = Arrays.equals(arr1, arr2);
        System.out.println(isEquals);

        // 2.String toString(int[] a)：输出数组元素信息
        System.out.println(arr1);  //[I@16b98e56，直接打印数组会将数组存放的地址值打印出来
        System.out.println(Arrays.toString(arr1));  //[1, 2, 3, 4, 5]，会直接打印出数组元素来，不需要我们进行遍历

        // 3.void fill(int[] a,int val)：将指定值填充到数组当中
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));  //[10, 10, 10, 10, 10]将数组中全部的元素都替换为10

        // 4.void sort(int[] a)：使用快速排序算法实现的排序
        int[] arr3 = new int[]{1, 6, 5, 3, 9, 11, 54, 43, 99};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));  //[1, 3, 5, 6, 9, 11, 43, 54, 99]，可见成功进行了排序操作

        // 5.int binarySearch(int[] a,int k)：二分查找，使用前提，当前的数组必须是有序的
        int index = Arrays.binarySearch(arr3, 5);
        System.out.println(index);  // 2，正确找到并返回指定数字的下标，如果返回的是一个负数，则说明没有找到指定的数字


        /**数组的使用中，常见的异常小结：
         *
         * 数组角标越界的异常：ArrayIndexOutOfBoundsException
         * 空指针的异常：NullPointerException
         *
         * */


        // 空指针异常：
        // 情况1：
        // int[] arr4 = new int[10];
        // arr4 = null;
        // System.out.println(arr4[0]);

        // 情况2：
        int arr5[][] = new int[3][];
        System.out.println(arr5[0][1]);
    }

}
