package chapter8;

public class Solution {
    public static void main(String[] args) {
        System.out.println(flipBit(10, 1));
    }

    // високосный год
    public static int leapYearCount(int year) {

        return year / 4 - year / 100 + year / 400;
    }

    public static boolean doubleExpression(double a, double b, double c) {

        return Math.abs(a + b - c) < 0.0001;
    }

    /**
     * Flips one bit of the given <code>value</code>.
     *
     * @param value     any number
     * @param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
     * @return new value with one bit flipped
     */
    // замена бита на противоположный
    public static int flipBit(int value, int bitIndex) {
        // ставим единицу в том бите который надо изменить
        int number = (int) Math.pow(2, bitIndex - 1);
        // делам xor и получаем в данном бите противоположное значение
        return value ^ number;
    }
}
