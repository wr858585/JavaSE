package com.atguigu.java2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author oono
 * @date 2020 09 19
 */
public class GenericTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");

        //用反射创建集合对象
        Class aClass = ArrayList.class;
//        Object o = aClass.newInstance();

        //获取add()方法
        Method m1 = aClass.getMethod("add", Object.class);
        //调用方法
        m1.invoke(list,123);
        m1.invoke(list,"hello");

        System.out.println(list);//[hello, world, 123, hello],泛型只是在编译器限制，这里相当于运行时反射了一个int



    }

}
