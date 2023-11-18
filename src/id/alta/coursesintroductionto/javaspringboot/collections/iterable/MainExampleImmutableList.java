package id.alta.coursesintroductionto.javaspringboot.collections.iterable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainExampleImmutableList {
    public static void main(String[] args) {
        List<Integer> umur = new LinkedList<>();
        // tidak dapat diubah nilainya
        var umurImmutable = Collections.unmodifiableList(umur);
        umurImmutable.add(2);
        umur.add(17);
        umur.add(60);
        umur.add(30);
        System.out.println(umur.get(2));
    }
}
