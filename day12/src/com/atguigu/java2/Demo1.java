package com.atguigu.java2;

import org.junit.Test;

/**
 * 程序运行过程中出现的非正常情况，如果不处理，JVM会终止
 * 程序中如何描述异常？
 *      Java把各种异常定义成了不同类来进行描述
 * 程序出现异常时，我们如何得知？
 *      Java会创建出对应的异常对象，并抛出throw
 * 异常体系：
 *      Throwable跟类
 *          Error：验证错误，我们一般无法处理，只能终止程序。如StackOverflowError,OutOfMemoryError
 *          Exception：compile/runtime exception
 * Throwable中的常用方法：
 * 1. public void printStackTrace()：打印异常信息
 * 2. public String getMessage()：返回异常信息（相当于把上一个方法中的异常信息获取到）
 * 异常抛出机制：
 * 1. 虚拟机自动跑出异常对象，打印异常信息，程序结束（之后的代码unapproachable）
 * 2.
 * @author oono
 * @date 2020 09 07
 */
public class Demo1 {

    public static void main(String[] args) {

        int[] arr = new int[3];

        int numberByIndex = getNumberByIndex(arr, 1);
        System.out.println(numberByIndex);



    }

    public static int getNumberByIndex(int[] arr, int index){
        return arr[index];
    }

    @Test
    public void testStackOverflowError(){
        int i = 1;
        testStackOverflowError();
    }

    @Test
    public void testOurOfMemoryError(){
        int[] arr = new int[1024*1024*1024];
    }

}
