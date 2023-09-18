package com.Learning19._enum;

/**
 * @author yuxiaohong
 * @package com.Learning19._enum
 * @date 2023/8/15 18:28
 * @description
 */
public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(Season.autumn);
    }
}

// JDK5.0之前的枚举类实现方式
class Season {

    // 声明当前类的对象的实例变量
    private final String seasonName;
    private final String seasonDesc;
    // 因为枚举类的实例个数是有限的，所以要私有化类的构造器，防止无限构造实例对象

    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    // 创建类的实例
    public static final Season spring = new Season("春天", "春暖花开");
    public static final Season summer = new Season("夏天", "夏日炎炎");
    public static final Season autumn = new Season("秋天", "秋高气爽");
    public static final Season winter = new Season("冬天", "白雪皑皑");

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
