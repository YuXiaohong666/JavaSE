package com.Learning17._interface.exer2;

/**
 * @author yuxiaohong
 * @package com.Learning17._interface.exer2
 * @date 2023/8/9 10:11
 * @description
 */
public class ComparableCircle extends Circle implements CompareObject {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (o instanceof ComparableCircle) {
            ComparableCircle c = (ComparableCircle) o;
            if (c.getRadius() == this.getRadius()) {
                return 0;
            } else if (c.getRadius() < this.getRadius()) {
                return 1;
            } else {
                return -1;
            }
        } else {
            // 异常，之后再进行学习
            throw new RuntimeException("输入的类型不匹配！");
        }
    }
}