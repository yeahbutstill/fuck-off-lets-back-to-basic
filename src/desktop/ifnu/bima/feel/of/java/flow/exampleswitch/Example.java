package desktop.ifnu.bima.feel.of.java.flow.exampleswitch;

public class Example {
  public static void main(String[] args) {
    /**
     * Switch biasanya digunakan kalau kita ingin mengevaluasi nilai dari sebuah variabel yang
     * mempunyai banyak kemungkinan. Bentuk sintaks switch lebih singkat dan bersih dibanding kalau
     * menggunakan if if-else else. Hingga Java 6 switch hanya bisa digunakan kalau variabelnya
     * bertipe angka atau enum. Berikut ini bentuk dasar dari switch :
     */
    int x = 10;
    switch (x) {
      case 0:
        System.out.println("kosong");
        break;
      case 1:
        System.out.println("satu");
        break;
      case 2:
        System.out.println("dua");
        break;
      default:
        System.out.println("bukan kosong, satu atau dua");
    }
    /**
     * Dalam switch terdapat konsep yang disebut denga fall-through, konsep ini kalau kita
     * bayangkan mirip dengan efek domino, kalau kartu pertama rubuh akan menimpa kartu
     * berikutnya menimpa kartu berikutnya lagi seterusnya hingga ada yang menghentikan efek
     * dominonya. Lihat kode di atas, terdapat keyword break yang digunakan untuk menghentikan
     * fall-through. Kalau kita hilangkan break dari kode di atas, maka kalau ada satu kondisi dari
     * case yang dipenuhi maka kode di dalam case di bawahnya akan terus dieksekusi hingga
     * ketemu break atau blok kode switch berakhir.
     */
  }
}
