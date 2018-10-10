package com.example.demo.test;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.apache.commons.lang3.RandomUtils;

import java.util.List;
import java.util.Set;

/**
 * descript
 *
 * @author orange
 * @Time 2018/7/24 0024
 */
public class test3 {

    public static void main(String[] args) {

        List<Integer> topicIdList = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        Set<Integer> wrongTopicRandom = Sets.newHashSet();

        // 随机生成10个数
        for (int i = 0; i < 10; i++) {
            int num = RandomUtils.nextInt(0, topicIdList.size() - 1);
            wrongTopicRandom.add(topicIdList.get(num));
            System.out.println(topicIdList.get(num));
            topicIdList.remove(num);
        }

        System.out.println(wrongTopicRandom);

        String str = "dasd12123你好1";
        System.out.println(isLetterDigitOrChinese(str));

        if (str.equals(null)){
            System.out.println(11);
        }

    }

    /**
     * 匹配英文数字中文
     *
     * @param str
     * @return
     */
    public static boolean isLetterDigitOrChinese(String str) {
        String regex = "^[a-z0-9A-Z\u4e00-\u9fa5]+$";//其他需要，直接修改正则表达式就好
        return str.matches(regex);
    }
}
