package com.atguigu.homework;

import com.atguigu.java.ArraysTool;

/**
 * @author oono
 * @date 2020 08 31
 */
public class ArraysTools {

    public static void main(String[] args) {
        short[] s = {1,5,6,-22,33};

        ArraysTools test = new ArraysTools();
        test.sort(s);
        for (short num : s){
            System.out.print(num + "\t");
        }

    }

    public void sort(byte[] bytes) {
        for (int i = 0; i < bytes.length; i++) {
            for (int j = 0; j < bytes.length - i - 1; j++) {
                if (bytes[j] > bytes[j + 1]) {
                    byte temp = bytes[j];
                    bytes[j] = bytes[j + 1];
                    bytes[j + 1] = temp;
                }
            }
        }
    }

    public void sort(short[] shorts) {
        for (int i = 0; i < shorts.length; i++) {
            for (int j = 0; j < shorts.length - i - 1; j++) {
                if (shorts[j] > shorts[j + 1]) {
                    short temp = shorts[j];
                    shorts[j] = shorts[j + 1];
                    shorts[j + 1] = temp;
                }
            }
        }
    }
}