package com.geo.learning03.streamapi;

import com.geo.learning03.streamapi.data.Employee;
import com.geo.learning03.streamapi.data.EmployeeData;
import org.junit.Test;

import java.util.List;

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
    }
}
