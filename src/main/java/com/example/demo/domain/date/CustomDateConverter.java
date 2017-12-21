package com.example.demo.domain.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间转换工具
 *
 * @author orange
 * @Time 2017/12/21 0021
 */
public class CustomDateConverter {

    public Date convert(String s) {
        //实现 将日期串转成日期类型(格式是yyyy-MM-dd HH:mm:ss)

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            //转成直接返回
            return simpleDateFormat.parse(s);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //如果参数绑定失败返回null
        return null;

    }

    public static void main(String[] args) {

    }
}
