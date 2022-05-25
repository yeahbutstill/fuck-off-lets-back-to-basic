package com.dicoding.javafundamental.basic.strukturdasar.solid.studi.kasus.solid;

/**
 * Kemudian terdapat class OilPipe yang memiliki method suckOil(),
 * berfungsi sebagai pipa penghubung untuk menyedot bensin dari tank
 */
public class OilPipe {
    Oil suckOil() {
        return new Oil();
    }
}
