package hackerrank.java.artivisi.ap0010.self.assessment.primitive.types;

public class Ap001 {
    /**
     * Jawaban atas pertanyaan pertama ini dimaksudkan agar mudah. Tujuan dari pertanyaan pertama adalah untuk
     * mengenalkan Anda pada sintaks yang akan sering digunakan untuk kode program dalam grup modul penilaian
     * mandiri ini.
     * <p>
     * Kelas pengendali dan metode utama
     * <p>
     * Dalam contoh ini, kelas bernama Ap001 adalah kelas pengendali. Ini berisi metode bernama main , dengan
     * tanda tangan yang cocok dengan tanda tangan yang diperlukan untuk metode utama. Saat pengguna menjalankan
     * program ini, mesin virtual Java secara otomatis memanggil metode bernama main di kelas pengendali.
     * <p>
     * Buat instance Pekerja
     * <p>
     * Metode main menggunakan operator new bersama dengan konstruktor default untuk kelas bernama Worker
     * untuk membuat instance baru dari kelas bernama Worker (objek dari kelas Worker).
     * Hal ini sering disebut sebagai instantiating objek.
     * <p>
     * Referensi ke objek anonim
     * <p>
     * Kombinasi operator new dan konstruktor default untuk kelas Worker mengembalikan referensi ke objek baru.
     * Dalam hal ini, objek dibuat sebagai objek anonim , artinya referensi objek tidak disimpan dalam variabel
     * referensi bernama. (Instansiasi objek non-anonim akan diilustrasikan nanti.)
     */
    public static void main(String[] args) {
        /**
         * Keluaran ke perangkat keluaran standar
         *
         * Ini menyebabkan metode hello milik objek baru (dari kelas bernama Worker ) untuk dieksekusi.
         * Kode dalam metode hello memanggil metode println pada variabel statis dari kelas System bernama out .
         */
        new Worker1().hello();
    }
}

class Worker1 {
    public void hello() {
        System.out.println("Hello World");
    }
}
