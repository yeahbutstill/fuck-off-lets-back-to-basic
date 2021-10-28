package chapter2introducingdatatypeandoperators.operators;

public class LToD {
    public static void main(String[] args) {
        long L;
        double D;

        L = 100012345L;
        D = L; // automatic conversion from long to double

        System.out.println("L and D: " + L + " " + D);
    }
}
