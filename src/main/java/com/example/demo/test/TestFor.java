package com.example.demo.test;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;
import java.util.Set;

/**
 * descript
 *
 * @author orange
 * @Time 2018/8/30 0030
 */
public class TestFor {
    private static long times = 0L;

    public static void main(String[] args) {
        List<String> source = Lists.newArrayList("1", "2", "3", "4","5");
        Set<String> midDeal = Sets.newHashSet(source);

        List<String> result = Lists.newArrayList();
        final long startTime = System.currentTimeMillis();
        dealSource(source, midDeal, result);
        System.out.println("耗时：" + (System.currentTimeMillis() - startTime));
        System.out.println("循环次数：" + times);

        Set<String> response = Sets.newHashSet(result);
        result = Lists.newArrayList(response);
        result.sort((o1, o2) -> {
            if (o1.length() > o2.length()) {
                return 1;
            }
            return -1;
        });
        System.out.println(result.size());

        for (String s : result) {
            System.out.println(s);
        }
    }

    public static void dealSource(List<String> source, Set<String> midDeal, List<String> result) {
        result.addAll(source);

        Set<String> merges = Sets.newHashSet();
        for (String m : midDeal) {
            for (int i = 0; i < source.size(); i++) {
                String s = source.get(i);
                times++;
                if (m.contains(s)) {
                    continue;
                }
                String merge = m + s;
                result.add(merge);
                merges.add(merge);
            }
        }

        if (CollectionUtils.isNotEmpty(merges)) {
            for (String s : merges) {
                if (s.length() >= source.size()) {
                    break;
                }
                dealSource(source, merges, result);
            }
        }
    }
}
