package com.atguigu.exer;

/**
 * @author oono
 * @date 2020 09 05
 */
public abstract class Graphic {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public abstract double getArea();

}
