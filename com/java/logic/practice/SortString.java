package com.java.logic.practice;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String s="shivajirao".toUpperCase();
        char ch[]=s.toCharArray();
        for (int i = 0; i < ch.length-1; i++) {
            for(int j=i+1;j< ch.length;j++)
            {
                if(ch[i]>ch[j])
                {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        String s2= new String(ch);
        System.out.println(s2);
    }
}
