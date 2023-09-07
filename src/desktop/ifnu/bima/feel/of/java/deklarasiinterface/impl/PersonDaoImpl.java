package desktop.ifnu.bima.feel.of.java.deklarasiinterface.impl;

import desktop.ifnu.bima.feel.of.java.deklarasiclass.Person;
import desktop.ifnu.bima.feel.of.java.deklarasiinterface.PersonDao;

/**
 * Class mengimplementasikan interface dengan menggunakan keyword implements. Semua
 * method dalam interface bersifat public sehingga walaupun dalam deklarasi interface tidak ada
 * public tetapi di class yang mengimplementasikan interface harus meletakkan access identifers
 * public pada deklarasi methodnya.
 */
public class PersonDaoImpl implements PersonDao {
    @Override
    public void save(Person p) {
        System.out.println("Menyimpan Person");
    }

    @Override
    public void delete(Person p) {
        System.out.println("Menghapus Person");
    }

    @Override
    public Person getById(Long id) {
        Person p = new Person();
        p.setId(id);
        p.setNama("abc");
        return p;
    }
}

/**
 * Sebuah class bisa mengimplementasikan lebih dari satu interface, antara satu interface
 * dengan interface yang lain dipisahkan dengan tanda koma, seperti contoh sederhana di bawah
 * ini :
 * public interface PersonDaoImpl implements PersonDao, Serializable{}
 */