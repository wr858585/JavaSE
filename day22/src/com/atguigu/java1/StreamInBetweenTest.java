package com.atguigu.java1;

import java.util.*;
import java.util.stream.Stream;

/**
 * Stream的中间操作
 * @author oono
 * @date 2020 09 21
 */
public class StreamInBetweenTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add("world");
        list.add("c");
        list.add("c++");
        list.add("c++");

        //1. filter(Predicate p)：接收lambda，筛选出满足条件的元素
        Stream<String> stream = list.stream();
        Stream<String> stringStream = stream.filter(e -> e.length() > 4);//中间操作
        stringStream.forEach(System.out::println);//终止操作
        System.out.println("----");

        //2. distinct()：去重
        list.stream().distinct().forEach(System.out::println);
        System.out.println("----");

        //3. limit(long maxSize)：截断流，是其元素不超过maxSize
        Stream.generate(() -> new Random().nextInt()).limit(3).forEach(System.out::println);
        System.out.println("----");

        //4. skip(long n)：跳过前n个元素不要，保留剩余的
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("----");

        //5. sorted()：自然排序返回新流
        list.stream().sorted().forEach(System.out::println);
        System.out.println("----");

        //6. sorted(Comparator com)：排序返回新流
        list.stream().sorted((s1,s2) -> -s1.compareTo(s2)).forEach(System.out::println);
        System.out.println("----");

        //7. peek(Consumer action)：接收lambda，对流中的每个数据执行lambda体操作
        list.stream().peek(s -> System.out.println(s + "PEEKED!")).forEach(System.out::println);
        System.out.println("----");

        //8. map(Function f)：接受一个函数作为参数，该函数会应用到每个元素上，并作用到新的流上
        list.stream().map(Objects::hashCode).forEach(System.out::println);
        list.stream().map(s -> s + "MAPPED!").forEach(System.out::println);
        System.out.println("----");

        //9. flatMap(Function f)：接收一个函数作为参数，将流中的每个元素转换成一个流，然后把所有流连成一个新的流
//        list.stream().flatMap(s -> {
//            char[] chars = s.toCharArray();
//            for (char aChar : chars) {
//            }
//        })

    }

}
