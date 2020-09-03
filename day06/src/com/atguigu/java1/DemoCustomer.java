package com.atguigu.java1;

/**
 * @author oono
 * @date 2020 08 29
 */
public class DemoCustomer {
    public static void main(String[] args) {

        //创建对象
        Customer cust = new Customer();

        //使用对象
        cust.name = "张四";//给属性赋值
        cust.age = 19;
        cust.gender = '男';

        System.out.println(cust.name);
        System.out.println(cust.age);
        System.out.println(cust.gender);


    }
}
