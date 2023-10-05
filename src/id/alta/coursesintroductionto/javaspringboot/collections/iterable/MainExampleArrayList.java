package id.alta.coursesintroductionto.javaspringboot.collections.iterable;

import java.util.ArrayList;
import java.util.List;

public class MainExampleArrayList {
  public static void main(String[] args) {
    List<Integer> umur = new ArrayList<>();
    umur.add(17);
    umur.add(60);
    umur.add(30);
    System.out.println(umur.get(2));
  }
}
