package com.example.demo.test;

import com.example.demo.domain.User;

import java.math.BigDecimal;

/**
 * @author orange
 * @descript
 * @Time 2017/8/3 0003
 */
public class TestFunc {

    public static void main(String[] args) {
        User user = new User (1, "shuaiqi", 11);
//        updateUser (user);
        String name =user.getName ();
        name = "帅气";
        System.out.println (user);

       /* float f = 10;
        System.out.println (numberRetainTwoPoint (f));

        User user2 =new User(1, "shuaiqiqqqq", 11);
        User user3 =new User(2, "shuaiqiqqqq", 11);
        Map<Integer,User> userMap =new HashMap<> ();
        userMap.put (user.getId (),user);
        userMap.put (user2.getId (),user2);
        userMap.put (user3.getId (),user3);
        User user1 =userMap.get (6);
        System.out.println (user1);*/
    }

    public static void updateUser(User user) {
        user.setId (22);
    }

    public static float numberRetainTwoPoint(float number) {
        BigDecimal bigDecimal = new BigDecimal (number);
        return bigDecimal.setScale (0, BigDecimal.ROUND_HALF_UP).intValue ();
    }
}
