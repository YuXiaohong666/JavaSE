package com.learning02.selfdefine.apply;

/**
 * @author yuxiaohong
 * @package com.learning02.selfdefine.apply
 * @date 2023/11/1 11:27
 * @description DAO：data(base) access object：数据库访问对象，操作数据库相关的方法声明在DAO当中，内部封装了相关数据库表的增删改查操作
 */
public class DAO<T> {
    // 增
    public void insert(T bean) {
        // 通过相应的sql语句，将bean对象的属性写入数据表当中。
    }

    // 删
    public void delete(int id) {
        // 略
    }
    // 改

    // 查
}
