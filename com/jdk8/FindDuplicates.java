package com.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple", "Banana", "Orange", "Banana", "Grapes", "Apple");
        Set<String> duplicates = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println("Duplicate Elements: " + duplicates);
    }
}
