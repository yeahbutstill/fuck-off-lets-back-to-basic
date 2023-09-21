package desktop.ifnu.bima.feel.of.java.oop.collectiondangenerics.javacollectionframework;

import desktop.ifnu.bima.feel.of.java.oop.CustomerAcak;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CustomerSetTest {
  public static void main(String[] args) {
    Set<CustomerAcak> customers = new HashSet<CustomerAcak>();
    CustomerAcak id1 = new CustomerAcak();
    id1.setId(1L);
    customers.add(id1);

    CustomerAcak id2 = new CustomerAcak();
    id2.setId(2L);
    customers.add(id2);

    CustomerAcak id3 = new CustomerAcak();
    id3.setId(3L);
    customers.add(id3);

    CustomerAcak id4 = new CustomerAcak();
    id4.setId(4L);
    customers.add(id4);

    CustomerAcak id5 = new CustomerAcak();
    id5.setId(5L);
    customers.add(id5);

    CustomerAcak id6 = new CustomerAcak();
    id6.setId(6L);
    customers.add(id6);

    CustomerAcak c = new CustomerAcak();
    c.setId(1L);
    customers.add(c); // mereplace id1 karena mempunyai id yang sama
    Iterator<CustomerAcak> i = customers.iterator();

    while (i.hasNext()) {
      CustomerAcak current = i.next();
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
