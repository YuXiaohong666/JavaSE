package com.learning06.communication;

/**
 * @author yuxiaohong
 * @package com.learning06.communication
 * @date 2023/9/6 11:24
 * @description 生产者&消费者
 * 生产者（Producer）将产品交给店员（Clerk），而消费者（Consumer）从店员处取走产品，店员一次只能持有固定数量的产品（比如：20），如果
 * 生产者试图生产更多产品，店员会叫生产者停一下，如果店员中有空位放产品了，再通知生产者继续生产，如果店中没有产品了，店员会告诉消费者
 * 等一下，如果点钟有产品了再通知消费者取走产品。
 * <p>
 * 分析：是否是多线程问题：是，生产者、消费者
 * 是否有共享数据：有，产品
 * 是否有线程安全问题：有
 * 是否需要处理线程安全问题：需要
 * 是否存在线程之间的通信：存在
 */
public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer producer = new Producer(clerk);
        Consumer consumer = new Consumer(clerk);

        producer.setName("生产者1");
        consumer.setName("消费者1");

        producer.start();
        consumer.start();
    }
}

class Clerk {
    private static int ProductNumber = 0;

    // 增加产品数量的方法
    public synchronized void addProduct() {
        if (ProductNumber >= 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            ProductNumber++;
            System.out.println(Thread.currentThread().getName() + "生产者生产了第" + ProductNumber + "个产品");

            notifyAll();
        }
    }

    // 减少产品数量的方法
    public synchronized void minusProduct() {
        if (ProductNumber <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + "消费者消费了第" + ProductNumber + "个产品");
            ProductNumber--;

            notifyAll();
        }
    }
}

class Producer extends Thread {
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("生产者开始生产产品");
            // 每50毫秒生产一个产品
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.addProduct();
        }
    }
}

class Consumer extends Thread {
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("消费者开始消费产品");
            // 每50毫秒生产一个产品
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.minusProduct();
        }
    }
}