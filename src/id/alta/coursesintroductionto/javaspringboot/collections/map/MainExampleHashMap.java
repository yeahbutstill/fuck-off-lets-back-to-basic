package id.alta.coursesintroductionto.javaspringboot.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MainExampleHashMap {
  public static void main(String[] args) {
    Map<String, Integer> bulan = new HashMap<>();
    bulan.put("Januari", 1);
    bulan.put("Febuari", 2);
    bulan.put("Maret", 3);
    bulan.put("April", 4);
    bulan.put("Agustus", 8);
    System.out.println(bulan);
  }
}
