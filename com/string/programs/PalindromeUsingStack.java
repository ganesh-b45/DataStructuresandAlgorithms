package com.string.programs;

import java.util.Stack;

public class PalindromeUsingStack {
    public static void main(String[] args) {
        String Str ="mom";
        Stack<Character> stack = new Stack<>();
        boolean flag = true;
        for (int i=0; i<Str.length();i++)
        {
            stack.push(Str.charAt(i));
        }
        for (int i = 0; i < Str.length(); i++) {
            if (Str.charAt(i) != stack.pop())
            {
                flag = false;
                break;
            }
        }

        System.out.println(flag?"P":"NP");
    }
}
