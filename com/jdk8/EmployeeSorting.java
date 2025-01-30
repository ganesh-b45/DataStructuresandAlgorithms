package com.jdk8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return name + " - $" + salary;
    }
}

public class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 50000),
                new Employee("Bob", 60000),
                new Employee("Charlie", 40000)
        );



        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);

    }
}
