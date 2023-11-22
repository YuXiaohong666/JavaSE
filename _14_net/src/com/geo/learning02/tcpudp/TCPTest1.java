package com.geo.learning02.tcpudp;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
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
            InetAddress inetAddress = InetAddress.getByName("192.168.0.125");
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
    public void server() throws IOException {
        ServerSocket serverSocket = null;
        Socket socket = null;  // 阻塞式的方法
        InputStream is = null;
        try {
            // 创建一个server的Socket
            int port = 8989;
            serverSocket = new ServerSocket(port);
            // 调用accept()，接受客户端的Socket
            socket = serverSocket.accept();
            System.out.println("服务器端已开启。。。");
            // 接收数据
            is = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int len;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();  // 内部维护了一个byte[]
            while ((len = is.read(buffer)) != -1) {
                // 防止出现接收byte数组的长度不是3的倍数或长度不足而导致的乱码，
                // String str = new String(buffer, 0, len);
                // System.out.println(str);

                baos.write(buffer, 0, len);
                System.out.println(baos);
                System.out.println("收到了来自：" + socket.getInetAddress().getHostAddress() + "的信息。");
            }
            System.out.println("数据接受完毕。。。");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭Socket
            if (socket != null) {
                socket.close();
            }
            if (serverSocket != null) {
                serverSocket.close();
            }
            if (is != null) {
                is.close();
            }
        }
    }
}
