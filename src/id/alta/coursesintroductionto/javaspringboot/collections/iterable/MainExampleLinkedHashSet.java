package id.alta.coursesintroductionto.javaspringboot.collections.iterable;

import java.util.LinkedHashSet;
import java.util.Set;

public class MainExampleLinkedHashSet {
  public static void main(String[] args) {
    Set<Integer> umur = new LinkedHashSet<>();
    umur.add(3);
    umur.add(3);
    umur.add(4);
    umur.add(2);
    System.out.println(umur);
  }
}
