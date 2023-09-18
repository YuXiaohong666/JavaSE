package com.Learning06.JavaBean;

import java.sql.Date;

/**
 * @author yuxiaohong
 * @package com.Learning06.JavaBean
 * @date 2023/7/25 18:13
 * @description javabean测试
 */
public class customer {
    // 无参的构造器
    public customer() {

    }

    public customer(String name) {
        // 这行代码就代表调用了无参的构造器
        this();
    }

    public customer(String name, int id) {
        // 这行代码代表调用了上方的构造器
        this(name);
        this.id = id;
    }

    private int id;
    private String name;
    private Date birth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
