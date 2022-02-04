package desktop.ifnu.bima.oop.interfaceexample;

/**
 * Pada dasarnya interface itu adalah sebuah class yang dideklarasikan dengan keyword abstract dan
 * semua methodnya bersifat public abstract. Interface PersonDao statusnya setara dengan class
 * PersonDao di bawah ini :
 */
public abstract class PersonDaoAbstract {
  public abstract void save(Person p);

  public abstract void delete(Person p);

  public abstract Person getById(Long id);
}

/**
 * Tetapi tetap saja interface dan class adalah dua buah hal yang berbeda. Interface, seperti halnya
 * class, bisa mengextends interface lain. Interface yang mengextends interface lain akan memiliki
 * semua method yang dipunyai oleh interface orang tuanya.
 */
