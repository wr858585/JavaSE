package com.atguigu.java2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author oono
 * @date 2020 09 19
 */
public class Test {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

//        Class aClass = Student.class;

        Class aClass = Class.forName("com.atguigu.java2.Student");

        Annotation annotation = aClass.getAnnotation(MyAnno.class);//获取类上的注解
        System.out.println(annotation);//null，因为Student类并没有任何anno修饰，只有一个MyAnno是修饰其中一个方法的

        //获取指定的方法
        Method m1 = aClass.getMethod("setName", String.class);
        //获取指定方法上的注解
        MyAnno annotation1 = m1.getAnnotation(MyAnno.class);
        System.out.println(annotation1);//@com.atguigu.java2.MyAnno()
        //获取注解的value值
        String value = annotation1.value();//@com.atguigu.java2.MyAnno(value=tom)
        //创建Student对象
        Student s = (Student)aClass.newInstance();
        //调用方法
        m1.invoke(s,value);
        System.out.println(s);//Student{name='tom'}

        /*
        注解在理解：
        1. 首先说明注解是要干什么用的，如：是要初始化name属性，则到时候相关代码会自动创建一个实例，并给属性赋值成该值
        （相当于：用注解with配套框架代码，完成了我写一个注解的值，就帮我完成了实例化+set方法调用的功能，省事儿）
        2. 所以注解一定会和反射结合，才有实际意义
         */



    }

}
