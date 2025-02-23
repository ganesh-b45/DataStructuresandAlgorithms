package com.java.logic.practice;

public class ReverseArray {
    public static void main(String[] args) {
        int a[]={5,4,3,2,1};

        int[] newArray= new int[a.length];
        int index=0;

        for (int i = a.length-1; i >=0 ; i--) {
            newArray[index++]=a[i];

        }

         for(int i=0;i<newArray.length;i++)
        System.out.println(newArray[i]);
    }
}
