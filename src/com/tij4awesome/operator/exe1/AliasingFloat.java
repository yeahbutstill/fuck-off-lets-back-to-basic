package com.tij4awesome.operator.exe1;

import static com.tij4awesome.net.mindview.util.Print.print;

public class AliasingFloat {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        print("obj1.f = " + obj1.f);
        print("obj2.f = " + obj2.f);
        System.out.println();

        obj1.f = 5;
        obj2.f = 10;
        print("obj1.f = " + obj1.f);
        print("obj2.f = " + obj2.f);
        System.out.println();

        obj1 = obj2;
        print("After obj1 = obj2: ");
        print("obj1.f = " + obj1.f);
        print("obj2.f = " + obj2.f);
        System.out.println();

        obj1.f = 15;
        print("obj1.f = " + obj1.f);
        print("obj2.f = " + obj2.f);
        System.out.println();

        obj2.f = 20;
        print("obj1.f = " + obj1.f);
        print("obj2.f = " + obj2.f);
    }
}

class MyClass {
    float f;
}
