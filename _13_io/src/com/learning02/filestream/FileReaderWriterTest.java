package com.learning02.filestream;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
        FileReader fileReader = null;
        try {
            // 1.创建一个File类的对象，对应着hello.txt文件
            File file = new File("hello.txt");

            // 2.创建输入型的字符流，用于读取数据
            fileReader = new FileReader(file);

            // 3.读取数据，并显示在控制台
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.流资源的关闭操作，必须要关闭，否则会导致内存泄漏
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * 对test进行优化，每次读取多个字符，存放到字符数组中，减少磁盘的交互次数，提高效率
     * */
    @Test
    public void Test3() {
        FileReader fileReader = null;
        try {
            // 1.创建一个File类的对象，对应着hello.txt文件
            File file = new File("hello.txt");

            // 2.创建输入型的字符流，用于读取数据
            fileReader = new FileReader(file);

            // 3.读取数据，并显示在控制台
            char[] cbuffer = new char[5];
            int len;
            while ((len = fileReader.read(cbuffer)) != -1) {
                //遍历数组
                for (int i = 0; i < len; i++) {
                    System.out.print(cbuffer[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.流资源的关闭操作，必须要关闭，否则会导致内存泄漏
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //将内存中的数据写出到指定的文件
    @Test
    public void Test4() throws IOException {
        FileWriter fileWriter = null;
        try {
            //1.创建File类的对象，指明要写出的文件的名称
            File file = new File("info.txt");
            //2.创建输出流
            fileWriter = new FileWriter(file);
            //3.写出具体的过程
            fileWriter.write("avc");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //需求：复制一份hello.txt文件，命名为hello_copy.txt
    @Test
    public void Test5() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1.创建File类对象
            File src = new File("hello.txt");
            File dest = new File("hello_copy.txt");
            //2.创建输入流和输出流
            fr = new FileReader(src);
            fw = new FileWriter(dest);
            //3.数据的读入和写出的过程
            char[] cbuffer = new char[5];
            int len;  //记录每次读入到cbuffer中的字符的个数
            while ((len = fr.read(cbuffer)) != -1) {
                //该方法参数：字符序列、起始下标、长度
                fw.write(cbuffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流资源
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
