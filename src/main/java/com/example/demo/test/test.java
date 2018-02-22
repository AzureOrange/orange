package com.example.demo.test;

import com.example.demo.domain.entity.Peach;

import java.io.UnsupportedEncodingException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

/**
 * descript
 *
 * @author orange
 * @Time 2017/9/15 0015
 */
public class test {

    public static void main(String[] args) throws UnsupportedEncodingException, UnknownHostException {
        long createTime = System.currentTimeMillis();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("缓存时间--->" + simpleDateFormat.format(createTime));

        String result  = "";

        String[] strings = result.split(",");

        List<String> list = Arrays.asList(strings);
        System.out.println(list);


        Peach peach = new Peach();
        peach.setName("123");
        sortPeachList(peach);
        System.out.println(peach.getName());
    }

    /**
     * 按要求排序
     * @return
     */
    public static void sortPeachList(Peach peach){
        peach.setName("111");
    }



}
