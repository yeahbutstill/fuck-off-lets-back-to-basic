package chapter6acloserlookatmethodsandclasses;

// Object are passed through their references.
class Tests {
    int a, b;

    Tests(int i, int j) {
        a = i;
        b = j;
    }

    /*
    Pass an object. now, ob.a and ob.b in object
    used in the call will be changed
     */
    void change(Tests ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}

public class PassObref {
    public static void main(String[] args) {
        Tests ob = new Tests(15, 20);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.change(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}
