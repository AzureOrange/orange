package com.example.demo.util;

import com.alibaba.fastjson.JSON;

/**
 * FastJson
 *
 * @author orange
 * @Time 2018/12/27
 */
public class FastJsonUtil {
    public static String bean2Json(Object obj) {
        return JSON.toJSONString(obj);
    }

    public static <T> T json2Bean(String jsonStr, Class<T> objClass) {
        return JSON.parseObject(jsonStr, objClass);
    }
}
