package desktop.ifnu.bima.feel.of.java.oop.collectiondangenerics.javacollectionframework;

import desktop.ifnu.bima.feel.of.java.oop.Customer;
import java.util.*;

public class MapTest {
  public static void main(String[] args) {
    Map<String, List<Customer>> customerByCityMap = new HashMap<>();
    List<Customer> jakartaCust = new ArrayList<>();
    Customer a = new Customer();
    a.setId(1L);
    jakartaCust.add(a);

    Customer b = new Customer();
    b.setId(2L);
    jakartaCust.add(b);

    customerByCityMap.put("jakarta", jakartaCust);

    List<Customer> surabayaCust = new ArrayList<>();
    Customer c = new Customer();
    c.setId(3L);
    surabayaCust.add(c);

    Customer d = new Customer();
    d.setId(4L);
    surabayaCust.add(d);

    customerByCityMap.put("surabaya", surabayaCust);

    Set<String> keys = customerByCityMap.keySet();
    Iterator<String> iterator = keys.iterator();
    while (iterator.hasNext()) {
      String key = iterator.next();
      List<Customer> customers = customerByCityMap.get(key);
      for (int i = 0; i < customers.size(); i++) {
        Customer cust = customers.get(i);
        System.out.println("Kota : " + key + ", Customer id : " + cust.getId());
      }
    }
  }
}
