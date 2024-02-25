package com.tij4awesome.chapter1.exercise.everythingisanobject.ch6;

/**
 * Write a program that includes and calls the
 * storage() method defined as a code fragment in
 * this chapter.
 */
public class E06Storage {
    String str = "Hello, World";

    int storage(String s) {
        return s.length() * 2;
    }

    void print() {
        System.out.println("storage(s) = " + storage(str));
    }

    public static void main(String[] args) {
        E06Storage st = new E06Storage();
        System.out.println(st.str);
        System.out.println("panjang string * 2 = " + st.storage(st.str));
        st.print();
    }
}
