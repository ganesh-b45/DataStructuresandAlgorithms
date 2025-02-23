package com.java.logic.practice;

public class ReverseArray {
    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        int b[]={10,9,8,7,6};
        int[] newArray= new int[a.length+b.length];



        for (int i = 0; i < b.length; i++) {
            newArray[i]=b[i];
        }
        for (int i = 0; i < a.length; i++) {
            newArray[b.length+i]=a[i];
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
