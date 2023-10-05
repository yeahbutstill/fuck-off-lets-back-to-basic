package id.alta.coursesintroductionto.javaspringboot.collections.iterable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MainExampleList {
  public static void main(String[] args) {
    Collection<String> names = new ArrayList<>();
    names.add("Alterra");
    names.add("Academy");
    names.add("Dani");
    names.add("Setiawan");
    names.remove("Setiawan");
    System.out.println(names.contains("Alterra"));

    Iterator<String> iterator = names.iterator();
    while (iterator.hasNext()) {
      String i = iterator.next();
      System.out.println(i);
    }
  }
}
