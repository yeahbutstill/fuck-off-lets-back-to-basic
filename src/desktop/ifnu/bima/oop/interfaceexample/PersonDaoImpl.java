package desktop.ifnu.bima.oop.interfaceexample;

public class PersonDaoImpl implements PersonDao {
    @Override
    public void save(Person p) {
        System.out.println("menyimpan Person");
    }

    @Override
    public void delete(Person p) {
        System.out.println("menghapus Person");
    }

    @Override
    public Person getById(Long id) {

        Person p = new Person();
        p.setId(id);
        p.setName("Maya");
        return p;
    }
}
