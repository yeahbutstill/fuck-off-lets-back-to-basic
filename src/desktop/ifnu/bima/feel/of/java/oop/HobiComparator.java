package desktop.ifnu.bima.feel.of.java.oop;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class HobiComparator implements Comparator<Hobi> {

  /**
   * Nah, setelah Customer mengimplementasikan interface Comparable, kita bisa menggunakan
   * collection yang sifatnya terurut, misalnya TreeSet dan TreeMap.
   * @param h1 the first object to be compared.
   * @param h2 the second object to be compared.
   * @return
   */
  @Override
  public int compare(Hobi h1, Hobi h2) {
        return h1.getId().compareTo(h2.getId());
    }
}
