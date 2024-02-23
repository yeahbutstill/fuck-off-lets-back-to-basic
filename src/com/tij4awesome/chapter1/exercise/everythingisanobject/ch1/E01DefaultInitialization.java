package com.tij4awesome.chapter1.exercise.everythingisanobject.ch1;

/****************** Exercise 1 *****************
 * Create a class containing an int and a char
 * that are not initialized. Print their values
 * to verify that Java performs default
 * initialization.
 ***********************************************/
public class E01DefaultInitialization {
    int i;
    char c;

    public E01DefaultInitialization() {
        System.out.println("i = " + i);
        System.out.println("c = " + c);
    }

    public static void main(String[] args) {
        new E01DefaultInitialization();
    }
}
/***
 * Saat Anda menjalankan program, Anda akan melihat bahwa kedua variabel diberi nilai default: 0
 * untuk int, dan “spasi” untuk char.
 */