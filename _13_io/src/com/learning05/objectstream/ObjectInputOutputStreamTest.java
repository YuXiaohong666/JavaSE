package com.learning05.objectstream;

import org.junit.Test;

import java.io.*;

/**
 * @author yuxiaohong
 * @package com.learning05.objectstream
 * @date 2023/11/21 14:04
 * @description
 */
public class ObjectInputOutputStreamTest {
    @Test
    public void test1() throws IOException {
        // 1.创建文件以及对象输出流
        File file = new File("Object.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        // 2.写出数据即为序列化的过程
        oos.writeUTF("三三四四");
        oos.flush();
        oos.writeObject("123456");
        oos.flush();
        oos.close();

    }

    @Test
    public void test2() throws IOException, ClassNotFoundException {
        // 1.创建文件以及对象输入流
        File file = new File("Object.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        // 2.读入数据即反序列化的过程
        String s = ois.readUTF();
        System.out.println(s);

        String str = (String) ois.readObject();
        System.out.println(str);
        ois.close();
    }

    // 演示自定义类的对象序列化和反序列化过程
    @Test
    public void test3() throws IOException {
        // 1.创建文件以及对象输出流
        File file = new File("Object1.dat");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        // 2.写出数据即为序列化的过程
        Person p1 = new Person("Tom", 12);
        oos.writeObject(p1);
        oos.flush();
        oos.close();
    }

    @Test
    public void test4() throws IOException, ClassNotFoundException {
        // 1.创建文件以及对象输入流
        File file = new File("Object1.dat");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        // 2.读入数据即反序列化的过程

        Person person = (Person) ois.readObject();
        System.out.println(person);
        ois.close();
    }
}
