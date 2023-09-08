package desktop.ifnu.bima.feel.of.java.deklarasiinterface;

import desktop.ifnu.bima.feel.of.java.deklarasiclass.Person;

/**
 * Antarmuka (Interface):
 * Antarmuka adalah kontrak yang mendefinisikan satu set metode abstrak (tanpa implementasi)
 * yang harus diberikan oleh kelas yang mengimplementasikan antarmuka tersebut.
 * Antarmuka tidak memiliki variabel anggota dengan implementasi default; mereka hanya mendeklarasikan tanda tangan metode.
 * Sebuah kelas dapat mengimplementasikan beberapa antarmuka, memungkinkan untuk multiple inheritance (pewarisan ganda) dari kontrak metode.
 * Antarmuka sering digunakan untuk mencapai bentuk "multiple inheritance" dalam bahasa pemrograman yang tidak mendukung multiple inheritance kelas.
 */

/**
 * Sebagai contoh kita akan membuat class PersonDaoImpl yang mengimplementasikan interface
 * PersonDao, di dalam interface PersonDao ada tiga buah method: save, delete dan getById
 * sehingga class PersonDaoImpl harus mengimplementasikan ketiga method ini.
 */
public interface PersonDao {
    void save(Person p);
    void delete(Person p);
    Person getById(Long id);
}

/**
 * sedangkan antarmuka mendefinisikan kontrak untuk kelas untuk mengikuti,
 * memungkinkan beberapa kelas berbagi set tanda tangan metode yang sama.
 */

// tidak ada istilah inner interface layaknya inner class.