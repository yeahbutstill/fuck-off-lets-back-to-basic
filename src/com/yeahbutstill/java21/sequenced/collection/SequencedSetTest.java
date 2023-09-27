package com.yeahbutstill.java21.sequenced.collection;

import java.util.SequencedSet;
import java.util.TreeSet;

public class SequencedSetTest {
    public static void main(String[] args) {
        /**
         * yang membedakan dari SequencedSet adalah tidak bisa addFirst dan addLast
         * jika dipaksakan akan error "UnsupportedOperationException" untuk Set
         * memang tidak ada opration addFirst dan addLast karena percuma juga kalau kita masukan
         * di akhir atau di awal, dia akan tetap diurutkan automatic
         */
        SequencedSet<String> set = new TreeSet<>();
        set.add("Goku");
        set.add("Gojo");
        set.add("Zoro");

        System.out.println(set);
        System.out.println(set.getFirst().equals("Gojo"));
        System.out.println(set.getLast().equals("Zoro"));

        SequencedSet<String> reversed = set.reversed();
        System.out.println(reversed);
        System.out.println(reversed.getLast().equals("Gojo"));
        System.out.println(reversed.getFirst().equals("Zoro"));

        String value = set.removeFirst();
        System.out.println(value);

        value = set.removeLast();
        System.out.println(value);

    }
}
