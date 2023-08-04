package com.tij.initializationileanup;

public class VarArgs {
    public static void main(String[] args) {
        printArray(new Object[]{
                new Integer(47),
                new Float(3.14),
                new Double(11.11)
        });

        printArray(new Object[]{"One", "two", "three"});
        printArray(new Object[]{new A(), new A(), new A()});
    }

    static void printArray(Object[] args) {
        for (Object obj :
                args) {
            System.out.println(obj + " ");
        }
    }
}

class A {
}