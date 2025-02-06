package com.java.logic.practice;

import static java.lang.System.out;

public class PrintReverseRecursive {
    public static void printNumbersReverse(int n) {
        if (n >= 1) {
            out.println(n);
            printNumbersReverse(n - 1);

        }
    }

    public static void main(String[] args) {
        printNumbersReverse(5);
    }
}
