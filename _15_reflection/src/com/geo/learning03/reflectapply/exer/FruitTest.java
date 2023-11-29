package com.geo.learning03.reflectapply.exer;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * @author yuxiaohong
 * @package com.geo.learning03.reflectapply.exer
 * @date 2023/11/29 18:49
 * @description
 */
public class FruitTest {
    @Test
    public void test1() throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 1.读取配置文件中的信息
        Properties prop = new Properties();
        File file = new File("src/config.properties");
        FileInputStream fis = new FileInputStream(file);
        prop.load(fis);
        String property = prop.getProperty("fruitName");

        // 2.通过反射创建指定全类名对应的类的实例
        Class aClass = Class.forName(property);
        Constructor con = aClass.getDeclaredConstructor();
        con.setAccessible(true);
        Fruit f = (Fruit) con.newInstance();
        // 3.通过榨汁机的对象调用run()
        Juicer juicer = new Juicer();
        juicer.run(f);
    }
}
