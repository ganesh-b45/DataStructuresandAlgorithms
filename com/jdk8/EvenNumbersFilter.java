package com.jdk8;

import java.util.Arrays;
import java.util.List;

public class EvenNumbersFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 21, 30, 45, 50, 67);

        numbers.stream().filter(no->no % 2 ==0).forEach(System.out::println);
    }
}
