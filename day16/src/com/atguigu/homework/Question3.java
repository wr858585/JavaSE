package com.atguigu.homework;

import org.junit.Test;

import java.util.*;

/**
 * 3.创建HashMap对象，
 * 	分别存储《整数，字符串》《字符串，字符串》《整数，自定义对象》
 * 	练习常用方法
 * @author oono
 * @date 2020 09 12
 */
public class Question3 {

    public static void main(String[] args) {

        Map<Integer,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();
        Map<Integer,Cat> map3 = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            map1.put(new Random().nextInt(100),String.valueOf((int)(Math.random() * 26 + 97)));
            map2.put(String.valueOf((int)(Math.random() * 26 + 97)),String.valueOf((char)(Math.random() * 26 + 97)));
            map3.put(new Random().nextInt(100),new Cat("猫猫" + (i + 1) + "号",new Random().nextInt(100),Math.random() * 10));
        }

        Set<Map.Entry<Integer, String>> entries = map1.entrySet();
        Set<Map.Entry<String, String>> entries1 = map2.entrySet();
        Set<Map.Entry<Integer, Cat>> entries2 = map3.entrySet();

        Iterator it = entries.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for (Map.Entry<String, String> stringStringEntry : entries1) {
            System.out.println(stringStringEntry);
        }

        for (Map.Entry<Integer,Cat> e : entries2){
            System.out.println(e);
        }


    }

//    @Test
//    public void test(){
//        int i = 1;
//        char c = i;
//        System.out.println(c);
//        double d = 10;
//        float f = d;
//        System.out.println(f);

}

class Cat{

    String name;
    int age;
    double weight;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Double.compare(cat.weight, weight) == 0 &&
                Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat() {
    }
}