package com.atguigu.java;

/**
 * 统计1-100之间的自然数
 * @author oono
 * @date 2020 09 01
 */
public class Demo {
    public static void main(String[] args) {

        //方式一：for循环
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);//5050

        Demo test = new Demo();
        int sum1 = test.sum(100);
        System.out.println(sum1);//

        int sum2 = test.sum1(100);
        System.out.println(sum2);

        int product = test.product(5);
        System.out.println(product);//5*4*3*2*1=120

    }

    //方式二：递归

    public int sum(int num){
        if(num == 1){
            return num;
        }
        return sum(num - 1) + num;
    }

    public int sum1(int n){
        //定义这个sum变量只会初始化当前方法的sum值，不会影响上一个方法的sum。如：n=100，sum=100+sum(99)，之后sum(99)的sum=0，跟sum(100)的sum没有关系，所以结果不会输出0，而是正确的5050
        int sum = 0;
        if(n == 1){
            sum = 1;
        }else{
            sum = n + sum1(n -1 );
        }
        return sum;
    }

    public int product(int n){
        if(n == 1){
            return 1;
        }
        return product(n - 1) * n;
    }
}
