package com.atguigu.exer;

import org.junit.Test;

/**
 * @author oono
 * @date 2020 09 08
 */
public class Question4 {

    public String myReplace(String str, String target, String replace){

        int start = str.indexOf(target);

        char[] chars = str.toCharArray();
//        char[] chars1 = replace.toCharArray();

        for (int i = start; i < start + replace.length(); i++) {
            chars[i] = replace.charAt(i - start);
//            chars[i] = chars1[i - start];
        }

        return new String(chars);
    }

    @Test
    public void testMyReplace(){

        String s = myReplace("aabbccdd", "bb", "dd");
        System.out.println("s = " + s);
        String s1 = myReplace("aabbccdd", "ab", "eegg");
        System.out.println("s = " + s1);

    }


}
