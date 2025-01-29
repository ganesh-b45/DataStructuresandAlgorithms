public class LinearSearchString {
    public static int searchString(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        String target = "Charlie";

        int index = searchString(names, target);

        if (index != -1) {
            System.out.println("String found at index: " + index);
        } else {
            System.out.println("String not found.");
        }
    }
}
