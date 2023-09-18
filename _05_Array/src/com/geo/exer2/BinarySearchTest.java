package com.geo.exer2;

/**
 * @author yuxiaohong
 * @package com.geo.exer2
 * @date 2023/7/14 16:20
 * @description 二分查找
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 5, 8, 12, 15, 19, 26, 37, 49, 51, 66, 89, 100};
        // 查找目标数
        int target = 5;
        // 默认的首索引
        int head = 0;
        // 默认的尾索引
        int end = arr.length - 1;
        // 是否找到了目标数
        boolean flag = false;
        while (head <= end) {
            // 记录中间数
            int middle = (head + end) / 2;
            if (arr[middle] == target) {
                flag = true;
                System.out.println("找到了" + target + "，在第" + (middle + 1) + "位上");
                break;
            } else if (arr[middle] < target) {
                head = middle + 1;
            } else if (arr[middle] > target) {
                end = middle - 1;
            }
        }
        if (!flag) {
            System.out.println("该数组中不存在" + target);
        }
    }
}
