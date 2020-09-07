package com.atguigu.java1;

/**
 * 注释comments：代码的说明，给user看的
 * 注解annotations：代码的检验，给compiler看的
 * 常见注解：
 * @Override 验证是否重写
 * @Deprecated 表明不建议使用
 * @SuppressedWarnings(value="unchecked") 表明让以下结构不再显示警告的信息（包括@Deprecated的删除线警告）
 * @author
 * @version
 * @author oono
 * @date 2020 09 07
 */
public class Demo1 {

    public static void main(String[] args) {

        B b = new B();
        b.test();//表明该方法已不建议使用，拥有@Deprecated注解

    }


}

interface  InterA{
    void show();
}

class A implements InterA{

    //compiler在编译时，看到此注解，会对此方法进行分析，看是否满足注解的要求，如果不满足则编译层面就不通过
    @Override
    public void show(){
        System.out.println("show...");
    }
}

class B{

    @Deprecated
    public void test(){
        System.out.println("show...");
    }
}