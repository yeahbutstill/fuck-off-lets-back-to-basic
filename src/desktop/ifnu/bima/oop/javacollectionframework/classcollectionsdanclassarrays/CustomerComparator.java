package desktop.ifnu.bima.oop.javacollectionframework.classcollectionsdanclassarrays;

import java.util.Comparator;

public class CustomerComparator implements Comparator<CustomerComparable> {

    @Override
    public int compare(CustomerComparable o1, CustomerComparable o2) {
        return o1.getId().compareTo(o2.getId());
    }

}
