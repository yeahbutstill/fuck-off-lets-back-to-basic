package desktop.ifnu.bima.feel.of.java.oop.castingvariabelreference;

import desktop.ifnu.bima.feel.of.java.deklarasiclass.Person;

// Interface PersonDao statusnya setara dengan
// class AbstractClassPersonDao
// Tetapi tetap saja interface dan class adalah dua buah hal yang berbeda.
public abstract class AbstractClassPersonDao {
    public abstract void save(Person p);
    public abstract void delete(Person p);
    public abstract Person getById(Long id);
}

/**
 * Interface, seperti halnya class, bisa mengextends interface lain. Interface yang mengextends
 * interface lain akan memiliki semua method yang dipunyai oleh interface orang tuanya.
 */
