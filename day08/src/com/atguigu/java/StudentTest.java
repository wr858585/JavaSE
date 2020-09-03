package com.atguigu.java;

/**
 * @author oono
 * @date 2020 09 01
 */
public class StudentTest {
    public static void main(String[] args) {

        //对象数组，即：元素是对象实例，数据类型是自定义类数组
        Student[] students = new Student[66];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].name = "学生" + (i + 1);
            //学生的年龄是[18,50]
            students[i].age = (int)(Math.random() * (50-18+1) + 18);
        }

        for(Student student : students){
            System.out.println(student.name + "：" + student.age);
        }
        
    }
}
