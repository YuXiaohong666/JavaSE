package com.geo.learning02.tcpudp;

import org.junit.Test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author yuxiaohong
 * @package com.geo.learning02.tcpudp
 * @date 2023/11/22 17:43
 * @description
 */
public class UDPTest {
    @Test
    public void sender() throws Exception {
        // 1.创建DatagramSocket实例
        DatagramSocket ds = new DatagramSocket();
        // 2.将目的地的ip和端口号都封装在数据报DatagramPacket中（64kb以内）
        InetAddress address = InetAddress.getByName("192.168.0.125");
        int port = 9090;
        byte[] bytes = "我是发送端".getBytes("utf-8");
        DatagramPacket dp = new DatagramPacket(bytes, 0, bytes.length, address, port);

        ds.send(dp);
        ds.close();
    }

    @Test
    public void receiver() throws Exception {
        // 1.创建DatagramSocket实例
        DatagramSocket ds = new DatagramSocket(9090);
        // 2.创建一个数据报的对象用于接收发送端发送过来的数据
        byte[] buffer = new byte[64];
        DatagramPacket dp = new DatagramPacket(buffer, 0, buffer.length);
        // 3.接收数据报
        ds.receive(dp);
        // 4.打印数据
        String str = new String(dp.getData(), 0, dp.getLength());
        System.out.println(str);
        ds.close();
    }
}
