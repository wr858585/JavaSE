package com.atguigu.java2;

/**
 * @author oono
 * @date 2020 09 19
 */
public class Student {

    private String name;
    @MyAnno("tom")//例如：这个注解的value值要传给这个方法的参数
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
