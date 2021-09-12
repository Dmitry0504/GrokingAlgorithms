package chapter1;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[1000];
        fillArray(array);

        System.out.println(search(array, 1111));
    }

    static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }

    static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

}
