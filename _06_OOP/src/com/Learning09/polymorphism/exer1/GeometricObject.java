package com.Learning09.polymorphism.exer1;

/**
 * @author yuxiaohong
 * @package com.Learning09.polymorphism.exer1
 * @date 2023/7/31 18:06
 * @description 父类，代表几何形状
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea() {
        return 0;
    }
}
