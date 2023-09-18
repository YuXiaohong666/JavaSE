package com.Learning07.extend.exer;

/**
 * @author yuxiaohong
 * @package com.Learning07.extend.exer
 * @date 2023/7/28 10:10
 * @description 测试类
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids kids = new Kids(1, 2, 3000);
        kids.employed();
        kids.manOrWoman();
        System.out.println(kids.getYearsOld());
    }
}
