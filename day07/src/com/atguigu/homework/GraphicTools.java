package com.atguigu.homework;

/**
 * @author oono
 * @date 2020 08 31
 */
public class GraphicTools {
    public static void main(String[] args) {

        GraphicTools test = new GraphicTools();
        double area = test.getArea(3, 4);
        System.out.println(area);
        double area1 = test.getArea(3,4,5);
        System.out.println(area1);

    }

    public double getArea(double base, double height) {
        return 0.5 * base * height;
    }

    public double getArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
