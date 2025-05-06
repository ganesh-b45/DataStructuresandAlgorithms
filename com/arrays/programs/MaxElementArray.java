package com.arrays.programs;

public class MaxElementArray {
    public static void main(String[] args) {
        int a[] = {100,2,3,5,11,77,1,3,4};
        int max=a[0];

        for (int i =0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Maximum element is: " + max);
    }
}
