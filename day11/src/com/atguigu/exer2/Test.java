package com.atguigu.exer2;

/**
 * @author oono
 * @date 2020 09 05
 */
public class Test {

    public static void main(String[] args) {

        Liveable animal = new Animal();
        Liveable plant = new Plant();

        animal.eat();//动物能吃东西
        animal.breath();//动物能呼吸
        animal.sleep();//动物能闭上眼睛睡觉

        plant.eat();//植物能吸收营养
        plant.breath();//植物能吸入二氧化碳，呼出氧气
        plant.sleep();//静止不动

        Liveable.drink();

    }


}
