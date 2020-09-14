package com.atguigu.java;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author oono
 * @date 2020 09 13
 */
public class TreeMapTest1 {

    public static void main(String[] args) {

        Map map = new TreeMap(new Car());
        Car car = new Car("京8888888", "法拉利");
        Car car1 = new Car("京1111111", "莱斯莱斯");
        Car car2 = new Car("京2222222", "比亚迪");
        Car car3 = new Car("京3333333", "宾利");
        Car car4 = new Car("京4444444", "法拉利");

        map.put(car.getNo(),car.getBrand());
        map.put(car1.getNo(),car1.getBrand());
        map.put(car2.getNo(),car2.getBrand());
        map.put(car3.getNo(),car3.getBrand());
        map.put(car4.getNo(),car4.getBrand());

        System.out.println(map);

    }

}

class Car implements Comparator {

    private String no;
    private String brand;

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof String && o2 instanceof String) {
            String c1 = (String) o1;
            String c2 = (String) o2;
            return - c1.compareTo(c2);
        }
        throw new RuntimeException();
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Car(String no, String brand) {
        this.no = no;
        this.brand = brand;
    }

    public Car() {
    }
}