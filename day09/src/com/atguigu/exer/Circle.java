package com.atguigu.exer;

/**
 * @author oono
 * @date 2020 09 02
 */
public class Circle extends Graphic{

    double radius;

    //必须要提供这个带参的构造器，否则报错，因为父类Circle没有空参的构造器，所以这里必须显示调用那个super(name)
    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }


}
