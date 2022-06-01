package id.alta.coursesintroductionto.javaspringboot.collections.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class MainExampleSortedMapWithComparator {
    public static void main(String[] args) {
        SortedMap<Person, Integer> persons = new TreeMap<>((o1, o2) -> o2.getName().compareTo(o1.getName()));
        persons.put(new Person("Dani", "dani@yeahbutstill.com"), 1);
        persons.put(new Person("Maya", "maya@yeahbutstill.com"), 1);
        persons.put(new Person("Winda", "winda@yeahbutstill.com"), 3);

        for (var key : persons.entrySet()) {
            System.out.println(key.getKey().getName() + " = " + key.getKey().getEmail());
        }
    }
}
