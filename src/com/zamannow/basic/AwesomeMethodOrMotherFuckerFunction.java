package com.zamannow.basic;

public class AwesomeMethodOrMotherFuckerFunction {
    /*
    Method adalah block kode program yang akan berjalan saat kita panggil
     */
    public static void main(String[] args) {
        AwesomeMethodOrMotherFuckerFunction awm = new AwesomeMethodOrMotherFuckerFunction();
        awm.helloBitch();
        staticHello();
        sayFullNameBitch("Dani", "Setiawan");
        System.out.println(sum(10, 10));

        var nil = new int[]{70, 90};
        sayCongrats("Dani Setiawan", nil);
        oldSayCongrats("Maya", nil);

        System.out.println();
        System.out.println("factorialLoop " + factorialLoop(10));
        System.out.println("factorialRecursive " + factorialRecursive(10));
        System.out.println("terlaluDalam");
        terlaluDalam(100);
    }

    static void staticHello() { // tanpa harus instansikan object
        System.out.println("hoho");
    }

    /*
    Method parameter, kita bisa mengirim informasi ke method yang ingin kita panggil.
    Untuk melakukan hal tesebut, kita perlu menambahkan parameter atau argument di method yang sudah
    kita buat.
    Cara membuat parameter sama seperti cara membuat variable.
    Parameter ditempatkan di dalam kurung () dideklarasi method.
    Parameter bisa lebih dari satu, jika lebih dari satu, harus dipisahkan menggunakan tanda koma.
     */
    static void sayFullNameBitch(String firstName, String lastName) {
        System.out.println("Yooooo! " + firstName + " " + lastName);
    }

    /*
    Method return value
    Secara default, method itu tidak menghasilkan value apapun, namun jika kita ingin,
    kita bisa membuat sebuah method yang mengembalikan nilai.
    Agar method bisa menghasilkan value, kita harus mengubah kata kunci void dengan tipe data
    yang ingin dihasilkan.
    Dan didalam block method, untuk menghasilkan nilai tersebut, kita harus menggunakan kata kunci return,
    lalu diikuti dengan data yang sesuai dengan tipe data yang sudah kita deklarasikan di method.
    Di Java, kita hanya bisa menghasilkan 1 data dari sebuah method, tidak bisa lebih dari satu.
     */
    static int sum(int value1, int value2) {
        var hasil = value1 + value2;
        return hasil;
    }

    /*
    Kadang kita butuh mengirim data ke method sejumlah data yang tidak pasti
    Biasanya, agar bisa seperti ini, kita akan menggunakan Array sebagai parameter di method tersebut.
    Namun di Java, kita bisa menggunakan variable argument untuk mengirim data yang berisi sejumlah tak tentu
    bisa nol atau lebih.
    Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi terakhir parameter.
     */
    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }

        var finalValue = total / values.length;
        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ". Anda Lulus");
        } else {
            System.out.println("Coba lagi tahun depan");
        }
    }

    // tanpa variable argument
    static void oldSayCongrats(String name, int[] values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }

        var finalValue = total / values.length;
        if (finalValue >= 75) System.out.println("Selamat " + name + ". Anda Lulus");
        else System.out.println("Maaf coba lagi tahun depan");
    }

    /*
    Method Overloading
    method overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali
    Namun ada aturan yang harus dipatuhi, yaitu data parameter di method tersebut harus bebeda-beda.
    dari sisi jumlah, atau tipe data parameternya.
    Jika ada yang sama, maka program Java kita akan error saat compile.
     */
    static void sayHello() {
        System.out.println("Hey");
    }

    static void sayHello(String name) {
        System.out.println("Hey, " + name);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hey, " + firstName + " " + lastName);
    }

    /*
    Recursive Method
    recursive method adalah kemampuan method memanggil method dirinya sendiri
    Kadang memeang ada banyak problem, yang lebig mudah diselesaikan menggunakan recusive method
    seperti contohnya kasus factorial
     */
    static int factorialLoop(int value) { // factorial loop
        var result = 1;
        for (var i = 1; i <= value; i++) result *= i;
        return result;
    }

    /*
    Peroblem dengan recusive adalah method itu sangat menarik, namun kita perlu berhati-hati
    Jika recursive telalu dalam, maka akan ada kemungkinan terjadi error StackOverFlow, yaitu error
    dimana stack method terlalu banyak di Java
    Kenapa problem ini bisa terjadi? karena ketika kita memanggil method, Java akan menyimpannya di dalam stack
    jika method tersebut memanggil method lain. Maka stack akan menumpuk terus dan jika terlalu dalam
    maka stack akan terlalu besar dan bisa menyebabkan error StackOverflow.
     */
    static int factorialRecursive(int value) { // recursive loop
        if (value == 1) return 1;
        else return value * factorialRecursive(value - 1);
    }

    // error StackOverflow
    static void terlaluDalam(int value) {
        if (value == 0) System.out.println("selesai");
        else System.out.println("Loop - " + value);
        terlaluDalam(value - 1);
    }

    public void helloBitch() { // harus diinstansikan object yang ingin memanggilnya
        System.out.println("Yeah");
    }
}
