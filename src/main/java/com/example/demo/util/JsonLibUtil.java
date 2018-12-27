package com.example.demo.util;

import net.sf.json.JSONObject;

/**
 * JsonLibUtil
 *
 * @author orange
 * @Time 2018/12/27
 */
public class JsonLibUtil {

    public static String bean2Json(Object obj) {
        JSONObject jsonObject = JSONObject.fromObject(obj);
        return jsonObject.toString();
    }

    @SuppressWarnings("unchecked")
    public static <T> T json2Bean(String jsonStr, Class<T> objClass) {
        return (T) JSONObject.toBean(JSONObject.fromObject(jsonStr), objClass);
    }
}
