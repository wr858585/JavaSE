package com.atguigu.java2;

import org.junit.Test;

/**
 * 异常处理机制：
 * 1. try-catch
 *      try{
 *          可能发生的异常
 *      }catch(要捕获的异常类型 对象名){
 *          针对异常的处理
 *      }
 * 2. throw和throws的区别：
 * ① throw用在方法体中；抛出一个异常对象
 * ② throws用在方法声明处，接异常的类型
 * @author oono
 * @date 2020 09 07
 */
public class Demo2 {

    @Test

    public void getNum(){

        System.out.println("程序开始");

        try{
            int a = 1 / 0;
        }catch(NullPointerException e){
            e.printStackTrace();
        }catch(ArithmeticException e){
            e.printStackTrace();
        }

        //把这个异常用try-catch处理之后，可以让程序继续运行，下面的代码得以执行
        //如果不做处理，则这里有异常，系统会终止
        //若捕获的异常不对，比如捕获空指针，但这里出现算数异常，则捕获不到，相当于仍然没有处理，程序仍然会终止
        System.out.println("程序结束");
    }


}
