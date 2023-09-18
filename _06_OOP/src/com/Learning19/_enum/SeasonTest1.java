package com.Learning19._enum;

/**
 * @author yuxiaohong
 * @package com.Learning19._enum
 * @date 2023/8/15 18:47
 * @description
 */
public class SeasonTest1 {
    public static void main(String[] args) {
        // 测试方法
        // 1.toString()方法，打印当前对象名
        System.out.println(Season1.Spring);

        // 2.name()方法，打印当前对象名，用于在toString()方法被重写的情况下
        System.out.println(Season1.Spring.name());

        // 3.values()方法，把当前枚举类中所有的对象都放到数组当中
        Season1[] values = Season1.values();

        // 4.valueOf(String objName)，用于获取与传入字符串名字相同的对象
        String objName = "winter";
        Season1 season1 = Season1.valueOf(objName);
        System.out.println(season1);

        // 5.ordinal()，获取当前对象所在枚举类中的次序（按枚举类中声明的顺序），从0开始
        System.out.println(Season1.Spring.ordinal());

        // 通过枚举类的对象调用重写接口中的方法
        Season1.Spring.show();
    }
}

enum Season1 implements Info {
    // 必须在枚举类的开头声明多个对象，对象之间必须使用逗号隔开
    // 在各个对象中实现接口的重写方法
    Spring("春天", "春暖花开") {
        @Override
        public void show() {
            System.out.println("这个季节是" + getSeasonName());
        }
    },
    summer("夏天", "夏日炎炎") {
        @Override
        public void show() {
            System.out.println("这个季节是" + getSeasonName());
        }
    },
    autumn("秋天", "秋高气爽") {
        @Override
        public void show() {
            System.out.println("这个季节是" + getSeasonName());
        }
    },
    winter("冬天", "白雪皑皑") {
        @Override
        public void show() {
            System.out.println("这个季节是" + getSeasonName());
        }
    };
    // 声明当前类的对象的实例变量
    private final String seasonName;
    private final String seasonDesc;
    // 因为枚举类的实例个数是有限的，所以要私有化类的构造器，防止无限构造实例对象

    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

// 在枚举类中进行重写接口中的方法
    // @Override
    // public void show() {
    //     System.out.println("这是一个季节");
    // }
}

interface Info {
    void show();
}