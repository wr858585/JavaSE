package com.atguigu.java1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream API
 * 1. JDK8两大新特性：Lambda，Stream
 * 2. Stream：用于处理数据
 * 3. 特点：
 * ① Stream不会自己存储数据
 * ② Stream不会改变源对象，每次处理完都会返回一个新的Stream
 * ③ Stream操作都是延迟执行的，意味着会等到需要结果的时候才会执行
 * 4. 创建Stream对象
 * ① 创建Stream：通过一个数据源，获取一个Stream
 * ② 中间操作：
 * ③ 最终操作：
 * @author oono
 * @date 2020 09 21
 */
public class StreamTest {

    public static void main(String[] args) {

        //方式一：通过集合创建Stream
        List<String> list = Arrays.asList("hello","java","world");
        Stream<String> stream = list.stream();

        //方式二：通过数组创建Stream
        IntStream stream1 = Arrays.stream(new int[]{1, 2, 3, 4, 5});
        Stream<String> stream2 = Arrays.stream(new String[]{"hello", "world"});

        //方式三：Stream.of()
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        //方式四：创建无限流对象
        Stream.generate(() -> new Random().nextInt(100));
        Stream<Integer> iterate = Stream.iterate(0, i -> i + 2);
        iterate.forEach(s -> System.out.println(s));


    }

}
