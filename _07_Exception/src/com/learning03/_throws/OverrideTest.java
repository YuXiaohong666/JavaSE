package com.learning03._throws;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author yuxiaohong
 * @package com.learning03._throws
 * @date 2023/8/22 10:45
 * @description
 */
public class OverrideTest {
    public static void main(String[] args) {
        Father f = new Son();
        try {
            f.method1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Father {
    public void method1() throws IOException {

    }
}

class Son extends Father {
    @Override
    public void method1() throws FileNotFoundException {
    }
}