package id.alta.coursesintroductionto.javaspringboot.collections.iterable;

import java.util.List;

public class MainExampleIterable {
  public static void main(String[] args) {
    Iterable<String> names = List.of("alterra", "academy");
    for (var name : names) {
      System.out.println(name);
    }
  }
}
