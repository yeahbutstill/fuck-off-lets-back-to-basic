package id.alta.coursesintroductionto.javaspringboot.collections.map;

import java.util.Map;

public class MainExampleImmutableMap {
    public static void main(String[] args) {
        Map<String, Integer> bulan =
                Map.of(
                        "Januari", 1,
                        "Febuari", 2,
                        "Maret", 1,
                        "April", 3);
        System.out.println(bulan);
    }
}
