package desktop.ifnu.bima.feel.of.java.oop.collectiondangenerics.javacollectionframework;

import desktop.ifnu.bima.feel.of.java.oop.Customer2;
import java.util.Comparator;

/**
 * Interface Comparator mempunyai bentuk generics dan bentuk tanpa generics, seperti halnya
 * interface Comparable, bentuk tanpa generics akan menyebabkan parameter bertipe Object
 * sehingga perlu proses casting untuk mengubah menjadi Customer, sedangkan bentuk generics
 * tipe data parameternya sudah bertipe Customer. mari kita lihat bagaimana cara membuat class
 * yang mengimplementasikan interface Comparator dengan bentuk generics, bentuk non
 * generics saya serahkan kepada anda untuk membuat sendiri:
 */
public class CustomerComparatorGeneric implements Comparator<Customer2> {
    @Override
    public int compare(Customer2 c1, Customer2 c2) {
        return c1.getId().compareTo(c2.getId());
    }
}
