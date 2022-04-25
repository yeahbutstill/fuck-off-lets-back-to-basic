package chapter2introducingdatatypeandoperators.operators;

public class BilanganPrima {
    public static void main(String[] args) {
        int i, j;
        boolean isprime;

        for (i = 2; i < 100; i++) {
            isprime = true;

            // see if the number is evenly divisible
            for (j = 2; j <= i / j; j++) {
                // if it is, then its not prime
                if ((i % j) == 0) {
                    isprime = false;
                }
            }

            if (isprime) {
                System.out.println(i + " is prime.");
            }
        }
    }
}
