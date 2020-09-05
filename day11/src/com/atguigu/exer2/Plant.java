package com.atguigu.exer2;

/**
 * @author oono
 * @date 2020 09 05
 */
public class Plant implements Liveable{

    //abstract mtd
    @Override
    public void eat(){
        System.out.println("植物能吸收营养");
    }

    @Override
    public void breath(){
        System.out.println("植物能吸入二氧化碳，呼出氧气");
    }

    //不需要一定重写default方法（没有这个需求的话），因为也可以直接调用接口中的该方法，因为有方法体
    //不能重写static方法

}
