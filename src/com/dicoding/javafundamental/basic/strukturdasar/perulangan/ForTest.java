package com.dicoding.javafundamental.basic.strukturdasar.perulangan;

public class ForTest {
    public static void main(String[] args) {
        // Kita membuat variabel dengan tipe data integer yang kita sebut sebagai initialization.
        // Dalam hal ini kita menginisialisasi angka dimulai dari 1.
        // Pada tahap ini kita menentukan batasan nilai akhir suatu perulangan atau disebut dengan termination.
        // Contoh di atas adalah angka lebih kecil atau sama dengan 10.
        // Kita menentukan aksi terhadap perulangan, aksi tersebut bisa menaikkan (increment) atau menurunkan (decrement).
        // Apabila kita ingin melakukan aksi increment maka nilai awal (initialization) harus lebih kecil daripada nilai akhir (termination).
        // Begitupun sebaliknya, jika melakukan aksi menurun maka nilai awal (initialization) harus lebih besar daripada nilai akhir (termination).
        // Seperti contoh kita melakukan aksi increment.
        for (int i = 1; i <= 10; i++) {
            // Nah, apabila ketiga kondisi di atas sudah terpenuhi, pengulangan dapat tercipta.
            // Bagaimana dengan varian implementasi dengan memanfaatkan for?
            System.out.println("Angka : " + i);
        }
    }
}
