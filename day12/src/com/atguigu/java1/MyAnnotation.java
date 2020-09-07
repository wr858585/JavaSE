package com.atguigu.java1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;

/**
 * 自定义注解
 * 1. @interface
 * 2. @Retention,@Target,@Documented是三个元注解
 * 3. @Target：用于限定这个自定义注解能用在的结构上
 *      ElementType.FIELD
 *      ElementType.METHOD
 *      ElementType.TYPE：可以用在类/接口/枚举/注解等并列的结构中
 * 4. @Retention：表示此主注解的运行有效期
 *      RetentionPolicy.RUNTIME --> 表示该注解在直到运行期都有效，用的更多
 *      RetentionPolicy.CLASS --> 表示该注解在直到字节码文件中有效
 *      RetentionPolicy.SOURCE --> 仅在源码中有效
 * @author oono
 * @date 2020 09 07
 */

//元注解：修饰注解的注解，如@Target修饰注解，表示此注解可以去修饰什么结构
@Target({ElementType.METHOD,TYPE,FIELD})//表明之后注解过的结构只能用在方法上
public @interface MyAnnotation {



}
