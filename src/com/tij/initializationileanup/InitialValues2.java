package com.tij.initializationileanup;

public class InitialValues2 {
    boolean bool = true;
    char ch = 'x';
    byte b = 47;
    short s = 0xff;
    int i = 999;
    long lng = 1l;
    float f = 3.14f;
    double d = 3.14159;
    InitialValues2 reference;

    void printInitialValues() {
        System.out.println("Data type Initial value");
        System.out.println("boolean " + bool);
        System.out.println("char [" + ch + "]");
        System.out.println("byte " + b);
        System.out.println("short " + s);
        System.out.println("int " + i);
        System.out.println("long " + lng);
        System.out.println("float " + f);
        System.out.println("double " + d);
        System.out.println("reference " + reference);
    }

    public static void main(String[] args) {
        InitialValues2 iv = new InitialValues2();
        iv.printInitialValues();
        /* You could also say
        new InitialValues().printInitialValues();
         */
    }

}
