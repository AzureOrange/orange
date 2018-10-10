package com.example.demo.test;

import com.example.demo.domain.entity.User;

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

        String string = "";
        String[] schools = string.split(",");
        System.out.println(schools.toString());

        String a = "a";
        String b = null;
        if ("b".equals(a) && b.equals("c")){
            System.out.println("结果");
        }
    }

    public static void updateUser(User user) {
        user.setId (22);
    }

    public static float numberRetainTwoPoint(float number) {
        BigDecimal bigDecimal = new BigDecimal (number);
        return bigDecimal.setScale (0, BigDecimal.ROUND_HALF_UP).intValue ();
    }
}
