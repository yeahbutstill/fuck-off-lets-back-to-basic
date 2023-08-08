package com.tij.exercises.reusingclasses;

// reusing/Ex5/C.java
// TIJ4 Chapter Reusing, Exercise 5, page 245
/* Create two classes, A and B, with default constructors (empty argument
 * lists) that announce themselves. Inherit a new class called C from A, and
 * create a member of class B inside C. Do not create a constructor for C. Create
 * an object of class C and observe the resluts.
 */
public class C1 extends A1 {
    B1 b1 = new B1(); // will then constructor another A and a B

    public static void main(String[] args) {
        C1 c1 = new C1();
    }
}

class A1 {
    A1() {
        System.out.println("A1();");
    }
}

class B1 extends A1 {
    B1() {
        System.out.println("B1()");
    }
}