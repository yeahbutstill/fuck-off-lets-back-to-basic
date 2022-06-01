package id.alta.coursesintroductionto.javaspringboot.collections.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class MainExampleNavigableMap {
    public static void main(String[] args) {
        NavigableMap<String, Integer> bulan = new TreeMap<>();
        bulan.put("Januari", 1);
        bulan.put("Febuari", 2);
        bulan.put("Maret", 3);
        bulan.put("April", 4);
        bulan.put("Agustus", 8);

        System.out.println(bulan.lowerKey("Febuari"));
    }
}
