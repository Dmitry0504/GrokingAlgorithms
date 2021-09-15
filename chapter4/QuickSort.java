package chapter4;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 2, 1, 8, -1, 0};

        qSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void qSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int mid = (low + high) / 2;
        int pivot = array[mid];

        int i = low, j = high;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            qSort(array, low, j);
        if (high > i)
            qSort(array, i, high);
    }
}
