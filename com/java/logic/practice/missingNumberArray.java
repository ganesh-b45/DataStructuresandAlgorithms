package com.java.logic.practice;

import static java.lang.System.out;

public class missingNumberArray {

        static int missingNumber(int[] nums) {
            int n = nums.length + 1;


            for (int i = 1; i <= n; i++) {
                boolean found = false;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == i) {
                        found = true;
                        break;
                    }
                }

                if (!found)
                    return i;
            }
            return -1;
        }

        public static void main(String[] args) {
            int[] arr = {11,12,15};
            out.println(missingNumber(arr));

    }

}
