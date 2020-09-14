package com.atguigu.homework;

import java.util.*;

/**
 * 1.创建LinkedHashSet分别存储整数、字符串、自定义对象，进行遍历
 * @author oono
 * @date 2020 09 12
 */
public class Question1 {

    public static void main(String[] args) {

        Set<Integer> set1 = new LinkedHashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<Staff> set3 = new LinkedHashSet<>();

        for (int i = 0; i < 5; i++) {
            set1.add(new Random().nextInt(100));
            set2.add(("同学" + i + "号"));
            set3.add(new Staff(("Staff" + i + "号"),new Random().nextInt(100)));
        }

        Iterator<Integer> it1 = set1.iterator();
        Iterator<String> it2 = set2.iterator();
        Iterator<Staff> it3 = set3.iterator();

        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        while(it3.hasNext()){
            System.out.println(it3.next());
        }

    }

}

class Staff{

    private String name;
    private int id;

    public Staff() {
    }

    public Staff(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return id == staff.id &&
                Objects.equals(name, staff.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}