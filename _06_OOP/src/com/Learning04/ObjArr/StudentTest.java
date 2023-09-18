package com.Learning04.ObjArr;

/**
 * @author yuxiaohong
 * @package com.Learning04.ObjArr
 * @date 2023/7/18 18:43
 * @description 对象数组的使用
 */
public class StudentTest {
    public static void main(String[] args) {

        Student[] student = new Student[20];
        for (int i = 0; i < student.length; i++) {
            student[i] = new Student();
            student[i].number = i + 1;
            student[i].state = (int) (Math.random() * 6 + 1);
            student[i].score = (int) (Math.random() * 101);
        }

        // 需求1，打印出三年级（state=3）的学生的信息
        for (int i = 0; i < student.length; i++) {
            if (student[i].state == 3) {
                Student stu = student[i];
                System.out.println(stu.number);
            }
        }
    }
}
