package com.Learning13.main;

/**
 * @author yuxiaohong
 * @package com.Learning13.main
 * @date 2023/8/4 14:58
 * @description
 */
public class MainTest {
    public static void main(String[] args) {
        String[] arr = new String[]{"a", "b", "c"};
        Main.main(arr);
    }
}

class Main {
    public static void main(String[] args) {  // 看做普通的静态方法
        System.out.println("Main的main()调用");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}