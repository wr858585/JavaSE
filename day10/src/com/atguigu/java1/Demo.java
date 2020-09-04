package com.atguigu.java1;

/**
 * @author oono
 * @date 2020 09 04
 */
public class Demo {

    public static void main(String[] args) {

        Traffic[] traffic = new Traffic[2];

        Traffic bicycle = new Bicycle();
        Traffic car = new Car();

        traffic[0] = bicycle;
        traffic[1] = car;

        for (Traffic traf : traffic){
            traf.drive();
        }

    }

}

class Traffic{

    public void drive(){
        System.out.println("traffic 驾驶...");
    }

}

class Car extends Traffic{

    public void drive(){
        System.out.println("开车");
    }

}

class Bicycle extends Traffic {

    public void drive(){
        System.out.println("骑车");
    }

}