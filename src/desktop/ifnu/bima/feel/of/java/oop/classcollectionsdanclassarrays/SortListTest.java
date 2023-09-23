package desktop.ifnu.bima.feel.of.java.oop.classcollectionsdanclassarrays;

import desktop.ifnu.bima.feel.of.java.oop.Binatang;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {
  public static void main(String[] args) {
    /**
     * Method sort digunakan untuk mengurutkan List berdasarkan logika yang ada dalam method
     * Comparable. Item di dalam List harus mengimplementasikan interface Comparable, kalau tidak
     * maka gunakan method sort dengan dua parameter: List dan Object dari class yang
     * mengimplementasikan interface Comparator
     */
    List<Binatang> binatangs = new ArrayList<>();
    Binatang binatang1 = new Binatang();
    binatang1.setId(10L);
    binatang1.setName("Harimau");
    binatangs.add(binatang1);

    Binatang binatang2 = new Binatang();
    binatang2.setId(99L);
    binatang2.setName("Kodong");
    binatangs.add(binatang2);

    Binatang binatang3 = new Binatang();
    binatang3.setId(19L);
    binatang3.setName("Elang");
    binatangs.add(binatang3);

    Binatang binatang4 = new Binatang();
    binatang4.setId(99L);
    binatang4.setName("Sapi");
    binatangs.add(binatang4);

    Binatang binatang5 = new Binatang();
    binatang5.setId(99L);
    binatang5.setName("Sapi");
    binatangs.add(binatang5);

    System.out.println("isi dari list " + binatangs.size() + " sebelum disorting");
    for (int i = 0; i < binatangs.size(); i++) {
      System.out.println("index ke-" + i + " : " + binatangs.get(i));
    }

    Collections.sort(binatangs, binatang1); // using comparator
    // Collections.sort(binatangs); // using comparable
    System.out.println();
    System.out.println("isi dari list " + binatangs.size() + " sesudah disorting");
    for (int i = 0; i < binatangs.size(); i++) {
      System.out.println("index ke-" + i + " : " + binatangs.get(i));
    }
  }
}
