package com.learning02.selfdefine.exer1;

import org.junit.Test;

import java.util.List;

/**
 * @author yuxiaohong
 * @package com.learning02.selfdefine.exer1
 * @date 2023/11/1 12:22
 * @description
 */
public class JunitTest {
    @Test
    public void test1() {
        DAO<User> dao = new DAO();
        User user = new User(1, 23, "小杰");

        dao.save("1001", user);
        dao.save("1002", new User(2, 25, "小菜"));

        List<User> list = dao.list();
        for (User user1 : list) {
            System.out.println(user1);
        }

        dao.update("1002", new User(3, 28, "效民"));
        List<User> list2 = dao.list();
        for (User user2 : list2) {
            System.out.println(user2);
        }

    }
}
