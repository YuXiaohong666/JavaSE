package com.learning02.selfdefine;

/**
 * @author yuxiaohong
 * @package com.learning02.selfdefine
 * @date 2023/10/31 9:30
 * @description
 */
public class Order<T> {
    // 声明了类的泛型参数之后，就可以在类的内部使用此泛型参数
    T t;
    int orderId;

    public Order() {
    }

    public Order(T t, int orderId) {
        this.t = t;
        this.orderId = orderId;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String
    toString() {
        return "Order{" +
                "t=" + t +
                ", orderId=" + orderId +
                '}';
    }
}
