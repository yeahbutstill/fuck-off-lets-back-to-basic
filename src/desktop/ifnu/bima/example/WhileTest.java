package desktop.ifnu.bima.example;

/**
 * Seperti yang sudah kita bahas sedikit di atas, bentuk iterasi while digunakan kalau kita tidak
 * tahu berapa kali interasi akan berlangsung, tetapi tahu kapan iterasi berhenti dari sebuah
 * kondisi tertentu. Bentuk sintaks while sangat sederhana dan hanya memerlukan satu saja parameter
 * kondisi yang bernilai boolean true atau false, selama kondisi ini masih bernilai true maka
 * iterasi akan terus dilaksanakan. Kalau nilai kondisi adalah false maka iterasi while akan
 * berhenti. Bentuk sintaksnya adalah seperti di bawah ini : while( kondisi ) { }
 */
public class WhileTest {
    public static void main(String[] args) {
        while (System.currentTimeMillis() % 3 != 0) {
            System.out.println("waktu sekarang dibagi 3 masih ada sisanya");
        }
    }
}

/**
 * Kalau kita ingin agar iterasi terjadi setidaknya sekali saja maka kita bisa menggunakan do-while
 * yang akan kita bahas di bab berikutnya.
 */
