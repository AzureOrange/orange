package com.example.demo.test;

import com.example.demo.domain.lambada.ReqDto;
import com.example.demo.domain.lambada.ResDto;
import com.example.demo.domain.entity.User;
import org.springframework.beans.BeanUtils;

import java.util.*;

/**
 * @author orange
 * @descript
 * @Time 2017/8/24 0024
 */
public class TestBeanUtils {

    public static void main(String[] args) {
        ReqDto reqDto = new ReqDto ();
        List<User> users = new ArrayList<> ();
        users.add (new User (1, "2", 3));
        users.add (new User (2, "3", 4));
        users.add (new User (3, "4", 1));
        users.sort ((o1, o2) -> {
            if (o1.getAge () < o2.getAge ()) {
                return 1;
            }
            return -1;
        });

      /*  users.sort (new Comparator<User> () {
            @Override
            public int compare(User o1, User o2) {
                if (o1.getAge () < o2.getAge ()) {
                    return 1;
                }
                return -1;
            }
        });*/
        System.out.println (users.toString ());
        System.out.println (users.subList (0, 2).toString ());

        User[] userArray = new User[users.size ()];
        userArray = users.toArray (userArray);
        System.out.println (userArray.toString ());

        /**
         *asList 的返回对象是一个 Arrays 内部类，并没有实现集合的修改方法。Arrays.asList
         体现的是适配器模式，只是转换接口，后台的数据仍是数组。
         * 第一种情况： list.add("c"); 运行时异常。
         * 第二种情况： str[0]= "gujin"; 那么 list.get(0)也会随之修改
         */
        String[] str = new String[]{"a", "b"};
        List list = Arrays.asList (str);


        reqDto.setId (22L);
        reqDto.setUsers (users);

        ResDto resDto = new ResDto ();

        BeanUtils.copyProperties (reqDto, resDto);

        System.out.println (resDto.toString ());

        List<String> a = new ArrayList<String> ();
        a.add ("2");
        a.add ("1");
       /* for (String temp : a) {    //报错  集合的删除操作需要用 Iterator 对象加锁
            if("1".equals(temp)){
                a.remove(temp);
            }
        }
        */
        Iterator<String> it = a.iterator ();
        while (it.hasNext ()) {
            String temp = it.next ();
            if ("1".equals (temp)) {
                it.remove ();
            }
        }
        System.out.println (a.toString ());

    }
}
