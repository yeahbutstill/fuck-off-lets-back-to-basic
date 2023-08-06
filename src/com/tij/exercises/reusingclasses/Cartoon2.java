package com.tij.exercises.reusingclasses;

// reusing/Cartoon2.java
// TIJ4 Chapter Reusing, Exercise 3, page 245
/* Prove the previous sentence. (Even if you don't create a constructor for
 * Cartoon(), the compiler will synthesize a default constructor for you that
 * calls the base-class constructor.
 */
public class Cartoon2 extends Drawing {
    public static void main(String[] args) {
        Cartoon2 x = new Cartoon2();
    }
}

class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}