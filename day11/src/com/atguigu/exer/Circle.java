package com.atguigu.exer;

/**
 * @author oono
 * @date 2020 09 05
 */
public class Circle extends Graphic{

    @Override
    public double getArea(){
        double radius = getRadius();
        return radius * radius * Math.PI;
    }

}
