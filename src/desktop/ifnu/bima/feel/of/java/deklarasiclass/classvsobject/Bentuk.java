package desktop.ifnu.bima.feel.of.java.deklarasiclass.classvsobject;

/**
 * Kelas Abstrak:
 * Tujuan: Kelas abstrak digunakan sebagai kelas dasar atau templat untuk kelas-kelas lain.
 * Mereka tidak dapat di-instan sendiri atau dibuat objectnya. Mereka ada untuk diwariskan oleh kelas-kelas lain.
 * Penggunaan: Anda mendefinisikan kelas abstrak ketika Anda ingin menyediakan antarmuka umum
 * atau serangkaian metode yang harus diimplementasikan oleh setiap subclass konkret (yaitu, bukan kelas abstrak).
 * Kelas abstrak juga dapat berisi metode konkret (metode dengan implementasi) selain metode abstrak (metode tanpa implementasi).
 * Kelas abstrak juga dapat memiliki variabel anggota (field) dengan implementasi default.
 * Sebuah kelas hanya dapat mewarisi satu kelas abstrak, tetapi dapat mengimplementasikan beberapa antarmuka (Java memungkinkan multiple inheritance melalui antarmuka).
 */
public abstract class Bentuk {
    private String nama;
    abstract void gambar(); // method abstrak

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

class Lingkaran extends Bentuk {
    @Override
    void gambar() {
        System.out.println("Implementasi untuk menggambar lingkaran");
    }
}

/**
 * Secara ringkas, kelas abstrak digunakan ketika Anda ingin mendefinisikan antarmuka umum dengan fleksibilitas
 * untuk subclass memberikan implementasi mereka sendiri.
 * kelas abstrak menyediakan cara untuk berbagi fungsionalitas umum dan penggunaan kode di antara kelas-kelas terkait
 */