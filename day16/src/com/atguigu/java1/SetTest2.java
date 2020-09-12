package com.atguigu.java1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * HashSet底层根据什么来判断两个元素是否相同？
 * 1. 比较hashCode返回的哈希值
 * 2. 比较equals
 * 如果上述两个都相同，才能判断是同一个元素
 * hashCode()方法的设计，需要尽量让不同的元素，hash值不同（相同的元素，hash值不管怎么算，hashCode()方法不管怎么写，都是相同的）
 * @author oono
 * @date 2020 09 12
 */
public class SetTest2 {

    public static void main(String[] args) {

        //存自定义类obj
        Set<Cat> set = new HashSet<>();

        //添加元素

        set.add(new Cat("小花猫", 1));
        set.add(new Cat("小黑猫", 2));
        set.add(new Cat("小丑猫", 3));
        set.add(new Cat("小猪猫", 3));
        set.add(new Cat("小牛猫", 1));
        set.add(new Cat("小牛猫", 2));
        set.add(new Cat("小牛猫", 2));
        set.add(new Cat("小牛猫", 1));

        System.out.println(set);
        //new出来的两个结构是地址不同的，所以都存进去了
        //所以我们要重写hashCode()和equals()，用内容（属性的值）来判断两个元素是否相同，从而去重

    }

}

class Cat{

    private String name;
    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        //hashCode()方法要达到的效果：
        //让内容相同的对象，哈希值一定相同（否则无法去重！因为要先比较哈希值是否一样，再比较equals()。如果哈希都不一样，直接认为两个不一样的对象，存储成功）
        //内容不相同的对象，哈希值尽量不同
        return Objects.hash(name, age);
    }
}