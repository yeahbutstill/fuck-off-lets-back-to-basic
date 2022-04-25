package desktop.ifnu.bima.collections;

import java.util.Arrays;
import java.util.Iterator;

public class IterableApp {
    public static void main(String[] args) {

        Iterable<String> names = Arrays.asList("Maya", "Dani", "Triyanti");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("======================");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

    }
}
