package com.example.demo.test;

import com.example.demo.domain.entity.User;
import org.springframework.beans.BeanUtils;

/**
 * 测试User这个类
 *
 * @author orange
 * @Time 2017/12/21 0021
 */
public class User_Test {

    public static void main(String[] args) {
        User user = new User(1,"ww",2);
        User user2 = new User();
        BeanUtils.copyProperties(user,user2);
        System.out.println(user.toString());
    }
}
