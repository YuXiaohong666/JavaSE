package com.learning04._throw;

/**
 * @author yuxiaohong
 * @package com.learning04._throw
 * @date 2023/8/22 11:23
 * @description
 */
public class ThrowTest {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.regist(-12);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("程序结束");
    }
}

class Student {
    int id;

    public void regist(int id) {
        if (id > 0) {
            System.out.println(this.id = id);
        } else {
            // System.out.println("id不能为负");
            // 手动抛出异常类的对象
            throw new RuntimeException("id不能为负");
        }

    }
}