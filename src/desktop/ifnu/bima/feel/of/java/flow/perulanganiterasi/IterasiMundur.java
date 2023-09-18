package desktop.ifnu.bima.feel.of.java.flow.perulanganiterasi;

public class IterasiMundur {
  public static void main(String[] args) {
    for (int i = 10; i > 0; i--) {
      System.out.println(i);
    }
  }
}

/**
 * Ingat, iterasi for digunakan kalau kita tahu berapa kali iterasi dilaksanakan, hal ini dikarenakan
 * iterasi for memerlukan parameter awal, kondisi berhenti dan berapa banyak counter
 * bertambah/berkurang dalam setiap iterasi. Kalau iterasi tidak diketahui berapa kali dilakukan dan
 * hanya tahu bahwa selama suatu kondisi tertentu masih benar iterasi akan terus berlangsung
 * maka kita bisa menggunakan while.
 */
