package com.example.demo.test;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * descript
 *
 * @author orange
 * @Time 2018/7/10 0010
 */
public class Test2 {

    public static void main(String[] args) {
        // 冒泡排序
        List<Integer> list = Lists.newArrayList(1, 4, 2, 7, 9, 8, 5);
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        System.out.println(list);

        List<Float> floatList = Lists.newArrayList(0.0F, 0.0F, 0f, 0.0f, 0.0F);
        floatList.sort((o1, o2) -> {
            if (o1 > o2) {
                return 1;
            }

            return -1;
        });

        System.out.println(floatList);

        // 选择排序
        List<Integer> choose = Lists.newArrayList(1, 4, 2, 7, 9, 8, 5);
        int index;
        for (int i = 1; i < choose.size(); i++) {
            index = 0;
            for (int j = 1; j <= choose.size() - i; j++) {
                if (choose.get(j) > choose.get(index)) {
                    index = j;
                }
            }

            int temp = choose.get(choose.size() - i);
            choose.set(choose.size() - i, choose.get(index));
            choose.set(index, temp);
        }

        System.out.println(choose);


        Map<String, Integer> stringIntegerMap = Maps.newHashMap();

        Integer anInt = stringIntegerMap.get("11");

        System.out.println(anInt);

    }



}
