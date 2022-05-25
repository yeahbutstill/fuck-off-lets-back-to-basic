package com.dicoding.javafundamental.basic.strukturdasar.solid.studi.kasus.solid;

// Di dalamnya terdapat class BatteryManagementSystem yang digunakan untuk sistem pengisian daya atau pengaturan daya
public class BatteryManagementSystem {
    Battery getBattery() {
        return new Battery(new Electrons());
    }
}
