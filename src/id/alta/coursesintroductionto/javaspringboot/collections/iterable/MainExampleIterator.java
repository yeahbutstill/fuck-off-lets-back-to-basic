package id.alta.coursesintroductionto.javaspringboot.collections.iterable;

import java.util.Iterator;
import java.util.List;

public class MainExampleIterator {
  public static void main(String[] args) {
    Iterable<String> names = List.of("alterra", "academy");
    Iterator<String> it = names.iterator();
    while (it.hasNext()) {
      String i = it.next();
      System.out.println(i);
    }
  }
}
