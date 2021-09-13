package chapter2;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, - 3, 0, -4, 22, - 11};

        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = smallestElement(array, i);
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }

    public static int smallestElement(int[] array, int start) {
        int min = array[start];
        int indexOfMin = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }
}
