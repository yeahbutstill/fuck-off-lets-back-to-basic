package desktop.ifnu.bima.oop.javacollectionframework.sortings;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CustomerTreeSetTest {
  public static void main(String[] args) {
    Set<Customer> customers = new TreeSet<>();
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

/**
 * TreeSet dan TreeMap menyaratkan item yang dimasukkan mengimplementasikan Comparable, atau kalau
 * itemnya tidak bisa mengimplementasikan Comparable, kita harus menyediakan class yang
 * mengimplementasikan Comparator dan memasukkan object dari class Comparator tersebut di
 * constructor dari TreeSet atau TreeMap, seperti cuplikan kode di bawah ini : Set<Customer>
 * customers = new TreeSet<Customer>(new CustomerComparator()); Map<Customer> customerMap = new
 * TreeMap<Customer>(new CustomerComparator());
 */
