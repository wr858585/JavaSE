package com.atguigu.java;

/**
 * 获取类加载器的方式
 * 1.
 * @author oono
 * @date 2020 09 19
 */
public class GetClassLoaderTest {

    public static void main(String[] args) {

        //获取指定类的class loader instance
        ClassLoader classLoader = GetClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2：AppClassLoader

        //获取当前线程上下文class loader
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(contextClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2：同一个类加载器！

        //获取当前类class loader
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2：还是它！！

        System.out.println("------------------------");

        //获取一个class loader的父加载器
        System.out.println(classLoader.getParent());//sun.misc.Launcher$ExtClassLoader@1540e19d
        System.out.println(classLoader.getParent().getParent());//null，因为Bootstrap classloader是C++写的，拿不到

    }

}
