package com.atguigu.homework;

import java.util.*;

/**
 * 双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1—33
 * 中选择；蓝色球号码从1—16中选择；请随机生成一注双色球号码。（要求同色号码不重复）
 * @author oono
 * @date 2020 09 12
 */
public class Question7 {

    public static void main(String[] args) {

        Set<Integer> red = new TreeSet<>();

        for (; red.size() < 6; ) {
            red.add((int)(Math.random() * (33 - 1 + 1) + 1));
        }

        List<Integer> lotto = new ArrayList<>();
        lotto.addAll(red);

        int blue = (int)(Math.random() * (16 - 1 + 1) + 1);
        lotto.add(blue);

        System.out.println("双色球的所有号码是：" + lotto);

        System.out.println("红色号码：" + red + "蓝色号码：" + blue);



    }

}
