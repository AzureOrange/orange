package com.example.demo.domain;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

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

    public static void main(String[] args) {
        ClassTest classTest =new ClassTest ();
        List<User> users =new ArrayList<> ();
        users.add (new User (1,"a",11));
        users.add (new User (2,"b",22));
        users.add (new User (3,"c",33));
        classTest.setId (1);
        classTest.setUsers (users);
        for (User user : classTest.getUsers ()){
            user.setId (4);
        }
        System.out.println (classTest);
        //ClassTest(id=1, users=[User{id=4, name='a', age=11}, User{id=4, name='b', age=22}, User{id=4, name='c', age=33}])

        List<User> list =classTest.getUsers ();
        for (User user :list){
            user.setName ("quit");
        }

        System.out.println (classTest);
        //ClassTest(id=1, users=[User{id=4, name='quit', age=11}, User{id=4, name='quit', age=22}, User{id=4, name='quit', age=33}])
    }
}


