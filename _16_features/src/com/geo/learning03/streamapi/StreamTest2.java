package com.geo.learning03.streamapi;

import com.geo.learning03.streamapi.data.Employee;
import com.geo.learning03.streamapi.data.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author yuxiaohong
 * @package com.geo.learning03.streamapi
 * @date 2023/12/1 21:59
 * @description
 */
public class StreamTest2 {
    // 1.筛选与切片
    @Test
    public void test1() {
        // filter(Predicate p)-接收Lambda，从流中排除某些元素
        // 查询工资表中薪资大于250的员工信息
        List<Employee> list = EmployeeData.getEmployees();
        Stream<Employee> stream = list.stream();
        stream.filter(emp -> emp.getSalary() > 250).forEach(System.out::println);

        // limit(n)截断流，使其元素不超过给定的数量
        list.stream().limit(2).forEach(System.out::println);

        // skip(n)-跳过元素，返回一个扔掉了前n个元素的流，若流中个数不足n个，则返回一个空流
        list.stream().skip(2).forEach(System.out::println);

        // distinct()，-筛选，去除重复的元素，需要重写equals和hashcode方法
        list.stream().distinct().forEach(System.out::println);
    }

    // 2.映射
    @Test
    public void test2() {
        // map(Function f)，接收一个函数作为参数，将元素转换为其他形式或提取信息，该函数会被应用到每个元素上
        // 练习，转换为大写
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        // 练习：获取员工姓名长度大于3的员工
        List<Employee> list1 = EmployeeData.getEmployees();
        list1.stream().filter(employee -> employee.getName().length() > 3).forEach(System.out::println);

        // 练习：获取员工姓名长度大于3的姓名
        list1.stream().filter(employee -> employee.getName().length() > 3).map(employee -> employee.getName()).forEach(System.out::println);
    }

    // 3.排序
    @Test
    public void test3() {
        // sorted()-自然排序
        Integer[] arr = new Integer[]{1, 5, 3, 4, 6, 8, 0, 2};
        String[] arr1 = new String[]{"gg", "ff", "cc", "xx"};

        // 自然排序
        Arrays.stream(arr).sorted().forEach(System.out::println);

        // 定制排序
        List<Employee> list = EmployeeData.getEmployees();
        list.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()).forEach(System.out::println);
        // 使用方法引用
        // list.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);
    }
}
