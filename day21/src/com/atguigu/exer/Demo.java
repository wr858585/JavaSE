package com.atguigu.exer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author oono
 * @date 2020 09 19
 */
public class Demo {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException {

        String str = "com.atguigu.exer.Animal";
        Class aClass = Class.forName(str);

        Constructor<?>[] constructors = aClass.getConstructors();
        System.out.println(constructors.length);//1，目前只能获取到public构造器
        //空参实例化方式一
        Object o = aClass.newInstance();
        Animal a = (Animal)o;
        System.out.println(a.age);//5

        //空参实例化方式二
        Object o1 = constructors[0].newInstance();
        Animal a1 = (Animal)o1;
        System.out.println(a1.age);//5

        //获取私有构造器
        Constructor declaredConstructor = aClass.getDeclaredConstructor(String.class, int.class, double.class);
        //改变权限
        declaredConstructor.setAccessible(true);
        //用它造对象
//        Object o2 = declaredConstructor.newInstance();
//        Animal a2 = (Animal)o2;
//        System.out.println(a2.age);
        Field country = aClass.getDeclaredField("country");
        System.out.println(country);

    }
}

class Animal{

    public static String country = "earth";

    public String name;
    int age = 5;
    private double weight;

    public Animal() {
    }
    private Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}