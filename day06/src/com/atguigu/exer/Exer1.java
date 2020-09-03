package com.atguigu.exer;

/**
 * @author oono
 * @date 2020 08 29
 */
public class Exer1 {
    public static void main(String[] args) {

        int[][] arr = new int[5][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
