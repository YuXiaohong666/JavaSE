package com.learning02.selfdefine.exer1;

import java.util.*;

/**
 * @author yuxiaohong
 * @package com.learning02.selfdefine.exer1
 * @date 2023/11/1 12:02
 * @description
 */
public class DAO<T> {
    Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        // 如果当map中没有key为id的对象时，进行添加操作
        if (!map.containsKey(id)) {
            map.put(id, entity);
        }
    }

    public T get(String id) {
        return map.get((id));
    }

    public void update(String id, T entity) {
        // 替换操作，说明需要key为id的对象要存在
        if (map.containsKey(id)) {
            map.put(id, entity);
        }
    }

    public List<T> list() {
        Collection<T> values = map.values();
        ArrayList<T> list = new ArrayList<>();
        list.addAll(values);
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }
}
