package data.structuresandalgorithms.deepdive.using.java.sortalog.recursion;

public class Main {


    // n! = n * (n - 1)!

    // recursiveFactorial(0)
    // recursiveFactorial(1)
    // recursiveFactorial(2)
    // recursiveFactorial(3)
    public static int recursiveFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);

    }

    /**********************
     * ! tanda menandakan factorial
     * 1! = 1 * 0! = 1
     * 2! = 2 * 1 = 2 * 1!
     * 3! = 3 * 2 * 1 = 3 * 2!
     * 4! = 4 * 3 * 2 * 1 = 4 * 3!
     */
    public static int iterativeFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args){

        System.out.println(iterativeFactorial(3));
        System.out.println(recursiveFactorial(3));

    }

}
