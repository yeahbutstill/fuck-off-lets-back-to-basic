package id.alta.coursesintroductionto.javaspringboot.collections.iterable;

import java.util.SortedSet;
import java.util.TreeSet;

public class MainExampleTreeSet {
  public static void main(String[] args) {
    SortedSet<Integer> umur = new TreeSet<>();
    umur.add(3);
    umur.add(3);
    umur.add(4);
    umur.add(2);
    System.out.println(umur);
  }
}
