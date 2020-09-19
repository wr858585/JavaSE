package com.atguigu.java;

/**
 * @author oono
 * @date 2020 09 19
 */
public class ReflectionTest {

    public static void main(String[] args) throws ClassNotFoundException {

        //获取Class对象的方式

        //1. java中任意类型的字节码对象，都可以使用 类名.class来获取Class对象/Class实例
        Class cls = User.class;
        Class cls1 = String.class;
        Class cls2 = int.class;
        Class cls3 = Override.class;

        //2. obj.getClass()，通过对象调用getClass()方法
        User user = new User();
        Class cls4 = user.getClass();

        //3. Class.forName("包名全路径")，通过调用Class类的静态方法forName()
        Class cls5 = Class.forName("Override");
        Class cls6 = Class.forName("com.atguigu.java.A");//耦合度很低

        //4. 用class loader
        Class<?> cls7 = ClassLoader.getSystemClassLoader().loadClass("Override");

        //每个类加载到内存中，只有一个字节码对象（.class文件只有一个嘛，是Class的实例）
        System.out.println(cls5 == cls7);//true

    }

}

class User{

}