package desktop.ifnu.bima.feel.of.java.oop;

import java.util.Comparator;

public class BinatangComperator implements Comparator<Binatang> {
  @Override
  public int compare(Binatang o1, Binatang o2) {
    return o1.getId().compareTo(o2.getId());
  }
}
