package com.example.demo.test;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * 测试User这个类
 *
 * @author orange
 * @Time 2017/12/21 0021
 */
public class User_Test {

    public static void main(String[] args) {
/*        List<User> users = Lists.newArrayList();
        User user = new User(1, "ww", 2);
        User user3 = new User(3, "aa", 3);
        User user4 = new User(4, "bb", 4);
        users.add(user);
        users.add(user3);
        users.add(user4);
        Map<Integer, String> userMap = users.stream().collect(Collectors.toMap(User::getId, User::getName));
        System.out.println(userMap);

        User user2 = new User();
        BeanUtils.copyProperties(user, user2);
        System.out.println(user.toString());


        System.out.println("12\n34\t212");

        String a = "{ \"_id\" : 1 , \"costTimeTotal\" : 329}";

        String result = StringUtils.removeFirst(a, "\\{.\\\"_id\\\".:.\\d{1,2}.,.\\\"costTimeTotal\\\".\\:.");
        long num = Long.parseLong(StringUtils.remove(result, "}"));
        System.out.println(num);

        List<Integer> list = Lists.newArrayList(1, 3, 2, 3, 6);
        Collections.sort(list);
        System.out.println(list);

        System.out.println(list.indexOf(3) + 1);*/

        Set<Integer> test1 = Sets.newHashSet(1, 2, 3, 4, 5);
        Set<Integer> test2 = Sets.newHashSet(4, 5,  6, 7, 8);
        System.out.println(test1.toString());
        System.out.println(test2);
    }
}
