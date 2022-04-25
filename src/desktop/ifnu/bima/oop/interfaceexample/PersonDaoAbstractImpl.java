package desktop.ifnu.bima.oop.interfaceexample;

/**
 * Ada satu cara yang bisa dilakukan jika kita tidak ingin mengimplementasikan semua method yang ada
 * dalam interface, yaitu dengan menambahkan keyword abstract dalam deklarasi class serta
 * mendeklarasikan method yang tidak ingin diimplementasikan menggunakan keyword abstract, seperti
 * dalam kode PersonDaoImpl yang sedikit dimodifkasi di bawah ini :
 */
public abstract class PersonDaoAbstractImpl implements PersonDao {
    public void save(Person p) {
        System.out.println("menyimpan Person");
    }

    public void delete(Person p) {
        System.out.println("menghapus Person");
    }

    public abstract Person getById(Long id);
}
