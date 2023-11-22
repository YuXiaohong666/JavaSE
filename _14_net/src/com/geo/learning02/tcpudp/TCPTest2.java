package com.geo.learning02.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author yuxiaohong
 * @package com.geo.learning02.tcpudp
 * @date 2023/11/22 15:56
 * @description 用户端给服务器端发送文件，服务器端将文件保存在本地
 */
public class TCPTest2 {
    @Test
    public void client() {
        Socket socket = null;
        FileInputStream fis = null;
        OutputStream os = null;
        try {
            // 1.创建Socket
            InetAddress address = InetAddress.getByName("192.168.0.125");
            int port = 9090;
            socket = new Socket(address, port);

            // 2.创建File的实例和流的实例
            File file1 = new File("pic.jpg");
            fis = new FileInputStream(file1);
            os = socket.getOutputStream();
            // 3.通过Socket获取输出流
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.关闭Socket和相关的流
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void server() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            // 1.创建ServerSocket
            int port = 9090;
            serverSocket = new ServerSocket(port);
            // 2.接收来自客户端的socket.accept()
            socket = serverSocket.accept();
            // 3.通过Socket获取输入流
            is = socket.getInputStream();
            // 4.创建File类的实例和输出流的实例
            File file = new File("pic_copy.jpg");
            fos = new FileOutputStream(file);
            // 5.读写过程
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("数据接收完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 6.关闭相关的Socket的流
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
