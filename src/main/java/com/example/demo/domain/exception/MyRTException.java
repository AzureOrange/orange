package com.example.demo.domain.exception;

/**
 * 自定义运行异常类
 *
 * @author orange
 * @Time 2018/2/22 0022
 */
public class MyRTException extends RuntimeException {    //或者继承任何标准异常类
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public MyRTException(){ //用来创建无参数对象

    }

    public MyRTException(String message) {        //用来创建指定参数对象
        super(message);                             //调用超类构造器
    }

}
