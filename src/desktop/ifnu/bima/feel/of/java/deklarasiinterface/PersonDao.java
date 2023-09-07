package desktop.ifnu.bima.feel.of.java.deklarasiinterface;

import desktop.ifnu.bima.feel.of.java.deklarasiclass.Person;

public interface PersonDao {
    void save(Person p);
    void delete(Person p);
    Person getById(Long id);
}
