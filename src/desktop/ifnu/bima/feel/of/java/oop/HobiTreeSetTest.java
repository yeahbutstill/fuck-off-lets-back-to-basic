package desktop.ifnu.bima.feel.of.java.oop;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HobiTreeSetTest {
  public static void main(String[] args) {
    Set<Hobi> hobis = new TreeSet<>();
    Hobi hobi1 = new Hobi();
    hobi1.setId(5L);
    hobi1.setName("Sepakbola");
    hobis.add(hobi1);

    Hobi hobi2 = new Hobi();
    hobi2.setId(2L);
    hobi2.setName("Renang");
    hobis.add(hobi2);

    Hobi hobi3 = new Hobi();
    hobi3.setId(13L);
    hobi3.setName("Stage Dive");
    hobis.add(hobi3);

    Hobi hobi4 = new Hobi();
    hobi4.setId(2L);
    hobis.add(hobi4); // mereplace hobi1 karena mempunyai id yang sama

    Hobi hobi5 = new Hobi();
    hobi5.setId(88L);
    hobi5.setName("Makan");
    hobis.add(hobi5);

    Iterator<Hobi> i = hobis.iterator();
    while (i.hasNext()) {
      Hobi current = i.next();
      System.out.println("Keranjang no-" + current.hashCode() + " idnya: " + current.getId() + " - " + current.getName());
    }
  }
}

/**
 * diurukan berdasarkan id nya
 */