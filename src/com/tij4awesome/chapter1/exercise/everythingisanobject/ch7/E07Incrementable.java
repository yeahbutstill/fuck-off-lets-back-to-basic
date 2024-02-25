package com.tij4awesome.chapter1.exercise.everythingisanobject.ch7;

/****************** Exercise 7 ******************
 * Turn the Incrementable code fragments into a
 * working program.
 ************************************************/
public class E07Incrementable {
    public static void main(String[] args) {
        E07Incrementable sf = new E07Incrementable();
        sf.increment();
        E07Incrementable.increment();
        increment();
    }

    static void increment() {
        int i = StaticTest.i++;
        System.out.println(i);
    }
}
// Anda dapat memanggil increment() dengan sendirinya karena
// metode static (main(), dalam hal ini) dapat memanggil metode static lain tanpa kualifikasi.