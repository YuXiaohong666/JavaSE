package com.Learning07.extend.exer;

/**
 * @author yuxiaohong
 * @package com.Learning07.extend.exer
 * @date 2023/7/28 9:55
 * @description
 */
public class ManKind {
    private int sex;
    private int salary;

    public ManKind() {
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman() {
        if (sex == 1) {
            System.out.println("Man");
        } else if (sex == 0) {
            System.out.println("Woman");
        }
    }

    public void employed() {
        if (salary != 0) {
            System.out.println("job!");
        } else {
            System.out.println("no job");
        }
    }
}
