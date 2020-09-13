package com.atguigu.exer;

import java.util.*;

/**
 * @author oono
 * @date 2020 09 13
 */
public class Exer1 {

    public static void main(String[] args) {

        Map<String,List<Student>> map = new HashMap<>();//尚硅谷学校

        //创建一个班级
        List<Student> class1 = new ArrayList<>();
        class1.add(new Student("小黑",19));
        class1.add(new Student("小红",29));
        class1.add(new Student("小白",18));
        class1.add(new Student("小皮",19));

        //创建一个班级
        List<Student> class2 = new ArrayList<>();
        class2.add(new Student("大黑",19));
        class2.add(new Student("大红",29));
        class2.add(new Student("大白",18));
        class2.add(new Student("大皮",19));

        //创建一个班级
        List<Student> class3 = new ArrayList<>();
        class3.add(new Student("大黑",19));
        class3.add(new Student("大红",29));
        class3.add(new Student("大白",18));
        class3.add(new Student("大皮",19));

        //学校添加班级+编号
        map.put("java",class1);
        map.put("html",class2);
        map.put("bd",class3);

        //遍历学校的每个学生信息
        Set<Map.Entry<String, List<Student>>> entries = map.entrySet();

        for(Map.Entry<String, List<Student>> e : entries){
            String key = e.getKey();
            List<Student> value = e.getValue();
            System.out.println(key + ":" + value);
        }



    }

}

class Student{

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }
}