package com.dicoding.javafundamental.basic.strukturdasar.solid.studi.kasus.solid;

/**
 * Selanjutnya bensin tersebut melalui proses pembakaran (combustion) untuk menghasilkan energy
 * yang dimodelkan pada class Energy.
 */
public class Energy {
    public Energy() {
    }

    void push(Piston piston) {
        piston.move();
    }
}
