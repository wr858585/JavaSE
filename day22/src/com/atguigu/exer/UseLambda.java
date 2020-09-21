package com.atguigu.exer;

import org.junit.Test;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

/**
 * 练习λ的使用
 *
 * @author oono
 * @date 2020 09 21
 */
public class UseLambda {

    //7. 构造器引用constructor reference：λ体只有一条语句，并且用于创建对象，则可以用：：简化
    public void test8(){
        Supplier<String> supplier = () -> new String();
        System.out.println("--Welcome Lambda--");
        Supplier<String> supplier1 = String::new;
    }

    //6. 方法引用method reference
    public void test7(){
        Stream.generate(() -> Math.random());
        System.out.println("--Welcome Lambda--");
        Stream.generate(Math::random);

        Comparator<String> comp = (s1,s2) -> s1.compareTo(s2);
        System.out.println("--Welcome Lambda--");
        Comparator<String> comp1 = String::compareTo;
    }

    //5a. 判断型接口的练习
    @Test
    public void test6(){
        EmployeeService es = new EmployeeService();
        ArrayList<Employee> employees = es.get(new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return true;//所有员工都满足条件
            }
        });
        employees.forEach(s -> System.out.println(s));
        System.out.println("--Welcome Lambda--");
        //调出所有员工对象
        System.out.println("所有员工");
        es.get(e -> true).forEach(e -> System.out.println(e));
        //调出所有年龄超过20岁的员工
        System.out.println("所有年龄大于20的员工");
        es.get(e -> e.getAge() > 20).forEach(e -> System.out.println(e));
        //调出薪资大于15000的女员工
        System.out.println("调出薪资大于20000的女员工");
        es.get(e -> e.getSalary() > 20000 && e.getGender() == 'f').forEach(e -> System.out.println(e));

    }

    //5. 判断型接口
    @Test
    public void test5(){
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("python");
        list.add("c++");

        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 4;
            }
        });

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("--Welcome Lambda--");

        list.removeIf(s -> s.contains("c"));
        list.forEach(s -> System.out.println(s));
    }

    //4. 功能型接口
    @Test
    public void test4(){
        Map<Integer,String> map = new HashMap<>();
        map.put(123,"tom");
        map.put(155,"java");
        map.put(223,"world");
        map.put(423,"C");
        map.replaceAll(new BiFunction<Integer, String, String>() {
            @Override
            public String apply(Integer integer, String s) {
                if(integer > 200){
                    s = "C++";
                }
                return s;
            }
        });
        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println(integer + s);
            }
        });
        System.out.println("--Welcome Lambda--");
        map.replaceAll((k,v) -> {
            if(k > 200){
                v = "C++";
            }
            return v;
        });
        map.forEach((k,v) -> System.out.println(k + v));
    }

    //3. 供给型接口
    @Test
    public void test3(){
        Stream<Integer> generate = Stream.generate(new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt(100);
            }
        });
        generate.limit(10).forEach(i -> System.out.println(i));

        System.out.println("--Welcome Lambda--");

        Stream.generate(() -> new Random().nextInt(100)).limit(10).forEach(s -> System.out.println(s));
    }

    //2. 消费性接口，集合中用到了
    @Test
    public void test2(){
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("JAVA");

        list.forEach(s -> System.out.println(s + 3210));
    }

    //1. 自定义的函数式接口，无参无返回值的抽象方法
    @Test
    public void test1() {
        callSomething(new Call() {
            @Override
            public void call() {
                System.out.println("老师叫你来上课");
            }
        });

        System.out.println("--Welcome Lambda--");

    }


    //使用函数式接口的方法
    public static void callSomething(Call call) {
        call.call();
    }

}

//自定义函数式接口
interface Call {
    void call();
}