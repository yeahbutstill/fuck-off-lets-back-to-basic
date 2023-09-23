package desktop.ifnu.bima.feel.of.java.oop;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MakananTreeSetTest {
  public static void main(String[] args) {
    Set<Makanan> makanans = new TreeSet<>();
    Makanan id1 = new Makanan();
    id1.setId(1L);
    id1.setNama("Sayur");
    makanans.add(id1);

    Makanan id2 = new Makanan();
    id2.setId(2L);
    id2.setNama("Gorengan");
    makanans.add(id2);

    Makanan id3 = new Makanan();
    id3.setId(3L);
    id3.setNama("Cemilan");
    makanans.add(id3);

    Iterator<Makanan> iterator = makanans.iterator();
    while (iterator.hasNext()) {
      Makanan next = iterator.next();
      System.out.println("keranjang no-" + next.hashCode() + " id: " + next.getId() + " nama: " + next.getNama());
    }
  }
}
