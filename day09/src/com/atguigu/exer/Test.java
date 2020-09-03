package com.atguigu.exer;

/**
 * @author oono
 * @date 2020 09 02
 */
public class Test {

    public static void main(String[] args) {

        //如果声明为子类，则以后如果要复用这个变量，则不能更改成其他类型
        Circle c = new Circle("圆形1",10);
        //如果声明为父类，则以后如果想改成长方形，则只需要把父类的引用给到另一个子类的实例就行了。
        Graphic g = new Circle("圆形2",20);

        //这个就是多态应用的体现：可以很方便的改成另一个子类
        g = new Rectangle(2,2);

        //如果用c，则不能马上更改成另一个子类
//       c = new Rectangle(2,4);

        System.out.println(c.getArea());

        System.out.println(c.getInfo());
        System.out.println(g.getInfo());
    }
}
