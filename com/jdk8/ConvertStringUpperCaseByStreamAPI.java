package com.jdk8;

import java.util.Arrays;
import java.util.List;

public class ConvertStringUpperCaseByStreamAPI {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "spring", "hibernate");

//        using lamda expression
       names.stream().map(str->str.toUpperCase()).forEach(System.out::println);

//        using method reference
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
