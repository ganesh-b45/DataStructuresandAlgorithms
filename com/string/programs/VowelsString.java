package com.string.programs;

import java.util.HashSet;
import java.util.Set;

public class VowelsString {
    public static void main(String[] args) {
        String s = "java programming";
        int Count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
               Count++;
                System.out.println(s.charAt(i) + " is a vowel.");
            }
        }
        System.out.println("count of vowels is :"+Count);

        String s1 = "example";
        Set<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int c=0;
        for (int i = 0; i <s1.length() ; i++) {
            if(vowels.contains(s.charAt(i)))
            {
                c++;
            }
        }
        System.out.println("count of vowels is :"+c);

    }
}
