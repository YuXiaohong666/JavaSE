package com.Learning09.polymorphism.exer3;

/**
 * @author yuxiaohong
 * @package com.Learning09.polymorphism.exer3
 * @date 2023/8/1 14:57
 * @description 需求：在包中声明人Person、男人Man、女人Woman类
 * 1.在Person类中，包含：public void eat()：打印吃饭 public void toilet()：打印上洗手间
 * 2.在Man类中，包含：重写上面的方法，增加public void smoke()：打印抽烟
 * 3.在Woman类中，包含：重写上面的方法，增加public void makeup()：打印化妆
 * 4.在包中声明测试类：
 * 1.public
 */
public class PersonTest {
    public static void main(String[] args) {
        PersonTest personTest = new PersonTest();
        personTest.meeting(new Man(), new Woman());
    }

    public void meeting(Person... ps) {
        for (int i = 0; i < ps.length; i++) {
            ps[i].eat();
            ps[i].toilet();
            if (ps[i] instanceof Man) {
                Man man = (Man) ps[i];
                man.smoke();
            } else if (ps[i] instanceof Woman) {
                Woman woman = (Woman) ps[i];
                woman.makeup();
            }
        }
    }
}
