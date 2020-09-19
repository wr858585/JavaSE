package com.atguigu.java2;

class User {

    public String name;
    private int age;
    char gender;

    public User(){}
    public User(String name){
        this.name = name;
    }
    public User(String name, int age){
        this.name = name;
        this.age = age;
    }
    private User(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int sub(int i1, int i2){
        return i1 - i2;
    }

    private void testPrivate(){
        System.out.println("私有方法被调用哦");
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void show(){

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}