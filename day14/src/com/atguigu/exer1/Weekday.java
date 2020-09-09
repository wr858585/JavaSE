package com.atguigu.exer1;

/**
 * @author oono
 * @date 2020 09 09
 */
public enum Weekday {

    MONDAY(1,"第一天"),
    TUESDAY(2,"第二天"),
    WEDNESDAY(3,"第三天"),
    THURSDAY(4,"第四天"),
    FRIDAY(5,"第五天"),
    SATURDAY(6,"第六天"),
    SUNDAY(7,"第七天");

    private int value;
    private String desc;

    //enum默认就是private构造器，所以可以省略
    Weekday(int value, String desc){
        this.value = value;
        this.desc = desc;
    }

    public static Weekday getWeekdayByValue(int value){
        Weekday[] values = Weekday.values();
        return values[value - 1];
    }

    @Override
    public String toString() {
        return "Weekday{" +
                "value=" + value +
                ", desc='" + desc + '\'' +
                '}';
    }
}
