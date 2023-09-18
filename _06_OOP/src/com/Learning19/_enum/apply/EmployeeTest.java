package com.Learning19._enum.apply;

/**
 * @author yuxiaohong
 * @package com.Learning19._enum.apply
 * @date 2023/8/15 22:51
 * @description
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Tom", 23, Status.BUSY);
        System.out.println(employee);
    }
}
