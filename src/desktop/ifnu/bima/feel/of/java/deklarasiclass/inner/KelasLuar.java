package desktop.ifnu.bima.feel.of.java.deklarasiclass.inner;

/**
 * Kelas Dalam (Inner Class):
 * Kelas dalam adalah kelas yang didefinisikan di dalam kelas lain.
 * Kelas dalam memiliki akses ke anggota (field dan metode) dari kelas luar, yang memungkinkan untuk enkapsulasi dan organisasi kode terkait yang lebih baik.
 * Kelas dalam sering digunakan ketika sebuah kelas hanya relevan untuk kelas luar dan tidak boleh diakses dari luar kelas luar.
 * Mereka dapat di-instanisiasi menggunakan instance dari kelas luar.
 * Kelas dalam biasanya digunakan untuk kelas pembantu, pendengar, atau untuk mengimplementasikan pola desain tertentu seperti pola Iterator.
 */
public class KelasLuar {
    private int fieldLuar;

    public class KelasDalam {
        private int fieldDalam;

        public void methodDalam() {
            // Akses anggota kelas luar
            fieldLuar = 10;
        }
    }
}
