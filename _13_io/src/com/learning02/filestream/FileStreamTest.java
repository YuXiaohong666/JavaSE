package com.learning02.filestream;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {
    @Test
    public void Test1() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1.创建相关的File类的对象
            File srcFile = new File("player.jpg");
            File destFile = new File("player_copy.jpg");
            //2.创建相关的字节流
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            //3.数据的读入和写出
            byte[] buffer = new byte[1024];  //1kb
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //4.关闭流资源
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
