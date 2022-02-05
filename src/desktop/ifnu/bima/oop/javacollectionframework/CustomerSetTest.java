package desktop.ifnu.bima.oop.javacollectionframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CustomerSetTest {
  public static void main(String[] args) {
    Set<Customer> customers = new HashSet<>();
    Customer id1 = new Customer();
    id1.setId(1L);
    customers.add(id1);

    Customer id2 = new Customer();
    id2.setId(2L);
    customers.add(id2);

    Customer c = new Customer();
    c.setId(1L);
    customers.add(c); // mereplace id1 karena mempunyai id yang sama
    Iterator<Customer> i = customers.iterator();
    while (i.hasNext()) {
      Customer current = i.next();
      System.out.println("keranjang no-" + current.hashCode() + " idnya:" + current.getId());
    }
  }
}
