package com.example.demo.test;

import org.apache.commons.collections.CollectionUtils;

import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * descript
 *
 * @author orange
 * @Time 2017/9/15 0015
 */
public class test {

    public static void main(String[] args) throws UnsupportedEncodingException {
        Set<String> set = new HashSet<> ();
        set.add ("1");
        set.add ("2");
        set.add ("3");


        List<String> list = new ArrayList<> ();
        list.add ("2");
        list.add ("3");
        list.add ("4");

        List<String> list2 = new ArrayList<> ();
        list2.add ("2");
        list2.add ("6");
        list2.add ("7");

        list.addAll (list2);
        Map<Integer,List<String>> map = new HashMap<> ();
        map.put (1,list);
        map.put (2,list2);
        List<String> list1 = map.get (3);
        System.out.println ("list1---->"+list1.toString ());
        List<String> all = list.stream ().distinct ().collect(Collectors.toList());
        System.out.println ("all---->" + all);

        set.addAll(list);
        System.out.println (set.toString ());
        list.addAll (list2);
        System.out.println (list.toString ());
        List<String> contain = (List<String>) CollectionUtils.retainAll (set,list);

        System.out.println (contain.toString ());

        long l = 1000331;
        System.out.println (l / 1000);

        byte[] i ="你好".getBytes ("utf-8");
        System.out.println (i.toString ());




    }



}
