package desktop.ifnu.bima.oop.javacollectionframework.classcollectionsdanclassarrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Method binarySearch digunakan untuk melakukan pencarian terhadap isi List dengan lebih
 * cepat dibanding dengan method indexOf dari interface List. Method binarySearch baru bisa
 * dipanggil setelah List disorting dahulu. Method binarySearch memerlukan dua parameter
 * kalau object dalam List mengimplementasikan interface Comparable: Listnya dan item yang
 * ingin dicari.
 */
public class BinarySearchTest {

    public static void main(String[] args) {

        List<CustomerBinarySrch> customers = new ArrayList<>();

        CustomerBinarySrch cust1 = new CustomerBinarySrch();
        cust1.setId(10L);
        customers.add(cust1);

        CustomerBinarySrch cust2 = new CustomerBinarySrch();
        cust2.setId(2L);
        customers.add(cust2);

        CustomerBinarySrch cust3 = new CustomerBinarySrch();
        cust3.setId(5L);
        customers.add(cust3);

        Collections.sort(customers);

        /**
         * Kalau item tidak mengimplementasikan interface Comparable maka method binarySearch
         * memerlukan tiga parameter: List, item yang dicari dan object dari class Comparator, seperti
         * dalam kode berikut ini : int index1 = Collections.binarySearch(customers, cust3, new CustomerComparator());
         */

        int index = Collections.binarySearch(customers, cust3);
        System.out.println("Customer dengan id:" + cust3.getId() + " ditemukan di index : " + index);

    }

}
