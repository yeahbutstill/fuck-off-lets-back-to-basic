package chapter6acloserlookatmethodsandclasses.varags;

// Use varargs with standard arguments
public class VarArgs2 {

    // Here, msg is a normal parameter and v is a
    // varargs parameter.
    static void vaTest(String msg, int... v) { // A "normal" and varags parameter
        System.out.println(msg + v.length);
        System.out.println("Contest: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One varargs: ", 10);
        vaTest("One varargs: ", 1, 2, 3);
        vaTest("No varargs: ");
    }

}
