package com.string.programs;

import java.lang.management.GarbageCollectorMXBean;
import java.util.Set;

public class ContainsVowel {
    public static void main(String[] args) {
        String s = "Programming";

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        for(char ch :s.toCharArray())
        {
            if(vowels.contains(ch))
            {
                System.out.println(ch + " is a vowel.");
            }
            else
            {
                System.out.println(ch + " is not a vowel.");
            }
        }
    }
}
