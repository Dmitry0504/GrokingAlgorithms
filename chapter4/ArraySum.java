package chapter4;

// необходимо посчитать сумму элементов массива с помощью рекурсии
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        System.out.println(sum(arr, arr.length));
    }

    public static int sum(int[] array, int i) {
        if (i <= 0)
            return 0;
        return sum(array, i - 1) + array[i - 1];
    }
}
