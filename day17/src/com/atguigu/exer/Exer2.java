package com.atguigu.exer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author oono
 * @date 2020 09 13
 */
public class Exer2 {

    public static void main(String[] args) {

        /*
        Map的key如果是自定义类，一定要记得重写hashCode()和equals()，因为Map需要判断key是否相同，不能存一样的(values可以相同，无所谓）
         */

        //map中的key为Person对象，value为Person的名字属性

        Map<Person,String> map = new HashMap<>();

        //创建5个Person对象
        Person p1 = new Person("AA",1);
        Person p2 = new Person("BB",1);
        Person p3 = new Person("CC",1);
        Person p4 = new Person("DD",1);
        Person p5 = new Person("EE",1);
        Person p6 = new Person("EE",1);

        map.put(p1,p1.getName());
        map.put(p2,p2.getName());
        map.put(p3,p3.getName());
        map.put(p4,p4.getName());
        map.put(p5,p5.getName());
        map.put(p6,p6.getName());

        //遍历
        Set<Person> personSet = map.keySet();
        for (Person person : personSet) {
            System.out.println(person.getAge() + "=" + person.getName());
        }

    }

}

class Person{

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}