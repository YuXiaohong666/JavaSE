package com.Learning09.polymorphism.exer1;

/**
 * @author yuxiaohong
 * @package com.Learning09.polymorphism.exer1
 * @date 2023/7/31 18:23
 * @description 测试类
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest geometricTest = new GeometricTest();
        Circle circle = new Circle("red", 1.0, 2.3);
        Circle circle1 = new Circle("blue", 3.3, 3.3);
        geometricTest.displayGeometricObject(circle);
        geometricTest.displayGeometricObject(circle1);

        System.out.println(geometricTest.equalsArea(circle1, circle));
    }

    // 典型的多态性应用

    public boolean equalsArea(GeometricObject geometricObject1, GeometricObject geometricObject2) {
        return geometricObject1 == geometricObject2;
    }

    public void displayGeometricObject(GeometricObject geometricObject) {
        System.out.println("几何图形的面积为：" + geometricObject.findArea());
    }
}
