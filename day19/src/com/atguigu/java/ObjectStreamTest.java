package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * 对象流
 * 0. ObjectOutputStream,ObjectInputStream
 * 1. 可以把java的对象/实例写入文件中，也可以从文件读取到内存中
 * 2. 用readObject()，writeObject(Object obj)方法！！
 * 3. 序列化：把java对象存储到文件中或者网络中传输，需要实现接口Serializable
 * 4. 反序列化：把文件中或网络中存储的对象，还原到内存中，就是反序列化
 * @author oono
 * @date 2020 09 15
 */
public class ObjectStreamTest {

    @Test
    public void test1() throws IOException {

        Student student = new Student("tom", 11);

        //创建一个对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));

        //特有方法:writeObject(Object obj)
        oos.writeObject(student);//java.io.NotSerializableException: com.atguigu.java.Student
        //注意：class Student必须要实现序列化接口，否则在传输此类的实例的时候，报异常

        oos.close();
    }

    @Test
    public void test2() throws IOException, ClassNotFoundException {


        //创建一个对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));

        Object obj = ois.readObject();

        System.out.println(obj);
        Student student = (Student)obj;
        System.out.println(student.name);
        System.out.println(student.age);

        ois.close();


    }
}


class Student implements Serializable {
    private static final long serialVersionUID = -7924058963759249066L;
//    private static final long serialVersionUID = -7924058963759249066L;

    //加入这个serialVersionUID全局常量之后，可以更改这个类的结构。之后再次用对象流读取/写入时，仍能让sys知道这个对象是这个类中的实例！
    //如果没有写这个序列号常量，则会在修改此类结构后，比如之前写出来的对象，再用这个对象流读取，则会报错invalidClass......之类的异常
//    private static final long serialVersionUID = -129138131l;

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
