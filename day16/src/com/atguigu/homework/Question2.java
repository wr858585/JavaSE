package com.atguigu.homework;

import java.util.Comparator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * 2.创建TreeSet集合，分别存储整数，字符串，自定义对象，进行遍历
 * @author oono
 * @date 2020 09 12
 */
public class Question2 {

    public static void main(String[] args) {

        Set<Integer> set1 = new TreeSet<>();
        Set<String> set2 = new TreeSet<>();
        Set<Dog> set3 = new TreeSet<>(new Comparator<Dog>(){
            @Override
            public int compare(Dog d1, Dog d2){
                //1. 先按年龄排序，从小到大
                if(d1.age != d2.age) {
                    return (d1.age == d2.age) ? 0 : ((d1.age > d2.age) ? 1 : -1);
                }else{
                    //2. 再按名字排序，字母顺序从小到大
                    if(d1.name != d2.name){
                        return d1.name.compareTo(d2.name);
                    }else{
                        //3. 最后按性别排序，char从小到大
                        return (d1.gender == d2.gender)? 0 : ((d1.gender > d2.gender)? d1.gender : d2.gender);
                    }
                }
            }
        });

        for (int i = 0; i < 5; i++) {
            set1.add(new Random().nextInt());
            set2.add("主人" + (i + 1) + "号");
            set3.add(new Dog("狗狗" + (i + 1) + "号", ((new Random().nextBoolean())? '公':'母'),new Random().nextInt(10)));
        }

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);


    }

}

//class MyComparator implements
class Dog{

    String name;
    char gender;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}