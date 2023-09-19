package desktop.ifnu.bima.feel.of.java.oop.castingvariabelreference;

import desktop.ifnu.bima.feel.of.java.deklarasiclass.Person;

public class PersonDaoImpl implements PersonDao {
  @Override
  public void save(Person p) {
    System.out.println("menyimpan");
    p.setId(1L);
    p.setNama("maya");
    System.out.println(p);
  }

  @Override
  public void delete(Person p) {
    System.out.println("menghapus");
    p.setId(1L);
    System.out.println(p);
  }

  @Override
  public Person getById(Long id) {
    Person p = new Person();
    p.setId(id);
    p.setNama("dani");

    return p;
  }
}
