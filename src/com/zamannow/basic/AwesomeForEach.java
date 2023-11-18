package com.zamannow.basic;

public class AwesomeForEach {
    public static void main(String[] args) {
    /*
    Kadang kita bisa mengakses data array menggunakan perulangan
    Mengakses data Array menggunakan perulangan sangat bertele-tele, kita harus membuat counter,
    lalu mengakses array menggunakan counter yang kita buat.
    Namun untungnya, di Java terdapat perulangan ForEach, yang bisa digunakan untuk mengakses
    seluruh data di Array secara otomatis.
     */
        String[] like = {"MaKan", "Tidur", "Game", "Code", "FootBall"};
        for (var value : like) {
            System.out.println(value);
        }
    }
}
