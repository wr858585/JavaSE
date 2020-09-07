package com.atguigu.java2;

/**
 * 自定义异常类/异常体系
 * @author oono
 * @date 2020 09 07
 */
public class MyException extends RuntimeException{

    public MyException() {
    }
    public MyException(String message){
        super(message);
    }

}
