package desktop.ifnu.bima.feel.of.java.oop.castingvariabelreference;

import desktop.ifnu.bima.feel.of.java.deklarasiclass.Person;

// Interface PersonDao statusnya setara dengan
// class AbstractClassPersonDao
public interface PersonDao {
    void save(Person p);
    void delete(Person p);
    Person getById(Long id);
}
