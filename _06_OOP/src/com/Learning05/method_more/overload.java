package com.Learning05.method_more;

/**
 * @author yuxiaohong
 * @package com.Learning05.method_more
 * @date 2023/7/18 22:07
 * @description 重载
 */
public class overload {
    public static void main(String[] args) {
        overload over = new overload();
        over.add(1, "33");
    }

    public void add(int i, int j) {

    }

    public void add(int i, int j, int k) {

    }

    public void add(String s1, String s2) {

    }

    public void add(int i, String s) {

    }

    public void add(String s, int i) {

    }
}
