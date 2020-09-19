package com.atguigu.java2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author oono
 * @date 2020 09 19
 */
public class ReflectToGetMethodTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Class<?> aClass = Class.forName("com.atguigu.java2.User");

        //1. 获取所有方法（包括从父类等继承的）
        Method[] methods = aClass.getMethods();

        //2. 获取当前类自己声明的方法（包括私有的，但是不包括继承的）
        Method[] methods1 = aClass.getDeclaredMethods();

        //3. 获取单个的方法
        Method method = aClass.getMethod("hashCode");
        //4. 创建对象，调用方法
        User u = (User)aClass.newInstance();
        Object invoke = method.invoke(u);
        System.out.println(invoke);//21685669

        Method method1 = aClass.getDeclaredMethod("testPrivate");
        //仍然需要打开访问权限
        method1.setAccessible(true);
        Object invoke1 = method1.invoke(u);//私有方法被调用哦
        System.out.println(invoke1);//null，该方法无返回值

        //5. 获取多个参数的方法
        //必须在getDeclaredMethod的形参中，不仅传入方法名，还要传入形参的.class!!
        Method method2 = aClass.getDeclaredMethod("sub",int.class,int.class);
        Object invoke2 = method2.invoke(u, 2, 20);
        System.out.println(invoke2);//-18


    }

}
