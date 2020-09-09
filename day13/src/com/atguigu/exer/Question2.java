package com.atguigu.exer;

import org.junit.Test;

/**
 * 获取一个字符串在另一个字符串中出现的次数。
 * 比如：获取"ab"在 “abababkkcadkabkebfkabkskab”中出现的次数
 *
 * @author oono
 * @date 2020 09 08
 */
public class Question2 {

    public int getCount(String str, String substr) {

        StringBuilder sb1 = new StringBuilder(str);
        StringBuilder sb2 = new StringBuilder(substr);

        int count = 0;

        int start = sb1.indexOf(substr);

        if (start != -1) {
            count++;
        } else {
            return 0;
        }

        for (int i = start + 1; i <= sb1.length() - sb2.length(); i++) {
            String cut = sb1.substring(i, i + sb2.length());
            if (cut.equals(substr)) {
                count++;
            }
        }

        return count;

    }

    @Test
    public void testGetCount() {

        int count = getCount("abababkkcadkabkebfkabkskab", "ab");
        System.out.println("count = " + count);
        int count1 = getCount("abababkkcadkabkebfkabkskab", "ka");
        System.out.println("count1 = " + count1);
        int count2 = getCount("abababkkcadkabkebfkabkskab", "c");
        System.out.println("count1 = " + count2);
        int count3 = getCount("abababkkcadkabkebfkabkskab", "abab");
        System.out.println("count1 = " + count3);

    }
}