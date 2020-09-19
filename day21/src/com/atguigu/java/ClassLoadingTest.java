package com.atguigu.java;

/**
 * 类加载过程
 * 1. Loading --> Linking[Verification-Preparation-Resolution] --> Initialization
 * 2. 类的加载Loading不一定只是在使用类时才加载，JVM会预判可能会使用的类进行预先加载
 * 3. 但是初始化阶段Initialization，通常是主动使用类时，才会进行初始化！！！！！！
 *
 * @author oono
 * @date 2020 09 19
 */
public class ClassLoadingTest {

   static int a = 10;//在准备阶段，会赋值0；在初始化阶段，重新赋值10
   static final int B = 20;//在准备阶段，就直接赋值20

    static{
        a = 30;//静态代码块和显示赋值看谁在后面，覆盖前面的操作，所以a最后初始化是30
    }

    public static void main(String[] args) {

    }

}
