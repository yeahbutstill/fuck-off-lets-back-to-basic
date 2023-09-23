package desktop.ifnu.bima.feel.of.java.oop.classcollectionsdanclassarrays;

import desktop.ifnu.bima.feel.of.java.oop.Binatang;
import desktop.ifnu.bima.feel.of.java.oop.BinatangComperator;
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
    binatang2.setName("Kodok");
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

    // Collections.sort(binatangs); // using comparable

    /*
    Kalau misalnya Customer tidak mengimplementasikan interface Comparable, maka kita bisa
    membuat class CustomerComparator yang mengimplementasikan interface Comparator
    sebagai pembanding antara dua buah Binatang mana yang lebih besar, kode di atas bisa diedit
    sebagian dengan memanggil method sort yang mempunyai dua buah parameter: List of
    Customer dan instance dari CustomerComparator.
    */
    Collections.sort(binatangs, new BinatangComperator()); // using comparator

    System.out.println();
    System.out.println("isi dari list " + binatangs.size() + " sesudah disorting");
    for (int i = 0; i < binatangs.size(); i++) {
      System.out.println("index ke-" + i + " : " + binatangs.get(i));
    }
  }
}

/**
 * Kode di atas memperlihatkan bahwa kita membuat List of Binatang dengan id yang tidak terurut,
 * karena Binatang mengimplementasikan interface Comparator dari class BinatangComperator maka isi
 * dari List of Binatang tersebut bisa disorting menggunakan method sort dari class Collections.
 */
