package com.atguigu.exer;

/**
 * @author oono
 * @date 2020 09 05
 */
public class Test {
    public static void main(String[] args) {

        Graphic circle = new Circle();
        circle.setRadius(5);
        double area = circle.getArea();
        System.out.println("该圆形的面积：" + area);

    }
}
