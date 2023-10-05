package id.alta.coursesintroductionto.javaspringboot.collections.sortinglist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> bulan = new ArrayList<>();
    bulan.addAll(List.of("Januari", "Februari", "Maret"));
    Collections.sort(bulan);
    System.out.println(bulan);

    Collections.sort(
        bulan,
        new Comparator<String>() {
          @Override
          public int compare(String o1, String o2) {
            return o2.compareTo(o1);
          }
        });
  }
}
