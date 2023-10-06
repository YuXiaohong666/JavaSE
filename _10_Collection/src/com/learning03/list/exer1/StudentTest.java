package com.learning03.list.exer1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 * @author yuxiaohong
 * @package com.learning03.list.exer1
 * @date 2023/10/6 14:58
 * @description
 */
public class StudentTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println("请输入数字以进行操作：1.继续录入 2.结束录入");
        Scanner scanner = new Scanner(System.in);
        while (scanner.nextInt() == 1) {
            System.out.println("继续录入...");
            System.out.println("请输入学生姓名：");
            String name = scanner.next();
            System.out.println("请输入学生年龄：");
            int age = scanner.nextInt();
            list.add(new Student(name, age));
            System.out.println("请输入数字以进行操作：1.继续录入 2.结束录入");
        }
        System.out.println("结束录入。");
        System.out.println("开始遍历数据...");
        for (Object o : list) {
            System.out.println(o);
        }
        scanner.close();
    }
}
