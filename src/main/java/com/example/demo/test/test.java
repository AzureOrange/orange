package com.example.demo.test;

import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * descript
 *
 * @author orange
 * @Time 2017/9/15 0015
 */
public class test {

    public static void main(String[] args) throws UnsupportedEncodingException, UnknownHostException {
        String str = "1,2";
        String[] strArray = str.split(",");

        System.out.println("数组长度---" + strArray.length);

        InetAddress address = InetAddress.getLocalHost();

        System.out.println(address.getHostName() + "\n" +address.getHostAddress() + "\n" + address.getAddress().toString());
    }



}
