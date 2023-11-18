package id.alta.coursesintroductionto.javaspringboot.collections.map;

import java.util.Map;
import java.util.WeakHashMap;

public class MainExampleWeekHashMap {
    public static void main(String[] args) {
        Map<String, Integer> bulan = new WeakHashMap<>();
        bulan.put("Januari", 1);
        bulan.put("Febuari", 2);
        bulan.put("Maret", 3);
        bulan.put("April", 4);
        bulan.put("Agustus", 8);
        System.gc();
        System.out.println(bulan);
    }
}
