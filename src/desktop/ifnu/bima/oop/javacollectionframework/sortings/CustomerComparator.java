package desktop.ifnu.bima.oop.javacollectionframework.sortings;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
