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
    }
}
