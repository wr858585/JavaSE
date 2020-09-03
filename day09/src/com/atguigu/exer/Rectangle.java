package com.atguigu.exer;

/**
 * @author oono
 * @date 2020 09 03
 */
public class Rectangle extends Graphic{

    int chang;
    int kuan;

    public Rectangle(int chang, int kuan){
//        super();
        this.chang = chang;
        this.kuan = kuan;
    }

    @Override
    public double getArea(){
        return chang * kuan;
    }


}
