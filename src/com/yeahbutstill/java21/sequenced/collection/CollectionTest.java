package com.yeahbutstill.java21.sequenced.collection;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class CollectionTest {
  public static void main(String[] args) {
    SequencedCollection<String> list = new ArrayList<>();
    list.addLast("Goku");
    list.addLast("Gojo");
    list.addFirst("Kilua");
    list.add("Musashi"); // selalu bertambah ke paling belakang

    System.out.println(list.getFirst().equals("Kilua"));
    System.out.println(list.getLast().equals("Goku"));
    System.out.println(list.getLast().equals("Gojo"));
    System.out.println(list.getLast().equals("Musashi"));
    System.out.println(list);

    SequencedCollection<String> reversed = list.reversed();
    System.out.println(reversed);

    System.out.println(list.removeFirst());
    System.out.println(list.removeLast());
    System.out.println(list);
  }
}
