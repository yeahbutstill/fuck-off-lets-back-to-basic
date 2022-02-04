package desktop.ifnu.bima.example;

/**
 * Keyword for digunakan untuk melakukan iterasi kalau jumlah iterasinya tertentu, misalnya kita
 * ingin melakukan iterasi sebanyak 10x atau 100x. Iterasi menggunakan for memerlukan tiga buah
 * parameter, parameter pertama digunakan sebagai batas bawah iterasi, parameter kedua adalah
 * kondisi kapan iterasi berhenti dan parameter terakhir dugunakan untuk menaikkan atau menurunkan
 * counter. Kita lihat sintaks dasar dari for seperti di bawah ini : for( parameter1 ; parameter2 :
 * parameter3) { }
 */
public class ForTest {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println("Iterasi ke-" + i);
    }
  }
}

/**
 * Ingat, iterasi for digunakan kalau kita tahu berapa kali iterasi dilaksanakan, hal ini
 * dikarenakan iterasi for memerlukan parameter awal, kondisi berhenti dan berapa banyak counter
 * bertambah/berkurang dalam setiap iterasi. Kalau iterasi tidak diketahui berapa kali dilakukan dan
 * hanya tahu bahwa selama suatu kondisi tertentu masih benar iterasi akan terus berlangsung maka
 * kita bisa menggunakan while.
 */
