package com.yeahbutstill.java21.sequenced.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.SequencedCollection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SequencedCollectionTest {
    @Test
    void ordering() {
        var list = new ArrayList<String>();
        if (list instanceof SequencedCollection<String> sequencedCollection) {
            sequencedCollection.add("Naruto");
            sequencedCollection.add("Sasuke");
            sequencedCollection.add("Zoro");
            sequencedCollection.add("Gojo");
            sequencedCollection.add("Kilua");
            sequencedCollection.add("Mushasi");
            sequencedCollection.addFirst("Motherfucker HashMap");
            Assertions.assertEquals(sequencedCollection.getFirst(), "Motherfucker HashMap");
            Assertions.assertEquals(list.get(0), "Motherfucker HashMap");
            System.out.println(sequencedCollection);
        }
    }

    @Test
    void orderingLinkedHashSet() {
        var list = LinkedHashSet.<String>newLinkedHashSet(100);
        if (list instanceof SequencedCollection<String> sequencedCollection) {
            sequencedCollection.add("Naruto");
            sequencedCollection.add("Sasuke");
            sequencedCollection.add("Zoro");
            sequencedCollection.add("Gojo");
            sequencedCollection.add("Kilua");
            sequencedCollection.add("Mushasi");
            sequencedCollection.addFirst("Motherfucker HashMap");
            Assertions.assertEquals(sequencedCollection.getFirst(), "Motherfucker HashMap");
            System.out.println(sequencedCollection);
        }
    }
}
