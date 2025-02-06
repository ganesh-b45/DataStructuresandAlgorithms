package com.java.logic.practice;

import static java.lang.System.*;

public class PrintNumbersRecursive {
    static void printNumbers(int n) {
    if(n>=1)
    {
        printNumbers(n-1);
        out.println(n);
    }

    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}
