package com.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 50, 60, 80, 100);

        Optional<Integer> value=numbers.stream().filter(no->no>50).findFirst();

        System.out.println(value.orElse(-1));

    }
}
