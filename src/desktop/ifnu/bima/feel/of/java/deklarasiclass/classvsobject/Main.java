package desktop.ifnu.bima.feel.of.java.deklarasiclass.classvsobject;

import desktop.ifnu.bima.feel.of.java.deklarasiclass.Person;

/**
 * Object adalah instansiasi dari sebuah Class. Kalau kita analogikan, class itu sebuah cetakan
 * sedangkan object itu adalah barang dari hasil cetakan. Class juga bisa dikatakan sebagai
 * kategori, sedangkan object adalah sesuatu yang memenuhi syarat-syarat yang harus dipenihi agar
 * masuk dalam kategori tersebut. Jadi bisa dibilang satu class bisa mempunyai banyak object,
 * setiap object mempunyai sifat yang sama persis seperti yang didefnisikan dalam class tersebut.
 * Kita ambil contoh adalah class Person, kemudian kita buat sebuah instance dari class Person yaitu
 * dani. Kalimat di atas kalau diwujudkan dalam kode menjadi seperti di bawah ini
 */
public class Main {

    public static void main(String[] args) {
        /**
         * Dua kata paling kiri adalah proses deklarasi sebuah object dengan tipe Person, kemudian di
         * sebelah kanan tanda sama dengan (=) terjadi proses instansiasi object dari class Person
         * menggunakan keyword new. Setiap kali kita bertemu keyword new artinya hanya satu, yaitu
         * instansiasi object dari sebuah class. Keyword new secara detail dalam level yang paling bawah,
         * menyebabkan JVM akan membuat object di dalam memory.
         */
        Person dani = new Person();
    }
}
