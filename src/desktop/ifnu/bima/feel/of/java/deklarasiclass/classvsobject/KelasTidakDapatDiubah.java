package desktop.ifnu.bima.feel.of.java.deklarasiclass.classvsobject;

/**
 * Kelas Final:
 * Tujuan: Kelas final adalah kelas yang tidak dapat diwariskan lagi.
 * Biasanya digunakan ketika Anda ingin mencegah ekstensi atau modifikasi lebih lanjut terhadap sebuah kelas.
 * Kelas final sering digunakan untuk alasan keamanan, kinerja, atau desain.
 *
 * Penggunaan: Anda mendefinisikan kelas final ketika Anda yakin bahwa kelas ini tidak boleh memiliki subclass lebih lanjut.
 * Sebagai contoh, kelas String dalam bahasa pemrograman Java adalah final karena Anda tidak seharusnya mengubah perilakunya
 * atau membuat versi Anda sendiri.
 */
public final class KelasTidakDapatDiubah {
    private String nama;
    private Integer age;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

// Ini akan menghasilkan kesalahan: class KelasSaya extends KelasTidakDapatDiubah { ... }

/**
 * Kelas final digunakan ketika Anda ingin mencegah modifikasi atau ekstensi lebih lanjut terhadap sebuah kelas,
 * menjadikannya unit yang tertutup dan mandiri.
 */