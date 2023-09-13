package desktop.ifnu.bima.feel.of.java.operator.bitwise;

public class Negasi {
  public static void main(String[] args) {
    int x = 11;
    int z = ~x;
    /**
     * Setelah operasi selesai nilai variabel z adalah -12. Kok bisa? Sebelum kita bahas kenapa
     * hasilnya bisa negatif, perlu kita bahas dahulu bagaimana komputer merepresentasikan bilangan
     * negatif dan positif.
     */
    System.out.println(Integer.toBinaryString(x));
    System.out.println(Integer.toBinaryString(z));
    System.out.println(z);

    /**
     * Processor dan memory pada dasarnya hanya mengenal bilangan binari, angka desimal yang kita
     * lihat juga pada dasarnya disimpan sebagai binari. Angka binari tidak mempunyai notasi negatif
     * atau positif, untuk menandakan angka negatif atau positif dalam memory, digunakanlah teori
     * yang disebut dengan 2's complement. Untuk mendapatkan representasi binari nilai negatif
     * dilakukan tiga langkah, pertama ubah nilai positifnya menjadi binary, lakukan negasi dan
     * terakhir tambahkan satu ke hasil negasi.
     */

    /**
     * Mari kita lihat bagaimana membuat representasi binari dari nilai negatif -11. Pertama kita
     * buat representasi binari dari angka 11, tipe data yang dioperasikan adalah integer, maka
     * panjang datanya adalah 32 bit, seperti di bawah ini :
     */

    
  }
}
