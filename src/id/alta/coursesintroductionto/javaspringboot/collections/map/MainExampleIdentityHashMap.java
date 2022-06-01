package id.alta.coursesintroductionto.javaspringboot.collections.map;

import java.util.IdentityHashMap;
import java.util.Map;

public class MainExampleIdentityHashMap {
    public static void main(String[] args) {
        Map<String, Integer> bulan = new IdentityHashMap<>();
        var key = "Januari.Awal";
        var awal = "Awal";
        var key2 = "Januari" + "." + awal;
        bulan.put(key, 1);
        bulan.put(key2, 1);
        bulan.put("Agustus", 8);

        System.out.println(bulan.size());
    }
}
