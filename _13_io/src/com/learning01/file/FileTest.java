package com.learning01.file;

import org.junit.Test;

import java.io.File;

/**
 * @author yuxiaohong
 * @package com.learning01.file
 * @date 2023/11/9 18:41
 * @description
 */
public class FileTest {
    @Test
    public void test1() {
        File file1 = new File("d:/hello.txt");
        File file2 = new File("abc");
        System.out.println(file1.getAbsoluteFile());
    }

    @Test
    public void test2() {
        // 参数1：一定是一个文件目录，参数2可以是文件也可以是文件目录
        File file = new File("d:/id", "abc.txt");
        // 参数1：一定是一个文件目录，参数2可以是文件也可以是文件目录
        new File(file, "ab.txt");
    }
}
