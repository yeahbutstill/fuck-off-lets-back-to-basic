package com.tij4awesome.chapter1;

public class TestLampu {
    public static void main(String[] args) {
        BolaLampu bolaLampu = new BolaLampu();
        bolaLampu.on(1);
        bolaLampu.on();
        bolaLampu.off(0);
        bolaLampu.off();
        bolaLampu.brighten(50);
        bolaLampu.dim();
    }
}
