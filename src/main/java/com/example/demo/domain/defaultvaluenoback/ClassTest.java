package com.example.demo.domain.defaultvaluenoback;

import com.example.demo.domain.entity.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import lombok.*;
import org.apache.commons.lang3.Validate;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author orange
 * @descript
 * @Time 2017/8/15 0015
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClassTest {
    private int id;

    @Singular
    private List<User> users;

    public static void main(String[] args) throws Exception {
        ClassTest classTest = new ClassTest();
        List<User> users = new ArrayList<>();
        users.add(new User(1, "a", 11));
        users.add(new User(2, "b", 22));
        users.add(new User(3, "c", 33));
        users.add(new User(2, "b", 232));


        Iterator<User> targetIterator = users.iterator();
        while (targetIterator.hasNext()) {
            User user = targetIterator.next();
            if (user.getId() == 2){
                targetIterator.remove();
            }
        }
        System.out.println("users----》" + users.toString());
        classTest.setId(1);
        classTest.setUsers(users);
        for (User user : classTest.getUsers()) {
            user.setId(4);
        }
        System.out.println(classTest);
        //ClassTest(id=1, users=[User{id=4, name='a', age=11}, User{id=4, name='b', age=22}, User{id=4, name='c', age=33}])

        List<User> list = classTest.getUsers();
        for (User user : list) {
            user.setName("quit");
        }

        System.out.println(classTest);
        //ClassTest(id=1, users=[User{id=4, name='quit', age=11}, User{id=4, name='quit', age=22}, User{id=4, name='quit', age=33}])


        /**
         * 有效值范围
         */
        int num = 1;
        // 0、1 有效
        Validate.inclusiveBetween(0, 1, num, "错误@@@@@@@@@@");

        /**
         * 默认值不返回
         */
        User user = new User();
        user.setId(111);
        System.out.println(user.toString()); // User{id=111, name='null', age=0}
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_DEFAULT);
        String date = objectMapper.writeValueAsString(user);
        System.out.println(date);  //{"id":111}

        Set<User> userSet = new HashSet<>();
        userSet.add(new User(1, "a", 11));
        userSet.add(new User(2, "b", 22));
        userSet.add(new User(3, "c", 33));
        userSet.add(new User(2, "b", 232));


        userSet.removeIf(user1 -> {
            if (user1.getId() == 2){
                return true;
            }
            return false;
        });

        System.out.println("remove If "+ userSet.toString());

        Map<Integer,String> stringMap = new HashMap<>();
        stringMap.put(1,"qq");
        stringMap.put(22,"ww");

        for (int i : stringMap.keySet()){
            Thread.sleep(1);
            System.out.println("结果：--->" + stringMap.get(i) + "\n" + i);
        }

        BigDecimal bigDecimal = BigDecimal.valueOf(46.95);
        System.out.println(bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue());

        long count = 3333;
        int result = 0;
        int page = (int) (count/100);
        for (int i=0; i <= page; i++){
            result += 100;
            System.out.println("size--->" + i*100 + "\n" );
        }
        System.out.println(result);

        List<User> userList = Lists.newArrayList();
        List<User> users2 = Lists.newArrayList();

        users2.add(new User(1, "a", 11));
        userList.addAll(users2);

        System.out.println(userList.toString());
    }

}


