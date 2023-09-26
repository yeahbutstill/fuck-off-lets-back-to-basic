package desktop.ifnu.bima.feel.of.java.oop.feelofjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericsTest {
  public static void main(String[] args) {
    Collection<String> list = new ArrayList<>();
    list.add("a");
    list.add("100");
    for (String s : list) {
      System.out.println(s);
    }
  }
}
