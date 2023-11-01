package com.learning02.selfdefine.apply;

import java.sql.Date;

/**
 * @author yuxiaohong
 * @package com.learning02.selfdefine.apply
 * @date 2023/11/1 11:36
 * @description ORM(object relational mapping)思想：
 * 数据库中的一个表与java的一个类相对应，
 * 表中的一条记录与java类的对象相对应，
 * 表中的一个字段（或列）与java的一个属性（或字段）对应。
 */
public class Customer {
    int id;
    String name;
    String email;
    Date birth;
}
