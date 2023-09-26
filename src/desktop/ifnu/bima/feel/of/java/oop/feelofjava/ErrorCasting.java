package desktop.ifnu.bima.feel.of.java.oop.feelofjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ErrorCasting {
  public static void main(String[] args) {
    Collection lists = new ArrayList();
    lists.add("a");
    lists.add(100);
    Iterator iterator = lists.iterator();
    for (; iterator.hasNext(); ) {
      String current = (String) iterator.next();
    }
    /**
     * Kode di atas akan menyebabkan error ClassCastException, karena dalam collection lists, kita
     * memasukkan “a” yang bertipe String dan 100 yang bertipe Integer. Pada saat kita mengambil
     * data dari lists dan melakukan cast ke tipe String terhadap niai 100, error ClassCastException
     * akan terjadi.
     */
  }
}