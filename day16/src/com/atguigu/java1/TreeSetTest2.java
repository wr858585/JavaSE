package com.atguigu.java1;

import com.atguigu.exer1.*;

import java.util.*;

/**
 * TreeSet
 * 1. 必须重写compareTo()或者compare()
 * 2. 查询效率高于链表（链表查询差）；增删效率高于数组（数组增删差）
 * @author oono
 * @date 2020 09 12
 */
public class TreeSetTest2 {

    public static void main(String[] args) {

        Set<Animal> set = new TreeSet<>(new Comparator<Animal>(){
            @Override
            public int compare(Animal a1, Animal a2){
                //1. 先按年龄排
                if(a1.getAge() != a2.getAge()){
                    return -Integer.compare(a1.getAge(), a2.getAge());
                }else{
                    //2. 再按体重排
                    if(a1.getWeight() != a2.getWeight()){
                        return -Double.compare(a1.getWeight(), a2.getWeight());
                    }else{
                        //3. 最后按名字排
                        return -a1.getName().compareTo(a2.getName());
                    }
                }
            }
        });

        for (int i = 0; i < 10; i++) {
            set.add(new Animal("小猫" + (i + 1) + "号",(int)(new Random().nextInt(10)),(double)(new Random().nextInt(10))));
        }

        for (Animal animal : set) {
            System.out.println(animal);
        }

    }

}

class Animal {

    private String name;
    private int age;
    private double weight;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Double.compare(animal.weight, weight) == 0 &&
                Objects.equals(name, animal.name);
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

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Animal() {
    }
}