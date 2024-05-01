package com.tij4awesome.chapter1;

import com.tij4awesome.chapter1.StaticTest;

public class Incrementable {
    // logika serupa juga berlaku untuk method static.
    // Anda bisa merujuk ke method static baik melalui object seperti yang anda bisa dengan method apapun
    // atau dengan sintak tambahan khusus "ClassName.method()"
    static void increment() {
        System.out.println(StaticTest.i++);
    }
}
