package id.alta.coursesintroductionto.javaspringboot.collections.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class MainExampleSortedMap {
    public static void main(String[] args) {
        SortedMap<String, Integer> bulan = new TreeMap<>();
        bulan.put("Januari", 1);
        bulan.put("Febuari", 2);
        bulan.put("Maret", 3);
        bulan.put("April", 4);
        bulan.put("Agustus", 8);

        System.out.println(bulan);
    }
}
