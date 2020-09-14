package com.atguigu.exer1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/**
 * @author oono
 * @date 2020 09 12
 */
public class Exer1 {

    public static void main(String[] args) {

        Set<Employee> set = new HashSet<>();

        Employee e1 = new Employee("张一丰",new MyDate(1999,12,12));
        Employee e2 = new Employee("张二丰",new MyDate(1998,12,12));
        Employee e3 = new Employee("张三丰",new MyDate(1997,12,12));
        Employee e4 = new Employee("沙和尚",new MyDate(1997,12,12));
        Employee e5 = new Employee("沙和尚",new MyDate(1997,12,12));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator<Employee> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //如果只重写Employee类的hashCode()和equals()，仍然不能去重！（因为生成的两个沙和尚的hash值仍然不同）
        //因为name的哈希值一样了，但是MyDate类的birthday的哈希值不一样，相当于这个属性两个变量是不同的
        //所以，所有自定义类的hashCode()，equals()都是需要重写的，才对，才能保证两个元素的内容相同，哈希值相同的要求

    }

}

class Employee{

    private String name;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate{

    private int year;
    private int month;
    private int date;

    public MyDate() {
    }

    public MyDate(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year &&
                month == myDate.month &&
                date == myDate.date;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, date);
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
