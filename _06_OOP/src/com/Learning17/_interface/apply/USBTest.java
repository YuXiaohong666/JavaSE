package com.Learning17._interface.apply;

/**
 * @author yuxiaohong
 * @package com.Learning17._interface.apply
 * @date 2023/8/8 18:31
 * @description
 */
public class USBTest {
    public static void main(String[] args) {

        Computer computer = new Computer();
        // 创建接口实现类的对象
        Printer printer = new Printer();
        computer.transferData(printer);
        // 创建接口实现类的匿名对象
        computer.transferData(new Camera());
        // 创建接口匿名实现类的对象
        USB usb = new USB() {
            @Override
            public void start() {
                System.out.println("U盘开始工作了");
            }

            @Override
            public void stop() {
                System.out.println("U盘结束工作了");
            }
        };
        computer.transferData(usb);

        // 创建接口匿名实现类的匿名对象
        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("匿名实现类的匿名对象开始工作了");
            }

            @Override
            public void stop() {
                System.out.println("匿名实现类的匿名对象结束工作了");
            }
        });

    }
}

interface USB {
    public abstract void start();

    void stop();
}

class Computer {
    public void transferData(USB usb) {  // USB usb = new Printer()   接口的多态性体现
        System.out.println("设备连接成功...");
        usb.start();
        System.out.println("数据传输的细节操作");
        usb.stop();
    }
}

class Printer implements USB {
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}

class Camera implements USB {
    @Override
    public void start() {
        System.out.println("照相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("照相机结束工作");
    }
}