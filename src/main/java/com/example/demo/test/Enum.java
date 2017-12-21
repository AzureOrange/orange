package com.example.demo.test;

import com.example.demo.domain.enums.EnumDemo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author orange
 * @descript  枚举
 * @Time 2017/7/20 0020
 */
public class Enum {
    public static void main(String[] args) {
        System.out.println(EnumDemo.valueOf("A"));
        System.out.println(EnumDemo.A);
        System.out.println(EnumDemo.A.ordinal());  //0
        System.out.println(EnumDemo.B.ordinal());
        System.out.println(EnumDemo.values()[1]);  //B
        System.out.println(EnumDemo.B.compareTo(EnumDemo.A));  //1

        Set<String> strings=new HashSet<>();
        strings.add("2");
        strings.add("3");
        System.out.println(strings.contains("2"));  //true
        Set<String> list=new HashSet<>();
        list.add("1");
        list.add("3");
        System.out.println(strings.retainAll(list));

        List<Long> longs = Collections.EMPTY_LIST;
        System.out.println(longs.toString());

        String str = "a,b,c,,";
        String[] ary = str.split(",");
        //预期大于 3，结果是 3
        System.out.println(ary.length);

        String str2="8463,8475,8484,8495,8503,8513,8522,8530,8539,8549,8556,8563,8570";
        String[] split=str2.split (",");
        List<String> stringList =new ArrayList<> ();
        String re="";
        for (String s :split){
            stringList.add ("'"+s+"'");
            re+="'"+s+"',";
        }
        re=re.substring (0,re.length ()-1);
        System.out.println (re);
        String result = stringList.stream ().collect (Collectors.joining(","));
        System.out.println (result);

    }
}
