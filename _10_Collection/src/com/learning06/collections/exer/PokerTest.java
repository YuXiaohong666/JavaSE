package com.learning06.collections.exer;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author yuxiaohong
 * @package com.learning06.collections.exer
 * @date 2023/10/23 14:15
 * @description
 */
public class PokerTest {
    public static void main(String[] args) {
        // 1.第一步：组成一副扑克牌
        ArrayList<Object> poker = new ArrayList<>();
        String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"};
        String[] color = {"红桃", "黑桃", "方片", "梅花"};

        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < num.length; j++) {
                poker.add(color[i] + num[j]);
            }
        }

        // 添加大小王
        poker.add("小王");
        poker.add("大王");

        // 2.第二步：洗牌
        Collections.shuffle(poker);

        // 3.第三步：发牌
        // 3.1：创建三个角色和1个底牌对应的容器
        ArrayList<Object> tom = new ArrayList<>();
        ArrayList<Object> jerry = new ArrayList<>();
        ArrayList<Object> me = new ArrayList<>();
        ArrayList<Object> lastCards = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            if (i >= poker.size() - 3) {
                lastCards.add(poker.get(i));
            }
            if (i % 3 == 0) {
                tom.add(poker.get(i));
            } else if (i % 3 == 1) {
                jerry.add(poker.get(i));
            } else if (i % 3 == 2) {
                me.add(poker.get(i));
            }
        }
        // 3.2：遍历显示
        System.out.println("Tom：");
        System.out.println(tom);
        System.out.println("Jerry：");
        System.out.println(jerry);
        System.out.println("Me：");
        System.out.println(me);
        System.out.println("LastCards");
        System.out.println(lastCards);
    }
}
