package chapter6acloserlookatmethodsandclasses.varags;

// Varargs, overloading, and ambiguity
// This program contains an error and will
// not compile!
public class VarArgs4 {

    // Use an int varargs parameter.
    static void vaTest(int... v) { // An int varargs.
        // ...
    }

    // Use a boolean varargs parameter.
    static void vaTest(boolean... v) { // A boolean varargs
        // ...
    }

    public static void main(String args[]) {
        vaTest(1, 2, 3); // OK
        vaTest(true, false, false); // OK
    }

}
