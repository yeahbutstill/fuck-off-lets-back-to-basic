package desktop.ifnu.bima.feel.of.java.oop.feelofjava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OldMap {
  public static void main(String[] args) {
    Map<String, String> maps = new HashMap<>();
    maps.put("Rp", "Rupiah");
    maps.put("$", "US Dollar");

    // OLD
    Iterator<String> stringIterator = maps.keySet().iterator();
    while (stringIterator.hasNext()) {
      String key = stringIterator.next();
      System.out.println("Key: " + key);
      System.out.println("Value: " + maps.get(key));
    }
    /**
     * Kita harus mengambil dahulu daftar Key dari map, kemudian melakukan iterasi satu-satu
     * terhadap Key dan dengan menggunakan key tersebut baru bisa diambil pasangan valuenya.
     */
    System.out.println();

    // NEW
    for (String current : maps.keySet()) {
      System.out.println("Key: " + current);
      System.out.println("Value: " + maps.get(current));
    }
    /**
     * Perbaikan for loop ini pada dasarnya tidak mengubah sintaks java secara drastis, yang terjadi
     * adalah sebelum kode di atas dikompilasi menjadi fle class, ada satu langkah untuk merubah kode
     * di atas menjadi bentuk yang lama.
     */
  }
}
