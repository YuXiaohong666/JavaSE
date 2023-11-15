package com.learning03.buffered;

import org.junit.Test;

import java.io.*;

public class BufferedStreamTest {
    //需求；使用BufferedInputStream和BufferedOutputStream复制一个图片
    @Test
    public void Test1() throws IOException {

        //1.创建相关的File类的对象
        File srcFile = new File("player.jpg");
        File destFile = new File("player_copy1.jpg");
        //2.创建相关的字节流
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //3.数据的读入和写出
        byte[] buffer = new byte[1024];  //1kb
        int len;
        while ((len = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }

        //4.关闭流资源
        //外层的流的关闭，由于外层流的关闭也会自动对内层的流进行关闭的操作，所以可以省略内层流的关闭。
        bos.close();
        bis.close();

    }
}
