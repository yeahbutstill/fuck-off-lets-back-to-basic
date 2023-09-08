package desktop.ifnu.bima.feel.of.java.deklarasiclass.method;

public class MethodStaticTest {
    /**
     * Ada beberapa keyword yang bisa ditambahkan dalam deklarasi method. Keyword yang paling
     * sering digunakan adalah static. Bagian kode Java yang dideklarasikan dengan menggunakan
     * static akan menjadi anggota dari class, bukan anggota dari object
     */

    /**
     * Karena method yang ditandai dengan static adalah bagian dari class, maka bisa diakses
     * langsung dari nama Class itu sendiri, tidak perlu membuat object. Method static hanya bisa
     * memanggil method lain dalam satu class yang juga ditandai static. Method main yang biasa
     * kita gunakan untuk menjalankan aplikasi java juga ditandai dengan static, misalnya kita akan
     * memanggil method lain dari method static, maka method lainya ini juga harus ditandai dengan
     * static. Kita lihat contoh berikutnya :
     */
    public static void main(String[] args) {
        // static method memanggil static method lain dalam class yang sama
        contohMethodStatic();
        // method static juga bisa dipanggil dari nama classnya
        MethodStaticTest.contohMethodStatic();
    }

    public static void contohMethodStatic() {
        System.out.println("Method static dipanggil");
    }
}
