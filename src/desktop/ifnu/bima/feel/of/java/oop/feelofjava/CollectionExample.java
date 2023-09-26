package desktop.ifnu.bima.feel.of.java.oop.feelofjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExample {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("b");

    // OLD
    Iterator<String> stringIterator = list.iterator();
    while (stringIterator.hasNext()) {
      String current = stringIterator.next();
      System.out.println("current: " + current);
    }
    System.out.println();
    /**
     * Terlihat kodenya cukup banyak, karena kita harus membuat variabel bertipe Iterator hanya
     * untuk mengambil nilai dari Collection.
     */

    // NEW
    for (String current : list) {
      System.out.println("Crrent value: " + current);
    }
  }
}
