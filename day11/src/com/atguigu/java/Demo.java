package com.atguigu.java;

/**
 * @author oono
 * @date 2020 09 05
 */
public class Demo {



}

//有抽象方法的一定是抽象类，class前面要写abstract
//反过来，抽象类不一定有抽象方法，也可以有普通的有方法体的方法
//抽象类不能实例化，但是有构造器给子类造对象，因为子类一定有一个重载的构造器会访问super()
//抽象类的子类，必须要重写所有父类（抽象类）的抽象方法，不然该子类只能也申明为abstract class
abstract class Animal{
    //抽象方法没有方法体！没有{}
    public abstract void eat();
}

class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
}