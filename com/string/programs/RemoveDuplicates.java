package com.string.programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(int i=0 ;i<input.length();i++)
        {
            set.add(input.charAt(i));
        }
        System.out.println(set);
                String s = "programming";
                StringBuilder result = new StringBuilder();

                for (int i = 0; i < s.length(); i++) {
                    boolean isDuplicate = false;

                    for (int j = 0; j < i; j++) {
                        if (s.charAt(i) == s.charAt(j)) {
                            isDuplicate = true;
                            break;
                        }
                    }

                    if (!isDuplicate) {
                        result.append(s.charAt(i));
                    }
                }

                System.out.println("Without duplicates: " + result);
    }
}
