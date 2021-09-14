package chapter3;

public class Parentheses {
    public static void main(String[] args) {
        parentheses(3, 0,0, "");
    }

    public static void parentheses(int n, int left, int right, String str) {

        if (left == n && right == n)
            System.out.println(str);

        else {
            if (left < n) {
                parentheses(n, left + 1, right, str + "(");
            }

            if (right < left) {
                parentheses(n, left, right + 1, str + ")");
            }
        }

    }
}
