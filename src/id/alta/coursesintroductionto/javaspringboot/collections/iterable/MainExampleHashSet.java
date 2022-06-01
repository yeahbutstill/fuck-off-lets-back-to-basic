package id.alta.coursesintroductionto.javaspringboot.collections.iterable;

import java.util.HashSet;
import java.util.Set;

public class MainExampleHashSet {
    public static void main(String[] args) {
        Set<Integer> umur = new HashSet<>();
        umur.add(3);
        umur.add(3);
        umur.add(4);
        umur.add(2);
        System.out.println(umur);
    }
}
