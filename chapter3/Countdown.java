package chapter3;

public class Countdown {
    public static void main(String[] args) {
        countDown(3);
    }

    public static void countDown(int i) {
        System.out.println(i);
        if (i == 0)
            return;
        else countDown(i - 1);
    }
}
