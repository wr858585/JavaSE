package com.atguigu.java2;

/**
 * @author oono
 * @date 2020 09 05
 */
public class Demo {

    public static void main(String[] args) {

        Computer com = new Computer();
        Upan upan = new Upan();

        //逻辑：电脑上插入了如何Usb接口规范的设备 --> U盘
        com.setUsb1(upan);

        Ufan ufan = new Ufan();
        //插入风扇
        com.setUsb2(ufan);

        com.work();
    }
}
