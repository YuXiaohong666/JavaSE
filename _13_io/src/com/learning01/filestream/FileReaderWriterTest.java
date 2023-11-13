package com.learning01.filestream;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author yuxiaohong
 * @package com.learning01.filestream
 * @date 2023/11/13 11:32
 * @description
 */
public class FileReaderWriterTest {
    /**
     * @Author: yuxiaohong
     * @Description: 读取hello.txt中的内容，显示在控制台上
     */
    @Test
    public void test1() throws IOException {
        // 1.创建一个File类的对象，对应着hello.txt文件
        File file = new File("hello.txt");

        // 2.创建输入型的字符流，用于读取数据
        FileReader fileReader = new FileReader(file);

        // 3.读取数据，并显示在控制台
        // 方式1
        // int data = fileReader.read();
        // while (data != -1) {
        //     System.out.println((char) data);
        //     data = fileReader.read();
        // }

        // 方式2
        int data;
        while ((data = fileReader.read()) != -1) {
            System.out.println((char) data);
        }

        // 4.流资源的关闭操作，必须要关闭，否则会导致内存泄漏
        fileReader.close();
    }

    /**
     * @Author: yuxiaohong
     * @Description: 使用try-catch finally的方式处理异常，确保流一定被关闭
     */
    @Test
    public void test2() {
        // 1.创建一个File类的对象，对应着hello.txt文件
        File file = new File("hello.txt");

        // 2.创建输入型的字符流，用于读取数据
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // 方式2
        int data;
        while (true) {
            try {
                if (!((data = fileReader.read()) != -1)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println((char) data);
        }
    }
}
