package chapter6acloserlookatmethodsandclasses.recursion;

// A simple example of recursion.
class Factorial {
    // This is a recursive function.
    int factR(int n) {
        int result;

        if (n == 1) return 1;
        result = factR(n - 1) * n; // execute the recursive call to factR()
        return result;
    }

    // This is an iterative equivalent.
    int factI(int n) {
        int t, result;

        result = 1;
        for (t = 1; t <= n; t++) result *= t;
        return result;
    }
}

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Factorials using recursive method.");
        System.out.println("Factorials of 3 is " + f.factR(3));
        System.out.println("Factorials of 4 is " + f.factR(4));
        System.out.println("Factorials of 5 is " + f.factR(5));
        System.out.println();

        System.out.println("Factorials using iterative method.");
        System.out.println("Factorials of 3 is " + f.factI(3));
        System.out.println("Factorials of 4 is " + f.factI(4));
        System.out.println("Factorials of 5 is " + f.factI(5));
        System.out.println();
    }
}
