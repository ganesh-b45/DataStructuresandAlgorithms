package com.java.logic.practice;
import static java.lang.System.*;

public class SumNaturalNumbers {
    public static void sum(int no, int summ) {
        if (no >= 1) {
            summ += no;
            sum(no - 1, summ); // Recursive call with updated summ
        } else {
            out.println(summ); // Print the sum once recursion completes
        }
    }
    public static void main(String[] args) {
        sum(5, 0); // Initial call with starting summ as 0
    }
}
