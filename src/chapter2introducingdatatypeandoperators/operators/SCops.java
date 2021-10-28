package chapter2introducingdatatypeandoperators.operators;

public class SCops {
    public static void main(String[] args) {
        int n, d, q;

        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0) {
            System.out.println(d + " is a factor of " + n);
        }
        d = 0; // now, set d to zero

        // since d is zero the second operan is not evaluated
        if (d != 0 && (n % d) == 0){
            System.out.println(d + " is a factor of " + n);
        }

        /**
         * Now try same thing without short-circuit operator
         * this will cause a divede-by-zero error
         */
        if (d != 0 & (n % d) == 0) {
            System.out.println(d + " is a factor of " + n);
        }
    }
}
