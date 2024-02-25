package com.tij4awesome.chapter1.exercise.everythingisanobject.ch8;

/****************** Exercise 8 ******************
 * Write a program to demonstrate that no
 * matter how many objects you create of a
 * particular class, there is only one instance
 * of a particular static field in that class.
 ************************************************/
public class E08StaticTest {
    static int i = 47;

    public static void main(String[] args) {
        E08StaticTest st1 = new E08StaticTest();
        E08StaticTest st2 = new E08StaticTest();
        System.out.println(st1.i + " == " + st2.i);
        // bandingkan object
        System.out.println(st1.equals(st2));
        st1.i++;
        System.out.println(st1.i + " == " + st2.i);
        // bandingkan nilai field
        System.out.println(st1.i == st2.i);
    }
}
// Outputnya menunjukkan bahwa kedua instance E08StaticTest berbagi field static yang sama.
// Kami increment field yang sama melalui contoh pertama (st1.i++) dan efeknya terlihat pada contoh kedua.