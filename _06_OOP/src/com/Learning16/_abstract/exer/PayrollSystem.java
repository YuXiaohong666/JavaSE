package com.Learning16._abstract.exer;

import java.util.Scanner;

/**
 * @author yuxiaohong
 * @package com.Learning16._abstract.exer
 * @date 2023/8/8 11:36
 * @description
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[2];
        employees[0] = new SalariedEmployee("小红", 1001, new MyDate(2000, 2, 8), 10000);
        employees[1] = new HourlyEmployee("小杰", 1002, new MyDate(2000, 5, 4), 20, 210);
        System.out.println("请输入当前的月份：");
        int month = scanner.nextInt();

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
            System.out.println("工资为：" + employees[i].earning());
            if (month == employees[i].getBirthday().getMonth()) {
                System.out.println("生日快乐！");
            }
        }
        scanner.close();  // 关闭Scanner防止内存泄漏
    }
}
