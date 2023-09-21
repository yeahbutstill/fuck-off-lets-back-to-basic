package desktop.ifnu.bima.feel.of.java.oop.collectiondangenerics.javacollectionframework;

import desktop.ifnu.bima.feel.of.java.oop.Customer;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Nah, setelah Customer mengimplementasikan interface Comparable, kita bisa menggunakan collection
 * yang sifatnya terurut, misalnya TreeSet dan TreeMap. Kita ubah sedikit kode contoh penggunaan Set
 * dengan mengganti HashSet menjadi TreeSet, seperti di bawah ini :
 */
public class CustomerTreeSetTest {
  public static void main(String[] args) {
    Set<Customer> customersBesar = new TreeSet<>();
    Customer id1 = new Customer();
    id1.setId(1L);
    customersBesar.add(id1);

    Customer id2 = new Customer();
    id2.setId(2L);
    customersBesar.add(id2);

    Customer c = new Customer();
    c.setId(1L);
    customersBesar.add(c); // mereplace id1 karena mempunyai id yang sama

    Iterator<Customer> iterator = customersBesar.iterator();
    while (iterator.hasNext()) {
      Customer current = iterator.next();
      System.out.println("keranjang no-" + current.hashCode() + " idnya: " + current.getId());
    }
  }
}
