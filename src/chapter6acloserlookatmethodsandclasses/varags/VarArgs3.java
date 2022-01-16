package chapter6acloserlookatmethodsandclasses.varags;

// Varargs and overloading
public class VarArgs3 {

    static void vaTest(int... v) { // First version of vaTest()
        System.out.println("vaTest(int ...): " + "Number of args: " + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    static void vaTest(boolean... v) { // Second version of vaTest()
        System.out.println("vaTest(boolean ...): " + "Number of args: " + v.length);
        System.out.println("Contest: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    static void vaTest(String msg, int... v) { // Third version of vaTest
        System.out.println("vaTest(String, int ...): " + msg + v.length);
        System.out.println("Contests: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        vaTest(1, 2, 3);
        vaTest("Testing: ", 10, 20);
        vaTest(true, false, false);
    }

}
