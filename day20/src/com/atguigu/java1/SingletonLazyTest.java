package com.atguigu.java1;

/**
 * @author oono
 * @date 2020 09 18
 */
public class SingletonLazyTest {

    public static void main(String[] args) {



    }

}

class Singleton {

    private Singleton() {

    }

    private static Singleton instance = null;

    public static Singleton getInstance() {

        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}