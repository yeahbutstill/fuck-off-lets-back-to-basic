package com.dicoding.javafundamental.basic.strukturdasar.solid.studi.kasus.solid;

/**
 * Sekarang mari perhatikan kembali bagaimana pemodelan dari mesin sumber daya listrik, yang dibuat dalam bentuk
 * class ElectricEngine. Class ElectricEngine ini implement EngineInterface agar dapat digunakan sebagai parameter
 * pada class Car. Di dalamnya terdapat komponen yang berbeda dari mesin bahan bakar bensin konvensional.
 * Berikut adalah class ElectricEngine yang berisi komponen pendukung di dalamnya:
 */
// Pada class ElectricEngine, terdapat class SpeedController yang digunakan sebagai pengatur kecepatan.
public class ElectricEngine implements EngineInterface {

    private SpeedController speedController;

    public ElectricEngine(SpeedController speedController) {
        this.speedController = speedController;
    }

    @Override

    public void move() {
        speedController.control();
    }
}
