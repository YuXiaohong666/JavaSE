package com.learning04.compare;

public class Product implements Comparable {
    private String name;
    private double price;

    /*当前的类需要实现Comparable中的抽象方法
    在此方法中指明如何判断当前类对象的大小
    比如按照价格的高低进行排序
    */
    @Override
    public int compareTo(Object o) {
        if (o == this) {
            return 0;
        }
        if (o instanceof Product) {
            Product p = (Product) o;
            return Double.compare(this.price, p.price);
        }
//        手动抛出异常类的对象
        throw new RuntimeException("类型不匹配");
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
