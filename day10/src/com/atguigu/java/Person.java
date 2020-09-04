package com.atguigu.java;

/**
 * @author oono
 * @date 2020 09 04
 */
public class Person {

    /*
    public void feed(Dog dog){
        dog.eat();
    }
     */

    /*
    public void feed(Cat cat){
        cat.eat();
    }
    */

    //
    //issue：违反了开闭原则OCP（对修改关闭，对扩展开放）
    //修改关闭：这里Person类应该已经写好了，不应该由于新加入的类而对它进行修改（这里：修改指提供更多的重载方法）
    //扩展开放：更多的类Bird，Pig等需要造，造就好了，对Animal进行扩展，但是不会去修改Animal和Person这些已经写好的类
    //      --> 自己在自己的类里玩儿

    //solution：多态
    public void feed(Animal animal){
        animal.eat();
    }

}
