package chapter6acloserlookatmethodsandclasses.accessmodifier;

// Public vs private access
class MyClass {
    public int beta; // public access
    int gamma; // default access
    private int alpha; // private access

    int getAlpha() {
        return alpha;
    }

    /*
    Methods to access alpha. it is OK for a
    member of a class to access a private member
    of the same class.
     */
    void setAlpha(int a) {
        alpha = a;
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        /*
        Access to alpha is allowed only through
        its accessor methods.
         */
        ob.setAlpha(-99);
        System.out.println("ob.alpha is " + ob.getAlpha());

        // you cannot access alpha like this:
        // ob.alpha = 10; // Wrong alpha is private

        // these are OK because beta and gamma are public
        ob.beta = 88;
        ob.gamma = 99;
    }
}
