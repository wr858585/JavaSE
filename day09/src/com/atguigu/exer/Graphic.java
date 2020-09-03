package com.atguigu.exer;

/**
 * @author oono
 * @date 2020 09 02
 */
public class Graphic {

    private String name;

    public Graphic(){

    }
    public Graphic(String name){
        this.name = name;
    }

    public double getArea(){
        return 0.0;
    }

    public double getPerimeter(){
        return 0.0;
    }

    public String getInfo(){
        return name + ": area = " + getArea() + ", perimeter = " + getPerimeter();
    }

}
