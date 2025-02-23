package com.java.logic.practice;

import java.util.Random;

import static java.lang.System.*;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        Random random= new Random();

        for (int i = 0; i < arr.length; i++) {
            int j= random.nextInt(i+1);
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        out.println("\n"+ "After ShuffleArray ");
        for (int j : arr) {
            out.print(j + "\t");
        }
    }
}
