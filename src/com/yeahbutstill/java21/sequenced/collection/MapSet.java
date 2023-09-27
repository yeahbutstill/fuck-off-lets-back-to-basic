package com.yeahbutstill.java21.sequenced.collection;

import java.util.LinkedHashMap;
import java.util.SequencedMap;
import java.util.TreeMap;

public class MapSet {
    public static void main(String[] args) {
        /**
         * yang membedakan dari SequencedSet adalah tidak bisa addFirst dan addLast
         * jika dipaksakan akan error "UnsupportedOperationException" untuk Set
         * memang tidak ada opration addFirst dan addLast karena percuma juga kalau kita masukan
         * di akhir atau di awal, dia akan tetap diurutkan automatic
         */
        SequencedMap<String, String> map = new TreeMap<>();
        map.put("c", "Gojo");
        map.put("b", "Goku");
        map.put("a", "Kilua");

        System.out.println(map);
        System.out.println("Kilua nih? " + map.firstEntry().getValue());
        System.out.println("Gojo nih? " + map.lastEntry().getValue());

        SequencedMap<String, String> reversed = map.reversed();
        System.out.println(reversed);
        System.out.println(reversed.firstEntry());
        System.out.println(reversed.lastEntry());
        System.out.println();


        /**
         * nah kalau ini baru bisa, karena dia tidak diurutkan automatis
         */
        SequencedMap<String, String> mapNonSorted = new LinkedHashMap<>();
        mapNonSorted.putFirst("a", "Sakura");
        mapNonSorted.putLast("c", "Sasuke");
        mapNonSorted.putFirst("b", "Satan");
        System.out.println(mapNonSorted);
        System.out.println(mapNonSorted.lastEntry().getValue());
        System.out.println(mapNonSorted.firstEntry().getValue());
    }
}
