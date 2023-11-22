package com.geo.learning03.url;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author yuxiaohong
 * @package com.geo.learning03.url
 * @date 2023/11/22 18:04
 * @description
 */
public class URLTest {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        InputStream is = null;
        HttpURLConnection httpURLConnection = null;
        try {
            // 1.获取URL实例
            URL url = new URL("https://www.bilibili.com/video/BV1PY411e7J6?p=186&vd_source=b13a0c249f074a81f967680e2c948d52");
            try {
                // 2.建立与服务器端之间的连接
                httpURLConnection = (HttpURLConnection) url.openConnection();
                // 3.获取输出、输入流
                is = httpURLConnection.getInputStream();
                File file = new File("aaa.jpg");
                fos = new FileOutputStream(file);
                // 4.读写数据
                byte[] buffer = new byte[1024];
                int len;
                while ((len = is.read(buffer)) != -1) {
                    fos.write(buffer, 0, len);
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fos != null) {
                    fos.close();
                }
                if (is != null) {
                    is.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
