package com.zamannow.oop.service;

public interface Car extends HasBrand, Maintenance {
    void drive();

    Integer getTire();

    // tidak wajib di override, aman jika interface ini sudah banyak yang implement di tiap class
    default Boolean isBig() {
        return false;
    }
}
