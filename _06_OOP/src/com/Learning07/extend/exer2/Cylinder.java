package com.Learning07.extend.exer2;

/**
 * @author yuxiaohong
 * @package com.Learning07.extend.exer2
 * @date 2023/7/28 10:17
 * @description
 */
public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        this.length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume() {
        return 3.14 * getRadius() * getRadius() * length;
    }
}
