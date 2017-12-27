package com.example.demo.domain.collections;

import com.google.common.collect.Maps;

import java.util.*;
import java.util.stream.Collectors;

/**
 * descript
 *
 * @author orange
 * @Time 2017/12/25 0025
 */
public class MapTest {

    public static void main(String[] args) {
        // HashMap
        HashMap<Integer, Person> personHashMap = Maps.newHashMap();
        personHashMap.put(1, new Person(1, "A"));
        personHashMap.put(1, new Person(2, "B"));
        personHashMap.put(5, new Person(3, "C"));
        personHashMap.put(2, new Person(3, "C"));

        // TreeMap
        TreeMap<String, Person> personTreeMap = new TreeMap<>();
        personTreeMap.put("1", new Person(1, "A"));
        personTreeMap.put("1", new Person(2, "B"));
        personTreeMap.put("5", new Person(3, "C"));
        personTreeMap.put("2", new Person(3, "C"));

        System.out.println("测试获取不存在的键值对---->" + personHashMap.get(1));

        Set<Map.Entry<String, Person>> entrys = personTreeMap.entrySet();
        for (Map.Entry<String, Person> entry : entrys) {
            System.out.println("TreeMap---> 键：" + entry.getKey() + "值：" + entry.getValue());
        }

        // map -- > list
        List<Person> result = personHashMap.entrySet().stream()
                .map(x -> x.getValue())
                .collect(Collectors.toList());

        // sort 排序
        Map<Integer, Person> results = new LinkedHashMap<>();
        personHashMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(x -> results.put(x.getKey(), x.getValue()));


        // ******************* 循环的几种方式   **************
        // 法一 推荐
        Set<Map.Entry<Integer, Person>> entryEntry = personHashMap.entrySet();
        for (Map.Entry<Integer, Person> entry : entryEntry) {
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
