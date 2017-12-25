package com.example.demo.domain.collections;

import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * descript
 *
 * @author orange
 * @Time 2017/12/25 0025
 */
public class MapTest {

    public static void main(String[] args) {
        HashMap<Integer, Person> personHashMap = Maps.newHashMap();

        personHashMap.put(1, new Person(1, "A"));
        personHashMap.put(1, new Person(2, "B"));
        personHashMap.put(2, new Person(3, "C"));

// ******************* 循环的几种方式   **************
        // 法一 推荐
        Set<Map.Entry<Integer, Person>> entrys = personHashMap.entrySet();
        for (Map.Entry<Integer, Person> entry : entrys) {
            System.out.println("键：" + entry.getKey() + "值：" + entry.getValue());
        }

        // 法二
        personHashMap.forEach((integer, person) -> {
            System.out.println("法五：键：" + integer + "值：" + person);
        });

        // 法三 效率高
        Iterator items = personHashMap.entrySet().iterator();
        while (items.hasNext()) {
            Map.Entry entry = (Map.Entry) items.next();
            System.out.println("键：" + entry.getKey() + "值：" + entry.getValue());
        }

        // 法四 效率低
        Iterator iter = personHashMap.keySet().iterator();
        while (iter.hasNext()) {
            Object key = iter.next();
            Object val = personHashMap.get(key);
            System.out.println("键：" + key + "值：" + val);
        }

        // 法五
        for (Integer key : personHashMap.keySet()) {
            System.out.println("键：" + key + "值：" + personHashMap.get(key));
        }


    }
}
