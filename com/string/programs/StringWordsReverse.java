package com.string.programs;

public class StringWordsReverse {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split(" ");
        String r = "";
        for(String w :words)
        {
            String result="";
            for (int i = w.length()-1; i >=0 ; i--) {
                result+=w.charAt(i);
            }
            r+=result +" ";
        }
        System.out.println(r);
    }
}
