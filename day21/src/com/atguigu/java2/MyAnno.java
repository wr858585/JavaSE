package com.atguigu.java2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author oono
 * @date 2020 09 19
 */

//元注解给两个（修饰注解的注解）
@Retention(RetentionPolicy.RUNTIME)//表示此注解在运行时都有效
@Target(ElementType.METHOD)//表示此注解仅仅可以用在方法上
//注解
public @interface MyAnno {

    //注解的属性为 var() 格式，可以在后面写default给一个默认值
    String value() default "我是一个默认值！";


}
