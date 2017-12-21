package com.example.demo.domain.lambada;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.domain.Equal;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author orange
 * @descript
 * @Time 2017/7/26 0026
 */
public class LambdaDemo {

    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("w", "66");
        String s = (String) jsonObject.get("w");
        System.out.println(s);

        Set<String> strings = new HashSet<>();
        strings.add("11");
        strings.add("22");
        strings.add("33");
        strings.add("33222");
        Set<String> strings2 = new HashSet<>();
        strings2.add("11");
        strings2.add("77");
        strings.clear();
        strings.addAll(strings2);
        strings2.add("100");
        strings.add("200");
//        strings.retainAll(strings2);
//        strings= strings.stream().filter(s3 -> s3.length()>2).collect(Collectors.toSet()) ;
        System.out.println(strings.contains("11"));
        strings.forEach(s1 -> System.out.println(s1.toString()));

        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
        String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(G7Countries);

        // 用所有不同的数字创建一个正方形列表
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> dd=numbers.stream().sorted((s1,s2) -> s1-s2).sorted((s1,s2) -> s1+s2).collect(Collectors.toList());
        System.out.println("dddddd"+dd);
        List<Integer> distinct = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.printf("Original List : %s,  Square Without duplicates : %s %n", numbers, distinct);


        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        //传统
        for (Integer cost : costBeforeTax) {
            double price = cost + .12 * cost;
            System.out.println(price);
        }
        // 使用lambda表达式
        costBeforeTax.stream().map((cost) -> cost + .12 * cost).forEach(c -> System.out.println(c));
//        costBeforeTax.stream().map((cost) -> cost + .12 * cost).forEach(System.out::println);  //等价于上面的

        // 为每个订单加上12%的税
// 老方法：
        List<Integer> costBeforeTax2 = Arrays.asList(100, 200, 300, 400, 500);
        double total = 0;
        for (Integer cost : costBeforeTax2) {
            double price = cost + .12 * cost;
            total = total + price;
        }
        System.out.println("Total : " + total);

// 新方法：
        double bill = costBeforeTax2.stream().map((cost) -> cost + .12 * cost).reduce((sum, cost) -> sum + cost).get();
        System.out.println("Total : " + bill);

        Optional<Equal> equal = Optional.empty();
    }

}
