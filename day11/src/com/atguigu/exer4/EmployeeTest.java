package com.atguigu.exer4;

import java.util.Comparator;

/**
 * @author oono
 * @date 2020 09 05
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(111,"张三丰",300000);
        employees[1] = new Employee(121,"刘三姐",150000);
        employees[2] = new Employee(108,"王老五",200000);
        employees[3] = new Employee(112,"唐老鸭",130000);
        employees[4] = new Employee(120,"猪八戒",200000);

        //用Comparable接口重写compareTo()逻辑，可以比较employees[]元素间的大小
        //此时才相当于数组中各个元素有了大小之分，之后排序还要再用冒泡等算法实现排序
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - i - 1; j++) {
                //这个条件表达式的逻辑：是我们实现Comparable重写compareTo()方法后，直接捋好的任意两个自定义类对象employee1,employee2的大小关系，所以直接用
                if(employees[j].compareTo(employees[j + 1]) > 0){
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }

        for (Employee employee : employees){
            System.out.println(employee);
        }

        //用Comparator接口来排序
        Employee[] employees1 = new Employee[5];
        employees1[0] = new Employee(111,"张三丰",300000);
        employees1[1] = new Employee(121,"刘三姐",150000);
        employees1[2] = new Employee(108,"王老五",200000);
        employees1[3] = new Employee(112,"唐老鸭",130000);
        employees1[4] = new Employee(120,"猪八戒",200000);



    }
}
