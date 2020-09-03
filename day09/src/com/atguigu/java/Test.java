package com.atguigu.java;

/**
 * @author oono
 * @date 2020 09 02
 */
public class Test {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        //父类构造器被调用...
        //子类构造器被调用...
        //因为子类构造器都会有一个super()隐藏了在构造器的首行
        //如果不写super(xxx,xxx)调用父类指定的构造器，也不用this去调其他已经调super某个构造器的构造器，则系统会默认去调用父类的空参构造器
        //总之，就是不能造成闭环；且不能造成一个类不最后指到Object类（所以也必须一个子类中至少有一个重载的构造器调用了super中的某个构造器，往上传）
        //intuition：要让所有的类最后都继承到根父类Object中的结构

    }

}
