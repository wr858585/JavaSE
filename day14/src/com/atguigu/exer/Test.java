package com.atguigu.exer;

/**
 * @author oono
 * @date 2020 09 09
 */
public class Test {

    public static void main(String[] args) {

        Gender g = Gender.MALE;

        //switch可以使用的类型：char,byte,short,int,Enum,String
        switch(g){
            case MALE:
                System.out.println("男的");
                break;
            case FEMALE:
                System.out.println("女的");
        }

    }

}
