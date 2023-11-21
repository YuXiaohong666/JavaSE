package com.geo.learning02.tcpudp;

import org.junit.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author yuxiaohong
 * @package com.geo.learning02.tcpudp
 * @date 2023/11/21 18:39
 * @description
 */
public class TCPTest1 {
    // 客户端
    @Test
    public void client() {
        Socket socket = null;
        OutputStream os = null;
        try {
            // 创建一个Socket
            // 声明ip地址
            InetAddress inetAddress = InetAddress.getByName("192.168.21.107");
            // 声明端口号
            int port = 8989;
            socket = new Socket(inetAddress, port);
            // 发送数据
            os = socket.getOutputStream();
            os.write("我是客户端。".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭Socket
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    // 服务端
    @Test
    public void server() {
        // 创建一个server的Socket

        // 调用accept()，接受客户端的Socket

        // 接收数据

        // 关闭Socket
    }
}
