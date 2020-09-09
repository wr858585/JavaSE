package com.atguigu.exer;

import org.junit.Test;

/**
 * 获取两个字符串中最大相同子串。
 * 比如：str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"
 * 提示：将短的那个串进行长度依次递减的子串与较长的串比较。
 *
 * @author oono
 * @date 2020 09 08
 */
public class Question3 {

    public String maxSubstring(String str, String substr){

        for (int i = 0; i <= str.length() - substr.length(); i++) {
            for (int j = 0; j < substr.length(); j++) {
                String cut = substr.substring(j, substr.length() - i);
                if(str.contains(cut)){
                    return cut;
                }
            }
        }
        return null;
    }

    @Test
    public void testMaxSubstring(){

        String s = maxSubstring("abcwerthelloyuiodef", "cvhellobnm");
        System.out.println("s = " + s);


    }

}
