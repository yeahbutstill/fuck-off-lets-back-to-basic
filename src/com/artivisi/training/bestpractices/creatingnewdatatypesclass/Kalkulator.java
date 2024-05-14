package com.artivisi.training.bestpractices.creatingnewdatatypesclass;

public class Kalkulator extends KalkulatorImpl {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        System.out.println(kalkulator.tambah(1, 3));
        System.out.println(kalkulator.kurang(10, 4));
    }
}
