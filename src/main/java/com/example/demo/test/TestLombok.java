package com.example.demo.test;

import org.apache.commons.lang3.Validate;

/**
 * @author orange
 * @descript
 * @Time 2017/7/31 0031
 */
public class TestLombok {

    public static void main(String[] args) {
        String topicIds = "sss";
        long userId = 0;
        Validate.notBlank(topicIds,"题目ID列表输入有误");
        Validate.isTrue(userId > 0, "用户ID有误");

    }
}
