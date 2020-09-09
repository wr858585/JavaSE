package com.atguigu.exer;

import org.junit.Test;

/**
 * 要求：把指定位置的子字符串进行反转，输出"abfedcgho"
 * @author oono
 * @date 2020 09 08
 */
public class Question1 {

    public String reverse(String str, int start, int end){

        StringBuilder sb = new StringBuilder(str.length());
        sb = sb.append(str,0,start);

        for (int i = end; i >= start; i--) {
            sb.append(str.charAt(i));
        }

        sb = sb.append(str,end + 1,str.length());

        return new String(sb);
    }

    @Test
    public void testReverse(){

        String str = "abcdefgho";

        String reverse = reverse(str,2,5);

        System.out.println(reverse);

    }




}
