package desktop.ifnu.bima.feel.of.java.oop.collectiondangenerics.javacollectionframework;

import desktop.ifnu.bima.feel.of.java.oop.Customer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

public class CustomerSetTest {
  public static void main(String[] args) {
    Set<Customer> customers = new HashSet<Customer>();
    Customer id1 = new Customer();
    id1.setId(UUID.fromString("fd00b048-2dbe-4f90-a248-335c37ec5fe1"));
    customers.add(id1);

    Customer id2 = new Customer();
    id2.setId(UUID.randomUUID());
    customers.add(id2);

    Customer c = new Customer();
    c.setId(UUID.fromString("fd00b048-2dbe-4f90-a248-335c37ec5fe1"));
    customers.add(c); // mereplace id1 karena mempunyai id yang sama
    Iterator<Customer> i = customers.iterator();

    while (i.hasNext()) {
      Customer current = i.next();
      System.out.println("keranjang no-" + current.hashCode() + " idnya:" + current.getId());
    }
    /**
     * Anda mungkin juga terkejut, ternyata nomor keranjangnya pun tidak terurut dari kecil ke besar.
     * HashSet adalah collection yang hanya menekankan pada sifat unik saja, sedangkan urutan dan
     * keteraturan tidak dijamin sama sekali. Ada jenis collection lain yang bisa menjamin sifat unik
     * sekaligus terurut, yaitu TreeSet, kita akan membahas tentang TreeSet nanti di bab setelah kita
     * bahas konsep sorting.
     */
  }
}
