package com.learning01.use.exer;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author yuxiaohong
 * @package com.learning01.use.exer
 * @date 2023/10/24 10:59
 * @description
 */
public class EmployeeTest {
    @Test
    public void test1() {
        Employee e1 = new Employee("小红", 23, new MyDate(2000, 2, 8));
        Employee e2 = new Employee("小杰", 23, new MyDate(2000, 4, 30));
        Employee e3 = new Employee("效民", 22, new MyDate(2001, 8, 22));
        Employee e4 = new Employee("佳诚", 23, new MyDate(2000, 6, 20));
        Employee e5 = new Employee("小菜", 22, new MyDate(2001, 3, 23));

        Set<Employee> set = new TreeSet<>();

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2() {
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int year = o1.getBirthday().getYear() - o2.getBirthday().getYear();
                if (year != 0) {
                    return year;
                }
                int month = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
                if (month != 0) {
                    return month;
                }
                int day = o1.getBirthday().getDay() - o2.getBirthday().getDay();
                if (day != 0) {
                    return day;
                }
                return 0;
            }
        };
        Set<Employee> set = new TreeSet<>(comparator);
        Employee e1 = new Employee("小红", 23, new MyDate(2000, 2, 8));
        Employee e2 = new Employee("小杰", 23, new MyDate(2000, 4, 30));
        Employee e3 = new Employee("效民", 22, new MyDate(2001, 8, 22));
        Employee e4 = new Employee("佳诚", 23, new MyDate(2000, 6, 20));
        Employee e5 = new Employee("小菜", 22, new MyDate(2001, 3, 23));
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
