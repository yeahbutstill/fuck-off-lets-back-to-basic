package desktop.ifnu.bima.feel.of.java.oop.classcollectionsdanclassarrays;

import desktop.ifnu.bima.feel.of.java.oop.Binatang;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
  /**
   * Method binarySearch digunakan untuk melakukan pencarian terhadap isi List dengan lebih cepat
   * dibanding dengan method indexOf dari interface List. Method binarySearch baru bisa dipanggil
   * setelah List disorting dahulu. Method binarySearch memerlukan dua parameter kalau object dalam
   * List mengimplementasikan interface Comparable: Listnya dan item yang ingin dicari. Contoh kode
   * penggunaan method binarySearch adalah :
   */
  public static void main(String[] args) {
    List<Binatang> binatangs = new ArrayList<>();
    Binatang binatang1 = new Binatang();
    binatang1.setId(-1L);
    binatang1.setName("Elang");
    binatangs.add(binatang1);

    Binatang binatang2 = new Binatang();
    binatang2.setId(1L);
    binatang2.setName("Jerapa");
    binatangs.add(binatang2);

    Binatang binatang3 = new Binatang();
    binatang3.setId(-2L);
    binatang3.setName("Kelinci");
    binatangs.add(binatang3);

    Collections.sort(binatangs); // memang harus di sort telebih dahulu baru bisa dipanggil
    int index = Collections.binarySearch(binatangs, binatang3); // list, item yang ingin dicari
    /**
     * Kalau item tidak mengimplementasikan interface Comparable maka method binarySearch
     * memerlukan tiga parameter: List, item yang dicari dan object dari class Comparator, seperti
     * dalam kode berikut ini :
     * int index = Collections.binarySearch(binatangs, binatang3,
     * new BinatangComparator());
     */
    System.out.println(
        "Binatang dengan id: "
            + binatang3.getId()
            + " dan nama: "
            + binatang3.getName()
            + " ditemukan di index: "
            + index);
  }
}
