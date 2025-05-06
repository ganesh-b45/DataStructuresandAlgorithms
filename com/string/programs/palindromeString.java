package com.string.programs;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {

        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean flag = true;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                flag = false;
            }
        }
        System.out.println(flag?"Palindrome":"String is not palindrome");
//        int no = 1212;
//        String s1 = String.valueOf(no);
//        System.out.println(no);
//        System.out.println(s1);


    }
}
