package com.example.demo.domain.lambada;

import java.util.Optional;

/**
 * @author orange
 * @descript
 * @Time 2017/7/26 0026
 */
public class OptionDemo {

    public static void main(String[] args) {
        String str="123";
//        str=null;
        System.out.println(Optional.ofNullable(str).map(String::toLowerCase).orElse("error"));
    }
}
