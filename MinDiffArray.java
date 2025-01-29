import java.util.Arrays;

public class MinDiffArray {

    public static int findMinDifference(int arr[])
    {
        if(arr == null || arr.length < 2)
        {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        Arrays.sort(arr);

        int minDiff= Integer.MAX_VALUE;

        for (int i = 1; i <arr.length; i++) {

            int diff= arr[i] - arr[i-1] ;
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }
    public static void main(String[] args)
    {
       int arr[]={2,7,77,22,55,33,12};

       int minDiff= findMinDifference(arr);
       System.out.println("The minimum difference between array elements is: " + minDiff);
    }
}
