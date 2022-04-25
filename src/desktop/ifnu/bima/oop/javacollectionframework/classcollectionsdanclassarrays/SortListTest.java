package desktop.ifnu.bima.oop.javacollectionframework.classcollectionsdanclassarrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Method sort digunakan untuk mengurutkan List berdasarkan logika yang ada dalam method
 * Comparable. Item di dalam List harus mengimplementasikan interface Comparable, kalau tidak
 * maka gunakan method sort dengan dua parameter: List dan Object dari class yang
 * mengimplementasikan interface Comparator
 */

public class SortListTest {

    public static void main(String[] args) {

        List<CustomerComparable> customers = new ArrayList<>();

        CustomerComparable cust1 = new CustomerComparable();
        cust1.setId(10L);
        customers.add(cust1);

        CustomerComparable cust2 = new CustomerComparable();
        cust2.setId(2L);
        customers.add(cust2);

        CustomerComparable cust3 = new CustomerComparable();
        cust3.setId(5L);
        customers.add(cust3);

        System.out.println("isi dari list sebelum disorting: ");
        for (int i = 0; i < customers.size(); i++) {
            System.out.println("index ke-" + i + ":" + customers.get(i));
        }

        Collections.sort(customers); // menggunakan interface comparable

        /**
         * Kalau misalnya Customer tidak mengimplementasikan interface Comparable, maka kita bisa
         * membuat class CustomerComparator yang mengimplementasikan interface Comparator
         * sebagai pembanding antara dua buah Customer mana yang lebih besar, kode di atas bisa diedit
         * sebagian dengan memanggil method sort yang mempunyai dua buah parameter: List of
         * Customer dan instance dari CustomerComparator.
         */
//        Collections.sort(customers, new CustomerComparator());

        System.out.println("isi dari list setelah disorting: ");
        for (int i = 0; i < customers.size(); i++) {
            System.out.println("index ke-" + i + ":" + customers.get(i));
        }

    }

}
