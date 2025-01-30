package com.jdk8;

@FunctionalInterface
interface StringProcessor {
    int getLength(String str);
}


public class FunctionalInterfaceExample {
    public static void main(String[] args) {
//        StringProcessor processor = str->{return str.length();};
        StringProcessor processor = str-> str.length();
        System.out.println("Length: " + processor.getLength("Hello Java 8!"));
    }
}
