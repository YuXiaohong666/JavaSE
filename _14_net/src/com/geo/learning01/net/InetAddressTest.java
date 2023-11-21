package com.geo.learning01.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author yuxiaohong
 * @package com.geo.learning01.net
 * @date 2023/11/21 17:36
 * @description
 */
public class InetAddressTest {
    public static void main(String[] args) {
        // 1.实例化
        try {
            // ip
            InetAddress inet1 = InetAddress.getByName("192.168.23.32");
            System.out.println(inet1);  // /192.168.23.32

            // 域名，打印之后是解析过的ip地址
            InetAddress inet2 = InetAddress.getByName("www.baidu.com");  // www.baidu.com/39.156.66.14
            System.out.println(inet2);

            // 获取本地的IP地址
            System.out.println(InetAddress.getLocalHost());  // DESKTOP-TQKP7AK/192.168.0.125


            // 两个常用的方法
            System.out.println(inet2.getHostName());
            System.out.println(inet2.getHostAddress());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
