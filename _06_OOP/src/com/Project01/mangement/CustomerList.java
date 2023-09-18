package com.Project01.mangement;

/**
 * @author yuxiaohong
 * @package com.Project01.mangement
 * @date 2023/7/27 16:31
 * @description 是客户类的管理模块，内部使用数组管理一组Customer对象
 */
public class CustomerList {
    private Customer[] customers;// 用于保存客户对象的数组
    private int total = 0;// 用于记录用户的数量

    // 构造器，用来初始化customers数组
    public CustomerList(int totalCustomer) {     // 参数就是，客户的数量，作为数组的长度
        customers = new Customer[totalCustomer];
    }

    // 用途：将参数customer添加组中最后一个客户对象记录之后，
    public boolean addCustomer(Customer customer) {
        // 如果客户的数量比数组的长度小，说明可以放入数组
        if (total < customers.length) {
            customers[total] = customer;
            total++;
            return true;
        }
        // 超过数组的长度，则无法再添加入数组当中，返回false
        return false;
    }

    // 用参数customer替换数组中index指定的对象
    public boolean replaceCustomer(int index, Customer customer) {
        if (index >= 0 && index < total) {
            customers[index] = customer;
            return true;
        }
        return false;
    }

    // 从数组中删除参数index指定的客户对象的记录
    public boolean deleteCustomer(int index) {
        if (index >= 0 && index < total) {
            for (int i = index; i < total - 1; i++) {
                customers[i] = customers[i + 1];
            }
            customers[total - 1] = null;    // 因为移动完之后最后一位还指向原来最后一位客户，所以需要将其指向null
            total--;    // 客户数量减一
            return true;
        }
        return false;
    }

    // 用途：返回数组中所有记录的客户对象，数组的长度与对象的个数相等
    public Customer[] getAllCustomers() {
        Customer[] customers1 = new Customer[total];
        for (int i = 0; i < total; i++) {
            customers1[i] = customers[i];
        }
        return customers1;
    }

    // 用途：返回参数index指定索引位置的客户对象记录
    public Customer getCustomer(int index) {
        if (index >= 0 && index < total) {
            return customers[index];
        }
        return null;
    }

    // 获取客户列表中，客户的数量
    public int getTotal() {
        return total;
    }
}
