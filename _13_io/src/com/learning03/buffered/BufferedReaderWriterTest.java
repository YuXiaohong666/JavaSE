package com.learning03.buffered;

import org.junit.Test;

import java.io.*;

//测试BufferedReader和BufferedWriter的使用
public class BufferedReaderWriterTest {
    //使用BufferedReader将会hello.txt中的内容显示在控制台上
    @Test
    public void Test1() throws IOException {
        File file = new File("hello.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        //读取的过程
        //方式1：read(char[] cBuffer)
/*        char[] cBuffer = new char[1024];
        int len;
        while ((len = br.read(cBuffer)) != -1) {
            for (int i = 0; i < len; i++) {
                System.out.println(cBuffer[i]);
            }
        }*/

        //方式2：readLine()，每次读取一行文本中的数据，返回的字符串不包含换行符。
        String data;
        while ((data = br.readLine()) != null) {
            System.out.println(data + "\n");
        }
        br.close();
    }

    //使用BufferedReader和BufferedWriter实现文本文件的复制
    @Test
    public void Test2() throws IOException {
        //1.早文件、造流
        File file = new File("hello.txt");
        File file1 = new File("hello_copy1.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file1));

        //2.文件的读写操作
        String data;
        while ((data = br.readLine()) != null) {
            bw.write(data);
            bw.newLine();  //换行操作
            bw.flush();  //刷新，将缓存中的数据全部下厨到磁盘文件中
        }
        System.out.println("复制成功");

        //3.关闭资源，如果没有关闭资源，则必须使用flush方法，将数据全部写出
        bw.close();
        br.close();
    }
}
