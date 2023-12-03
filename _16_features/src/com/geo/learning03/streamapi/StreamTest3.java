package com.geo.learning03.streamapi;

import com.geo.learning03.streamapi.data.Employee;
import com.geo.learning03.streamapi.data.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yuxiaohong
 * @package com.geo.learning03.streamapi
 * @date 2023/12/1 23:41
 * @description
 */
public class StreamTest3 {
    // 1.匹配与查找
    @Test
    public void test1() {
        // allMatch(Predicate p)，检查是否匹配所有元素
        // 练习，是否所有员工的年龄都大于18
        List<Employee> list = EmployeeData.getEmployees();
        System.out.println(list.stream().allMatch(employee -> employee.getAge() > 18));

        //anyMatch(Predicate p)，检查是否至少匹配一个元素
        //联系，是否至少有一个员工的年龄都大于23
        System.out.println(list.stream().anyMatch(employee -> employee.getAge() > 23));

        //findFirst()，返回第一个元素
        System.out.println(list.stream().findFirst());
    }

    @Test
    public void Test2() {
        //count，返回流中元素的总个数
        List<Employee> list = EmployeeData.getEmployees();
        System.out.println(list.stream().count());

        //max(Comparator c)返回流中的最大值
        System.out.println(list.stream().max(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge() - o2.getAge();
            }
        }));
        System.out.println(list.stream().max((o1, o2) -> o1.getAge() - o2.getAge()));
        System.out.println(list.stream().max(Comparator.comparingInt(Employee::getAge)));

        //min(Comparator c)，返回流中的最小值
        System.out.println(list.stream().min(((o1, o2) -> o1.getAge() - o2.getAge())));
        System.out.println(list.stream().min(Comparator.comparingInt(Employee::getAge)));

        //forEach(Comparator c)，内部迭代
        list.stream().forEach(System.out::println);

        //针对于集合，jdk8增加了一个遍历的方法
        list.forEach(System.out::println);
    }

    //归约
    @Test
    public void Test3() {
        //reduce(T identity, BinaryOperator)，可以将流中元素反复结合起来，得到一个值，返回T
        //练习：计算1-10的自然数的和
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list.stream().reduce(0, (x1, x2) -> x1 + x2));
        System.out.println(list.stream().reduce(0, (x1, x2) -> Integer.sum(x1, x2)));
        System.out.println(list.stream().reduce(0, Integer::sum));

        //reduce(BinaryOperator)，可以将流中的元素反复结合起来，得到一个值，返回Optional<T>
        //练习2：计算公司所有员工工资总和
        List<Employee> list1 = EmployeeData.getEmployees();
        System.out.println(list1.stream().map(employee -> employee.getSalary()).reduce((salar1, salary2) -> salar1 + salary2));
        System.out.println(list1.stream().map(Employee::getSalary).reduce(Double::sum));

    }

    //3.收集
    @Test
    public void Test4() {
        //collect(Colllector c)，将流转换为其他形式，接受一个Collector接口的实现，用于给Stream中元素做汇总的方法
        //练习1：查找工资大于6000的员工，结果返回为一个List或Set
        List<Employee> list = EmployeeData.getEmployees();
        System.out.println(list.stream().filter(employee -> employee.getSalary() > 250).collect(Collectors.toList()));

        //练习2：按照员工的年龄进行排序，返回到一个新的List中
        List<Employee> collect = list.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge()).collect(Collectors.toList());
        List<Employee> collect1 = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
