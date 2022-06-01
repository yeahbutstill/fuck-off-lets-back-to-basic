package id.alta.coursesintroductionto.javaspringboot.collections.iterable;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class MainExampleEnumSet {

    public static void main(String[] args) {
        Set<Months> set = EnumSet.allOf(Months.class);
        Iterator<Months> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    enum Months {
        JANUARY, FEBRUARY, MARCH, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }
}
