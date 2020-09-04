package com.atguigu.java1;

/**
 * @author oono
 * @date 2020 09 04
 */
public class Demo1 {

    public static void main(String[] args) {

        Person p1 = new Man();
        Person p2 = new Woman();

        toToilet(p1);
        toToilet(p2);

    }

    public static void toToilet(Person person){
        person.toilet();
    }
}

class Person{
    public void toilet(){
        System.out.println("toilet...");
    }
}

class Man extends Person{
    @Override
    public void toilet(){
        System.out.println("男人上厕所");
    }
}

class Woman extends Person{
    @Override
    public void toilet(){
        System.out.println("女人上厕所");
    }
}