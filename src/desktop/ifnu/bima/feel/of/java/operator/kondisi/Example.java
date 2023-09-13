package desktop.ifnu.bima.feel.of.java.operator.kondisi;

public class Example {
  public static void main(String[] args) {
    /**
     * Operator Kondisi adalah ternary operator, artinya operator ini mempunyai tiga buah operand.
     * Operator kondisi akan mengevaluasi suatu kondisi yang nilainya benar (true) atau salah
     * (false), kemudian mengasign suatu nilai ke dalam variabel. Dengan kata lain, operator ini
     * mirip dengan if tetapi bertujuan untuk mengassign nilai ke sebuah variabel berdasarkan suatu
     * kondisi. Operator kondisi menggunakan simbol ? (tanda tanya) dan : (titik dua). Contohnya
     * sebagai berikut :
     */
    int x = 100;
    String s = (x < 10) ? "kurang dari sepuluh" : "lebih dari sama dengan sepuluh";
    /**
     * Kode di atas artinya: kalau variabel x kurang dari sepuluh maka assign String "kurang dari
     * sepuluh" ke dalam variabel s, sebaliknya: kalau x lebih dari sama dengan sepuluh maka assign
     * String "lebih dari sama dengan sepuluh" ke dalam variabel s. Operator kondisi bisa dirangkai
     * untuk lebih dari satu kondisi, misalnya kalau kondisi pertama benar assign suatu nilai ke
     * varibel, kalau salah tes lagi kondisi kedua, kalau benar assign nilai yang lain ke variabel
     * dan akhirnya kalau kedua kondisi juga salah assign nilai terakhir ke variabel. Struktur
     * kodenya seperti di bawah ini :
     */
    int x1 = 100;
    String s2 =
        (x < 10)
            ? "kurang dari sepuluh"
            : (x > 100)
                ? "lebih dari seratur"
                : "lebih besar sama dengan sepuluh dan kurang dari sama dengan seratus";
    /**
     * Kode di atas artinya: kalau variabel x kurang dari sepuluh assign String "kurang dari
     * sepuluh" ke variabel s, selainya: kalau x lebih dari seratus assign String "lebih dari
     * seratus" ke dalam variabel s, kalau kedua kondisi salah: assign String "lebih besar sama
     * dengan sepuluh dan kurang dari sama dengan seratus" ke dalam variabel s.
     */
  }
}
