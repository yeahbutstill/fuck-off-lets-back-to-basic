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
    System.out.println("Setelah proses negasi, dimana nilai 0 menjadi 1 dan sebaliknya, maka representasi binarynya " +
            "menjadi :");
    System.out.println(Integer.toBinaryString(z));
    System.out.println("proses 2's complement ini adalah menambahkan 1 ke binari hasil negasi");
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

    // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 1

    // Setelah proses negasi, dimana nilai 0 menjadi 1 dan sebaliknya, maka representasi binarynya
    // menjadi :
    // 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 0 0

    // Langkah terakhir dari proses 2's complement ini adalah menambahkan 1 ke binari hasil negasi,
    // sehingga hasil akhir representasi binari dari –11 adalah :
    // 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 0 1

    /**
     * Satu hal yang pasti, kalau angka digit sebelah paling kiri 0 maka angkanya pasti positif,
     * sebaliknya jika digit paling kiri bernilai 1 maka angkanya adalah negatif. Kalua kita mendapatkan
     * representasi binari dari sebuah angka negatif, maka untuk mengetahui berapa nilainya perlu
     * dilakukan operasi kebalikan dari 2's complement : kurangi satu kemudian negasikan menjadi
     * angka positifnya. Nah, kita coba kembalikan bentuk -11 di atas menjadi bentuk positifnya :
     */

    /**
     * 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 0 1
     * --------------------------------------------------------------- -1
     * 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 0 0
     * --------------------------------------------------------------- ~
     * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 1
     * => 11 positif
     */

    /**
     * Kembali lagi ke operasi negasi dari integer di atas, sekarang kita bisa menjawab kenapa negasi
     * 11 hasilnya adalah -12. Nah kita lihat Operasi berikut ini :
     */
    // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 1
    // => 11
    // --------------------------------------------------------------- ~
    // 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 0 0

    /**
     * kita kembalikan ke bentuk positifnya :
     * 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 0 0
     * --------------------------------------------------------------- -1
     * 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 0 1 0
     * --------------------------------------------------------------- ~
     * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 0 1
     * => 12
     */
  }
}
