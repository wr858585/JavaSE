package com.atguigu.homework.bean02;

/**
 * @author oono
 * @date 2020 08 31
 */
public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle(3);

        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter(2));
        System.out.println(c1.getRadius());

    }
}
