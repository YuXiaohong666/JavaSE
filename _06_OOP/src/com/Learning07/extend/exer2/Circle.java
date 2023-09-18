package com.Learning07.extend.exer2;

/**
 * @author yuxiaohong
 * @package com.Learning07.extend.exer2
 * @date 2023/7/28 10:17
 * @description
 */
public class Circle {
    private double radius = 1;

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return 3.14 * radius * radius;
    }
}
