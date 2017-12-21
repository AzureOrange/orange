package com.example.demo.test;

import com.example.demo.domain.entity.User;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author orange
 * @descript
 * @Time 2017/7/20 0020
 */
public class testDate {


    public static int gradeConvert(int grade, int enrollYear) {
        Calendar calendar = Calendar.getInstance();
        int nowYear = calendar.get(Calendar.YEAR);
        int nowMonth = calendar.get(Calendar.MONTH);
        int num = nowYear - enrollYear;
        if (nowMonth < 9 && num > 0) {
            num -= 1;
        }
        if (0 == num) {
            return grade;
        }
        int stage = grade / 10;
        int level = grade % 10;
        switch (grade / 10) {
            case 1:
                //小学
                if ((num + level) <= 6) {
                    level += num;
                } else if ((num + level) <= 9) {
                    stage += 1;
                    level += (num - 6);
                } else {
                    stage += 2;
                    level += (num - 9);
                }
                break;
            case 2:
                //中学
                if ((num + level) < 3) {
                    level += num;
                } else {
                    stage += 1;
                    level += (num - 3);
                }
                break;
            case 3:
                //高中
                level += num;
        }
        grade = stage * 10 + level;
        if (grade > 33) {
            grade = 33;
        }
        return grade;
    }

    public static void main(String[] args) {
//        System.out.println(gradeConvert(21, 2015));
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("aa");
        list.add("bb");
        list.add("cc");
       int i= (int) list.stream().filter (s -> s.equals ("aa")).count ();
//        list.removeIf(s -> s.equals("aa"));
        System.out.println(i);

        Set<User> users =new HashSet<>();
        users.add(new User(11,"aa",112));
        users.add(new User(22,"bb",222));
        users.add(new User(33,"cc",332));
        users.add(new User(33,"cc",332));
        users.add(new User(33,"cc",3311));

        users.forEach(user -> System.out.println (user.toString ()));
        if (users.stream().anyMatch(s -> s.getAge()==112)){
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        }
//        System.out.println(new User(33,"cc",332).equals(new User(33,"cc",3311)));
        System.out.println("@@@@@@@"+users.stream().map(x -> x.getName()).collect(Collectors.joining(",")));
//       List<User>list1=users.stream().distinct().collect(Collectors.toList());
        User user =users.stream().filter(s -> s.getId()==33 && s.getAge()==332).findFirst().get();
        System.out.println(user.toString());
        Multimap<String, User> multimap = ArrayListMultimap.create();
//        multimap.put("11",new User(11,"aa",112));
//        multimap.put("11",new User(22,"bb",222));
//        multimap.put("22",new User(2332,"bb",222));
//        multimap.put("11",new User(223,"bb",222));

        System.out.println("#############");
        List<User> user1= (List<User>) multimap.get("11");
//        User user2 =(User) multimap.get("22");  //错误 不能用单独的一个类去接收
        System.out.println(user1.toString());

        Map<String,Integer> map =new HashMap<> ();
        map.put ("11",11);
        map.put ("11",111);

        System.out.println (map.toString ());
    }
}
