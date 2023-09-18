package com.Learning16._abstract.exer;

/**
 * @author yuxiaohong
 * @package com.Learning16._abstract.exer
 * @date 2023/8/8 11:18
 * @description
 */
public class SalariedEmployee extends Employee {
    private double monthlySalary;  // 月工资

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earning() {
        return monthlySalary;
    }

    public String toString() {
        return "SalariedEmployee[" + super.toString() + "]";
    }
}
