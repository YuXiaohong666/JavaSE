package com.Learning09.polymorphism.exer1;

/**
 * @author yuxiaohong
 * @package com.Learning09.polymorphism.exer1
 * @date 2023/7/31 18:17
 * @description 子类，圆形2
 */
public class Circle extends GeometricObject {
    private double radius;  // 半径

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return 3.14 * radius * radius;
    }
}
