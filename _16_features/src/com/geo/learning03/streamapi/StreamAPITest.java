package com.geo.learning03.streamapi;

import com.geo.learning03.streamapi.data.Employee;
import com.geo.learning03.streamapi.data.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author yuxiaohong
 * @package com.geo.learning03.streamapi
 * @date 2023/12/1 18:17
 * @description
 */
public class StreamAPITest {
    // 1.创建Stream方式一：通过集合
    @Test
    public void test1() {
        List<Employee> list = EmployeeData.getEmployees();
        // default Stream<E> stream()，返回一个顺序留
        Stream<Employee> stream = list.stream();
        // default Stream<E> parallelStream()，返回一个并行流
        Stream<Employee> employeeStream = list.parallelStream();
        System.out.println(stream);
        System.out.println(employeeStream);
    }

    // 2.创建Stream方式二：通过数组
    @Test
    public void test2() {
        // 调用Arrays类的static<T> Stream<T> stream(T[] array)：返回一个流
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        Stream<Integer> stream = Arrays.stream(arr);
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        IntStream stream1 = Arrays.stream(arr1);
    }

    // 3.创建Stream方式三：通过Stream的of()
    @Test
    public void test3() {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
    }
}
