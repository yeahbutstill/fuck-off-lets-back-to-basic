package desktop.ifnu.bima.oop.inheritance.hasA.composition;

/**
 * Hubungan HAS-A lebih sederhana penjelasanya dibanding hubungan IS-A. Hubungan HAS-A atau biasa
 * disebut dengan komposisi (composition) terjadi kalau sebuah class mempunyai sebuah property.
 * Misalnya kita bisa melihat dalam kode di atas Customer HAS-A Long dengan nama id. Kita akan
 * membuat sebuah satu buah class lagi dengan nama Address, class ini akan digunakan oleh class
 * Customer untuk mendefnisikan alamat Customer. Kodenya seperti di bawah ini :
 */
public class Address {
    private String street;
    private String city;
    private String postCode;
}
