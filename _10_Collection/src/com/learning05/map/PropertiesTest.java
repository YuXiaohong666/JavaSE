package com.learning05.map;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    @Test
    public void Test1() throws IOException {  //因为涉及到流的操作，为了确保流能关闭，建议使用try-catch方式
//        方式1：数据和代码耦合度高，如果修改的话，需要重新编译代码、打包发布，繁琐
//        String name = "Tom";
//        String password = "abc";

//        操作数据...


/*        方式2：将数据封装到具体的配置文件当中，在程序中读取配置文件的信息。
        实现了数据和代码的解耦，省去了编译和打包的时间。*/

        File file = new File("info.properties");
        System.out.println(file.getAbsoluteFile());


        FileInputStream fileInputStream = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(fileInputStream);  //加载流中的文件中的数据

//        读取数据
        String name = properties.getProperty("name");
        String pwd = properties.getProperty("password");

        System.out.println(name);
        System.out.println(pwd);
    }
}
