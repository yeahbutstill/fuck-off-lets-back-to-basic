package desktop.ifnu.bima.feel.of.java.oop.collectiondangenerics.javacollectionframework;

import desktop.ifnu.bima.feel.of.java.oop.Address;
import desktop.ifnu.bima.feel.of.java.oop.Customer2;
import java.util.ArrayList;
import java.util.List;

public class SortListTest {
  public static void main(String[] args) {
    List<Customer2> customers = new ArrayList<>();
    Customer2 cust1 = new Customer2();
    cust1.setId(10L);
    cust1.setNama("Naruto");
    Address addressCust1 = new Address();
    addressCust1.setCity("Konoha Timur");
    addressCust1.setStreet("Api");
    addressCust1.setPostCode("93");
    cust1.setAddress(addressCust1);
    customers.add(cust1);

    Customer2 cust2 = new Customer2();
    cust2.setId(11L);
    cust2.setNama("Sasuke");
    Address addressCust2 = new Address();
    addressCust2.setCity("Konoha Barat");
    addressCust2.setStreet("Air");
    addressCust2.setPostCode("93");
    cust2.setAddress(addressCust2);
    customers.add(cust2);

    Customer2 cust3 = new Customer2();
    cust3.setId(5L);
    cust3.setNama("Sakura");
    Address addressCust3 = new Address();
    addressCust3.setCity("Konoha Selatan");
    addressCust3.setStreet("Tanah");
    addressCust3.setPostCode("93");
    cust3.setAddress(addressCust3);
    customers.add(cust3);

    System.out.println("Isi dari list sebelum disorting: ");
    for (int i = 0; i < customers.size(); i++) System.out.println("index ke-" + i + " : " + customers.get(i));
  }
}
