package com.geo.learning02.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author yuxiaohong
 * @package com.geo.learning02.tcpudp
 * @date 2023/11/22 16:26
 * @description 客户端发送文件到服务端，服务端保存到本地，并给客户端发送消息说文件发送成功
 */
public class TCPTest3 {
    @Test
    public void client() throws IOException {

        InetAddress address = InetAddress.getByName("192.168.0.125");
        int port = 8891;
        Socket socket = new Socket(address, port);
        File file = new File("aaa.txt");
        FileInputStream fis = new FileInputStream(file);
        OutputStream os = socket.getOutputStream();

        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read()) != -1) {
            os.write(buffer, 0, len);
        }
        System.out.println("客户端发送文件成功。");
        // 关闭客户端的输出
        socket.shutdownOutput();

        // 接收来自服务器端的数据
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer1 = new byte[1024];
        int len1;
        while ((len1 = is.read(buffer1)) != -1) {
            baos.write(buffer1, 0, len1);
        }
        System.out.println(baos);
        baos.close();
        is.close();
        os.close();
        fis.close();
        socket.close();
    }

    @Test
    public void server() throws IOException {
        int port = 8891;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        File file = new File("aaa_copy.txt");
        FileOutputStream fos = new FileOutputStream(file);

        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }
        System.out.println("服务端接收文件成功，并保存在本地。");

        OutputStream os = socket.getOutputStream();
        os.write("服务端已接收到文件。".getBytes());
        os.close();
        fos.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
