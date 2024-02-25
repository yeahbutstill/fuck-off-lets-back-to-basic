package com.tij4awesome.chapter1.exercise.everythingisanobject.ch16;

// Demonstration of both constructor
// and ordinary method overloading.

/***
 * Model of a single arboreal unit.
 */
class Tree {
    /**
     * current vertical aspect to the tip
     */
    int height;

    /**
     * plant a seedling, assume height can be considered as zero
     */
    Tree() {
        System.out.println("Planting a seedling");
        height = 0;
    }

    /**
     * transplant an existing tree with a given height
     * @param initialHeight height
     */
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Creating new Tree that is " +
                height + " feet tall");
    }

    /**
     * produce information about this unit
     */
    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    /**
     * produce information with optional message
     * @param s message
     */
    void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}

/**
 * simple test code for Tree class
 */
public class E16OverloadingDoc {

    /***
     * Create <b>Tree</b> objects and exercises the two
     * different <code>info()</code> methods.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        // Overloaded constructor:
        new Tree();
    }
} /* Output:
Creating new Tree that is 0 feet tall
Tree is 0 feet tall
overloaded method: Tree is 0 feet tall
Creating new Tree that is 1 feet tall
Tree is 1 feet tall
overloaded method: Tree is 1 feet tall
Creating new Tree that is 2 feet tall
Tree is 2 feet tall
overloaded method: Tree is 2 feet tall
Creating new Tree that is 3 feet tall
Tree is 3 feet tall
overloaded method: Tree is 3 feet tall
Creating new Tree that is 4 feet tall
Tree is 4 feet tall
overloaded method: Tree is 4 feet tall
Planting a seedling
*///:~

/**
 * Konstruktor satu argumen tidak memeriksa input argumen, yang harus lebih besar dari nol. Pernyataan yang mengontrol
 * aliran eksekusi program muncul di bab selanjutnya dari TIJ4.
 */