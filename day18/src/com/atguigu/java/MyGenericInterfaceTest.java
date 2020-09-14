package com.atguigu.java;

/**
 * @author oono
 * @date 2020 09 14
 */
public class MyGenericInterfaceTest {

    public static void main(String[] args) {



    }

}

//自定义类1：擦除父类泛型
class Class1 implements MyGenericInterface{

    @Override
    public void show(Object obj){
        System.out.println();
    }

}

//自定义类2：将父类泛型具体化
class Class2 implements MyGenericInterface<String>{

    @Override
    public void show(String str){
        System.out.println();
    }

}

//自定义类3：保留父类泛型，但是不具体化
class Class3<T> implements MyGenericInterface<T>{

    @Override
    public void show(Object obj){
        System.out.println();
    }

}

////自定义类4：将父类中的部分泛型具体化，部分不具体化
//class Class4<E> implements MyGenericInterface<Integer,E>{
//
//    @Override
//    public void show(Object obj) {
//
//    }
//
//}

//自定义类5：擦除父类泛型，且自己新增泛型
class Class5<K,V> implements MyGenericInterface{

    @Override
    public void show(Object obj){

    }
}

//自定义类6：指明父类泛型，同时自己增加泛型
class Class6<K,V> implements MyGenericInterface<String>{

    @Override
    public void show(String s){
        System.out.println();
    }
}

//自定义类7：保留父类泛型，但是不具体化，且同时自己增加泛型
class Class7<K,V,E> implements MyGenericInterface<E>{

    @Override
    public void show(E e){

    }

}

//自定义类8：将父类泛型部分具体化，部分保留但不具体化，同时自己增加新的泛型