package com.learning04.inputstreamreader;

import org.junit.Test;

import java.io.*;

public class InputStreamReaderTest {
    @Test
    public void Test1() throws IOException {
        // 1.创建File对象
        File file = new File("dbcp_utf-8.txt");
        // 2.创建流对象
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        // 3.读入操作
        char[] cBuffer = new char[1024];
        int len;
        while ((len = isr.read(cBuffer)) != -1) {
            String str = new String(cBuffer, 0, len);
            System.out.println(str);
        }

        // 关闭资源
        isr.close();
    }
}
