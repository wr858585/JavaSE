package com.atguigu.java2;

import java.lang.reflect.Field;

/**
 * 反射获取类的属性
 * @author oono
 * @date 2020 09 19
 */
public class ReflectToGetFieldTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {

        String s = "com.atguigu.java2.User";
        Class<?> aClass = Class.forName(s);

        //获取所有的public属性
        Field[] fields = aClass.getFields();
        System.out.println(fields.length);//1

        //获取所有的所有属性（包括private,缺省，protected等）
        Field[] declaredFields = aClass.getDeclaredFields();
        System.out.println(declaredFields.length);//3

        //获取单个属性的值
        Field name = aClass.getField("name");

//        name.set();
        //获取一个User对象
        Object o = aClass.newInstance();
        User u = (User)o;

        //给属性赋值
        //必须要指明是给哪个对象的该属性赋值，因为是实例变量！！
        //参数1：对象名 参数2：属性的值
        name.set(u,"小明花儿");

        //获取单个属性（非公共的）
        Field age = aClass.getDeclaredField("age");
        User u1 = (User) aClass.newInstance();
        //私有属性需要打开权限
        age.setAccessible(true);
        age.set(u1,16);
        System.out.println(u1.getAge());


    }

}
