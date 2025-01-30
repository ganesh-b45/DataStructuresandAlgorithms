public class BinarySearch {
    public static int binarySearch(int[] a, int key) {
        int low = 0, high = a.length - 1, mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            if (key == a[mid]) {
                return mid;
            } else if (key < a[mid]) {
                high = mid - 1;
                low = low;
            }
            low = mid + 1;
            high = high;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;


        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

    }
}
