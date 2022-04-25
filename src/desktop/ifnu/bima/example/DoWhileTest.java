package desktop.ifnu.bima.example;

/**
 * Bentuk iterasi do-while digunakan kalau kita ingin agar setidaknya satu iterasi terjadi baru
 * kemudian ditest kondisinya apakah iterasi berikutnya dilaksanakan atau tidak. Sama dengan bentuk
 * iterasi while, bentuk iterasi do-while juga memerlukan satu parameter kondisi di dalam while-nya.
 * Sintaks do-while adalah seperti berikut ini : do { } while( kondisi ); Kita modifkasi sedikit
 * kode di atas dengan menggunakan bentuk iterasi do-while, seperti di bawah ini :
 */
public class DoWhileTest {
    public static void main(String[] args) {
        do {
            System.out.println("waktu sekarang dibagi 3 masih ada sisanya");
        } while (System.currentTimeMillis() % 3 != 0);
    }
}

/**
 * kalau kita eksekusi kode di atas, maka setidaknya string di atas diprint sekali, kalau misalnya
 * kondisi di dalam while masih benar maka string-nya akan dipring lagi sampai kondisi di dalam
 * while bernilai false.
 */
