package com.example.demo.test;

import com.example.demo.domain.entity.Peach;
import com.example.demo.domain.entity.User;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
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
        long num = 2147483647 * 10;
        System.out.println(num ); // 结果：-10   原因：2147483647超过了int 的范围 需要加L

        char cc = 'a';

        long createTime = System.currentTimeMillis();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("缓存时间--->" + simpleDateFormat.format(createTime));

        String result  = "";

        String[] strings = result.split(",");

        List<String> list = Arrays.asList(strings);
        System.out.println(list);

        label:
            for (String s : list){
                break label; // 跳出多层嵌套循环
            }

        Peach peach = new Peach();
        peach.setName("123");
        sortPeachList(peach);
        System.out.println(peach.getName());

        User user = new User();
        System.out.println(user.getAge());
        System.out.println(user.getAge());

        User user2 = new User();
        System.out.println(user2.getName());

        BigDecimal a = new BigDecimal("3");
        BigDecimal b = new BigDecimal("2.6");
        BigDecimal c = a.subtract(b);
        double d = c.doubleValue();
        System.out.println(d);
        System.out.println("BigDecimal 的结果" + (d == 0.4));

        System.out.println("结果" + (3 - 2.6 == 0.4));

        int x1 = 0;
        int x2 = 0;
        int y = ++x1;
        int w = x2++;

        System.out.println("x1-->" + x1 +"\nx2 -->" + x2);
        System.out.println("\ny-->" + y +"\nw -->" + w);

    }

    /**
     * 按要求排序
     * @return
     */
    public static void sortPeachList(Peach peach){
        peach.setName("111");
    }



}
