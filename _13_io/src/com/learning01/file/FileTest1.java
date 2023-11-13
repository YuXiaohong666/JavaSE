package com.learning01.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author yuxiaohong
 * @package com.learning01.file
 * @date 2023/11/10 18:01
 * @description
 */
public class FileTest1 {
    @Test
    public void test1() {
        File file1 = new File("hello.txt");
        System.out.println(file1.getName());
        System.out.println(file1.getPath());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());

/*      hello.txt
        hello.txt
        D:\IDEA_Workspace\JavaSE\_13_io\hello.txt
        D:\IDEA_Workspace\JavaSE\_13_io\hello.txt
        null
        0
        0
*/
    }

    @Test
    public void test3() {
        File file = new File("D:\\Spring6.0.0");
        System.out.println(Arrays.toString(file.list()));
        System.out.println(Arrays.toString(file.listFiles()));

/*      [commons-logging, spring-framework-6.0.0-RC2]
        [D:\Spring6.0.0\commons-logging, D:\Spring6.0.0\spring-framework-6.0.0-RC2]*/
    }

    @Test
    public void test4() {
        File file1 = new File("hello.txt");

    }

    @Test
    public void test5() throws IOException {
        File file = new File("d:/hello.txt");
        // 测试文件的创建和删除
        if (!file.exists()) {
            boolean isSucceed = file.createNewFile();
            if (isSucceed) {
                System.out.println("创建成功");
            }
        } else {
            System.out.println("此文件已存在");
        }
    }

    @Test
    public void test6() throws IOException {
        File file = new File("d:/io");
        if (!file.exists()) {
            boolean newFile = file.createNewFile();
            if (newFile) {
                System.out.println("文件目录创建成功");
            }
        } else {
            System.out.println("文件目录已存在");
        }
    }
}
