package com.atguigu.java;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 哪些操作会引起类的初始化
 * 1. 运行main方法所在的类，要先完成main方法所在类的初始化才能执行main方法，让程序运行
 * 2. 第一次使用某个类就是在new它的对象，此时这个类没有初始化的话，先完成类的初始化才会完成实例的初始化
 * 3. 调用某个类的静态成员（类变量/静态方法），此时这个类没有初始化的话，初始化
 * 4. 子类初始化时，发现其父类还没初始化，初始化父类
 * 5. 通过反射操作某个类时，若未初始化，初始化
 *
 * 哪些操作不会引起类的初始化
 * 1. 使用某个类的静态常量static final
 * 2. 通过子类调用父类的静态常量static final，静态方法static mtd，会导致父类的初始化！不会导致子类初始化
 * 3. 用某个类型声明数组并创建数组对象时，不会导致这个类的初始化（只有产生实例放入数组时才会）
 * @author oono
 * @date 2020 09 19
 */
public class ClassInitializationTest {

    static {
        System.out.println("main loading");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //以下操作会导致类的初始化
        new A();
        System.out.println(B.b);
        B.testB();
        Class.forName("com.atguigu.java.D");//mapping
        System.out.println("-----");
        //以下操作不会导致类的初始化
        System.out.println(E.VALUE);//因为在preparation阶段已经给全局常量赋值了，不会初始化，信息已经加载好直接用
        System.out.println(F.VALUE);//同理，这个信息已经在preparation阶段加载好了，不会导致类的初始化给出更多信息，因为用不到!
        F[] arr = new F[3];//数组还未初始化，没有F的实例，数组都还没初始化，也不会导致类的初始化
    }
}

class F extends E{
    static {
        System.out.println("F initialization");
    }
}
class E{
    static final int VALUE = 11;
    static{
        System.out.println("E initialization");
    }
    public static void testE(){
        System.out.println("E's static mtd");
    }
}

class A{
    static {
        System.out.println("A loading");
    }
}

class B extends C{
    static int b = 10;
    static void testB(){
        System.out.println("B's static mtd");
    }
    static{
        System.out.println("B initialization");
    }
}

class C{
    static{
        System.out.println("C initialization");
    }
}

class D{
    static{
        System.out.println("D initialization");
    }
}