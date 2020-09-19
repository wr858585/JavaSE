package com.atguigu.java1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author oono
 * @date 2020 09 19
 */
public class Demo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        String str = "com.atguigu.java1.User";

        //获取到字节码文件.class对象
        Class<?> aClass = Class.forName(str);

        //从而可以获取类的信息 --> 所有信息都能获取！啥都能获取到
        //获取属性 --> 之后就可以创造这个类的对象了！
        Constructor<?>[] constructors = aClass.getConstructors();//获得的对象又封装到了Constructor类中！万物皆对象
        System.out.println(constructors.length);//3

        //获取单个构造器，参数为Class类型
        Constructor<?> constructor = aClass.getConstructor(String.class);
        Constructor<?> constructor1 = aClass.getConstructor();
        Constructor<?> constructor2 = aClass.getConstructor(String.class, int.class);
        //通过获取到的构造器实例化
        Object o1 = constructor.newInstance("tom");
        Object o2 = constructor1.newInstance();
        Object o3 = constructor2.newInstance("jerry",12);
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        //创建对象的通用方式（方式二）
        //拿到字节码文件.class，直接调用newInstance()方法（但是只能用空参构造器！！）
        Object o4 = aClass.newInstance();
        System.out.println(o4);

        //获取私有的构造器
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class, int.class, char.class);
        declaredConstructor.setAccessible(true);//把权限修饰符给改了！这里：私有构造器变成公有的了
        Constructor<?> declaredConstructor1 = aClass.getDeclaredConstructor();


    }

}

class User{

    public String name;
    private int age;
    char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public User(){}
    public User(String name){
        this.name = name;
    }
    public User(String name, int age){
        this.name = name;
        this.age = age;
    }
    private User(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void show(){

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}