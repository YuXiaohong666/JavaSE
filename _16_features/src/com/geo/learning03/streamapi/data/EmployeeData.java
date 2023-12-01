package com.geo.learning03.streamapi.data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuxiaohong
 * @package com.geo.learning03.streamapi.data
 * @date 2023/12/1 18:18
 * @description
 */
public class EmployeeData {
    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1001, "小杰", 23, 266.5));
        list.add(new Employee(1002, "小李", 22, 213.5));
        list.add(new Employee(1003, "小红", 24, 278.6));
        return list;
    }
}
