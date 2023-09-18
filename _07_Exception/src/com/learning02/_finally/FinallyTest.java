package com.learning02._finally;

import org.junit.Test;

/**
 * @author yuxiaohong
 * @package com.learning02._finally
 * @date 2023/8/21 15:58
 * @description
 */
public class FinallyTest {
    @Test
    public void test1() {
        try {
            String str = "123";
            str = "abc";
            int i = Integer.parseInt(str);
            System.out.println(i);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(10 / 0);  // 在catch中存在异常

        } finally {
            System.out.println("程序结束");
        }

    }
}
