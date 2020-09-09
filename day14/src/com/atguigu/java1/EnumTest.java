package com.atguigu.java1;

/**
 * @author oono
 * @date 2020 09 09
 */
public class EnumTest {

    public static void main(String[] args) {

        Season2 summer = Season2.SUMMER;
        System.out.println(summer);//SUMMER，enum接口写了toString，返回的是枚举类中对象的变量名！

        //Enum类中常用的方法

        //mtd1. obj.name()：返回枚举类中实例的对象名
        System.out.println(summer.name());//Summer

        //mtd2. Class.valueOf(xx)：返回一个值=xx的Class的实例
        Season2 winter = Season2.valueOf("WINTER");

        //mtd3. Class.values()：返回一个包含所有该枚举类中的枚举对象的数组
        Season2[] values = Season2.values();
        for (Season2 e : values) {
            System.out.println(e);
        }
        /*
        SPRING
        SUMMER
        AUTUMN
        WINTER
         */
    }
}

//JDK5.0之前只能自己手动创建自定义枚举类
class Season {

    private String name;

    public final static Season SPRING = new Season("春");
    public final static Season SUMMER = new Season("夏");
    public final static Season AUTUMN = new Season("秋");
    public final static Season WINTER = new Season("冬");

    private Season(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

//JDK5.0之后可以通过enum关键字来定义枚举类
enum Season1 {

    SPRING("春天"), SUMMER("夏天"), AUTUMN("秋天"), WINTER("冬天");

    private String name;

    private Season1(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

//若不需要属性，则能省的结构都能省略
enum Season2 {

    SPRING, SUMMER, AUTUMN, WINTER

}
