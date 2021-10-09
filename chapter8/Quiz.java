package chapter8;

public class Quiz {

    public static void main(String[] args) throws Exception {
        System.out.println(booleanExpression(false, false, false, false));
        System.out.println(booleanExpression(false, false, false, true));
        System.out.println(booleanExpression(false, false, true, false));
        System.out.println(booleanExpression(false, false, true, true)); //Searching for this
        System.out.println("--------");
        System.out.println(booleanExpression(false, true, false, false));
        System.out.println(booleanExpression(false, true, false, true)); //Searching for this
        System.out.println(booleanExpression(false, true, true, false)); //Searching for this
        System.out.println(booleanExpression(false, true, true, true));
        System.out.println("--------");
        System.out.println(booleanExpression(true, false, false, false));
        System.out.println(booleanExpression(true, false, false, true)); //Searching for this
        System.out.println(booleanExpression(true, false, true, false)); //Searching for this
        System.out.println(booleanExpression(true, false, true, true));
        System.out.println("--------");
        System.out.println(booleanExpression(true, true, false, false)); //Searching for this
        System.out.println(booleanExpression(true, true, false, true));
        System.out.println(booleanExpression(true, true, true, false));
        System.out.println(booleanExpression(true, true, true, true));
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {

        return (a ^ b && c ^ d) || (a ^ c && b ^ d);
    }
}
