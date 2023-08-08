package com.tij.exercises.reusingclasses;

// reusing/Ex7/C7.java
// TIJ4 Chapter Reusing, Exercise 7, page 246
/* Modify Exercise 5 so that A and B have constructors with arguments instead
 * of default constructors. Write a constructor for C and perform all
 * initialization within C's constructor.
 */
public class C7 extends A2 {
    private char c;
    private int i;

    C7(char a, int j) {
        super(a, j);
        c = a;
        i = j;
    }

    B2 b2 = new B2("hi", 1f); // will then constructor another A and the a B

    public static void main(String[] args) {
        C7 c = new C7('b', 2); // will constructor an A first
    }
}

class A2 {
    A2(char c, int i) {
        System.out.println("A(char c, int i)");
    }
}

class B2 extends A2 {
    B2(String s, float f) {
        super(' ', 0);
        System.out.println("B2(String s, float f)");
    }
}