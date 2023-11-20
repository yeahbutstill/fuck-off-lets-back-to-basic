package com.zamannow.oop;

public class Rectangle extends Shape {
    /**
     * mengambil nilai corner
     *
     * @return int
     */
    @Override
    int getCorner() {
        return 4;
    }

    /*
    Kadang kita ingi mengakses method yang terdapat di class parent yang sudah terlanjur kita override di class child nya
    Untuk mengakses method milik class parent, kita bisa menggunakan kata kunci super
    Sederhananya, super digunakan untuk mengakses class parent
    Tidak hanya method, properties milik parent class pun bisa kita akses menggunakan kata kunci super
     */
    int getParentCorner() {
        return super.getCorner();
    }
}
