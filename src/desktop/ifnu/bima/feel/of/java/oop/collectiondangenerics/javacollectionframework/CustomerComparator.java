package desktop.ifnu.bima.feel.of.java.oop.collectiondangenerics.javacollectionframework;

import desktop.ifnu.bima.feel.of.java.oop.Customer2;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class CustomerComparator implements Comparator {
  @Override
  public int compare(Object o1, Object o2) {
    Customer2 c2a = (Customer2) o1;
    Customer2 c2b = (Customer2) o2;
    // besar ke kecil
    return c2a.getId().compareTo(c2b.getId());
  }

  @Override
  public Comparator reversed() {
    return Comparator.super.reversed();
  }

  @Override
  public Comparator thenComparing(Comparator other) {
    return Comparator.super.thenComparing(other);
  }

  @Override
  public Comparator thenComparingInt(ToIntFunction keyExtractor) {
    return Comparator.super.thenComparingInt(keyExtractor);
  }

  @Override
  public Comparator thenComparingLong(ToLongFunction keyExtractor) {
    return Comparator.super.thenComparingLong(keyExtractor);
  }

  @Override
  public Comparator thenComparingDouble(ToDoubleFunction keyExtractor) {
    return Comparator.super.thenComparingDouble(keyExtractor);
  }

  @Override
  public Comparator thenComparing(Function keyExtractor) {
    return Comparator.super.thenComparing(keyExtractor);
  }

  @Override
  public Comparator thenComparing(Function keyExtractor, Comparator keyComparator) {
    return Comparator.super.thenComparing(keyExtractor, keyComparator);
  }
}
