package com.example.demo.domain.exception;

/**
 * 自定义异常类
 *
 * @author orange
 * @Time 2018/2/22 0022
 */
public class MyException extends Exception {

    public MyException(){
        super();
    }
    public MyException(String msg){
        super(msg);
    }
}
