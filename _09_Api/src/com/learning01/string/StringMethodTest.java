package com.learning01.string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * @author yuxiaohong
 * @package com.learning01.string
 * @date 2023/9/18 9:30
 * @description
 */
public class StringMethodTest {
    @Test
    public void test1() {
        String s1 = new String();
        String s2 = new String("");

        String s3 = new String(new char[]{'a', 'b', 'c'});
        System.out.println(s3);
    }

    // String与char []进行转换
    @Test
    public void test2() {
        String str = "hello";
        // String ---> char[]，调用String的toCharArray()
        char[] charArray = str.toCharArray();
        System.out.println(charArray);

        // char[]  ---> String，调用String的构造器
        String str1 = new String((charArray));
        System.out.println(str1);
    }

    // String与byte[]之间的转换
    /*
     * 在UTF-8中，一个汉字占3个字节，一个字母占1个字节
     * 在GBK中，一个汉字占2个字节，一个字母占1个字节
     *
     * utf-8或gbk都向下兼容了ascii码
     *
     * 编码与解码：
     *编码：String  --->字节或字节数组
     *解码：字节或字节数组  --->  String
     * 要求：解码时使用的字符集必须要和编码时使用的字符集保持一致，不一致就会导致乱码
     * */
    @Test
    public void test3() throws UnsupportedEncodingException {
        String str = new String("hello");

        // String ---> byte[]
        byte[] bytes = str.getBytes();  // 使用默认的字符集
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        // getBytes(String charsetName)使用指定的字符集
        // 会报异常
        byte[] arr1 = str.getBytes("gbk");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        // byte[] ---> String
        String s = new String(arr1);
        System.out.println(s);
    }


}
