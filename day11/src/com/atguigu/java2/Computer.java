package com.atguigu.java2;

/**
 * @author oono
 * @date 2020 09 05
 */
public class Computer {

    //该属性，表示Computer类有一个Usb接口
    private Usb usb1;
    private Usb usb2;

    public Usb getUsb1() {
        return usb1;
    }

    public void setUsb1(Usb usb1) {
        this.usb1 = usb1;
    }

    public Usb getUsb2() {
        return usb2;
    }

    public void setUsb2(Usb usb2) {
        this.usb2 = usb2;
    }

    //计算机工作，调用usb设备进行工作
    public void work() {
        if(usb1 != null) {
            usb1.service();
        }
        if(usb2 != null){
            usb2.service();
        }
    }
}
