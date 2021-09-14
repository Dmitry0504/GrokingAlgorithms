package chapter3;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(25));
    }

    public static long fact(int n) {
        if (n == 1)
            return 1;
        else
            return n * fact(n -1);
    }
}
