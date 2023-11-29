package com.geo.learning02._class;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

/**
 * @author yuxiaohong
 * @package com.geo.learning02._class
 * @date 2023/11/28 18:43
 * @description
 */
public class ClassLoaderTest {
    /**
     * @Author: yuxiaohong
     * @Description: 通过ClassLoader加载指定的配置文件
     * @Params:
     * @Return
     */
    @Test
    public void test1() throws IOException {
        Properties prop = new Properties();
        // 读取的文件的默认路径为当前module下的src文件夹下
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("info1.properties");
        prop.load(is);
        String name = prop.getProperty("name");
        String password = prop.getProperty("password");
        System.out.println(name + ":" + password);
    }

    /**
     * @Author: yuxiaohong
     * @Description: Properties：处理属性文件
     * @Params:
     * @Return
     */
    @Test
    public void test2() throws IOException {
        Properties prop = new Properties();
        // 读取文件的默认路径为当前module下
        FileInputStream fis = new FileInputStream(new File("info.properties"));
        prop.load(fis);
        String name = prop.getProperty("name");
        String password = prop.getProperty("password");
        System.out.println(name + ":" + password);
    }
    
}
