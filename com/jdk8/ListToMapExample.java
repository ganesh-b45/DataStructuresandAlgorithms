package com.jdk8;
import java.util.*;
import java.util.stream.Collectors;

public class ListToMapExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alicec", 50000),
                new Employee("Bob", 60000),
                new Employee("Charlie", 40000)
        );

        Map<String, Double> employeeMap = employees.stream()
                .collect(Collectors.toMap(emp -> emp.name, emp -> emp.salary));

        System.out.println(employeeMap);
    }
}
