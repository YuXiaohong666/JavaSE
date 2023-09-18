package com.Learning12.singleton;

/**
 * @author yuxiaohong
 * @package com.Learning12.singleton
 * @date 2023/8/4 10:51
 * @description 单例模式，懒汉式
 */
public class GirlFriendTest {
}

class GirlFriend {
    // 类的构造器私有化
    private GirlFriend() {

    }

    private static GirlFriend girlFriend = null;

    public static GirlFriend getGirlFriend() {
        if (girlFriend == null) {
            girlFriend = new GirlFriend();
        }
        return girlFriend;
    }
}
