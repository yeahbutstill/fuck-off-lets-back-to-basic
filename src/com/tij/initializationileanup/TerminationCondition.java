package com.tij.initializationileanup;

// Using finalize() to detect an object that
// hasn’t been properly cleaned up.
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // Proper cleanup:
        novel.checkIn();
        // Drop the reference, forget to clean up:
        new Book(true);
        // Force garbage collection & finalization:
        System.gc();
    }
}

class Book {
    boolean checkedOut = false;

    Book(boolean checkeOut) {
        checkedOut = checkeOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    protected void finalize() {
        if (checkedOut) System.out.println("Error: checked out");
        // Normally, you'll also do this:
        // super.finalize(); // Call the base-class version
    }
}
