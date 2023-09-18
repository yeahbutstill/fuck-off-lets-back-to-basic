package desktop.ifnu.bima.feel.of.java.oop;

/**
 * Hubungan HAS-A lebih sederhana penjelasanya dibanding hubungan IS-A. Hubungan HAS-A atau
 * biasa disebut dengan komposisi (composition) terjadi kalau sebuah class mempunyai sebuah
 * property. Misalnya kita bisa melihat dalam kode di atas Customer HAS-A UUID dengan nama id.
 * Kita akan membuat sebuah satu buah class lagi dengan nama Address, class ini akan digunakan
 * oleh class Customer untuk mendefnisikan alamat Customer
 */
public class Address {
    private String street;
    private String city;
    private String postCode;
}
