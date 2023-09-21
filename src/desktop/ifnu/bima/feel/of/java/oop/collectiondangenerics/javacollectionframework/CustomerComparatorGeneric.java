package desktop.ifnu.bima.feel.of.java.oop.collectiondangenerics.javacollectionframework;

import desktop.ifnu.bima.feel.of.java.oop.Customer;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * Interface Comparator mempunyai bentuk generics dan bentuk tanpa generics, seperti halnya
 * interface Comparable, bentuk tanpa generics akan menyebabkan parameter bertipe Object
 * sehingga perlu proses casting untuk mengubah menjadi Customer, sedangkan bentuk generics
 * tipe data parameternya sudah bertipe Customer. mari kita lihat bagaimana cara membuat class
 * yang mengimplementasikan interface Comparator dengan bentuk generics, bentuk non
 * generics saya serahkan kepada anda untuk membuat sendiri:
 */
public class CustomerComparatorGeneric implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return c1.getId().compareTo(c2.getId());
    }

    @Override
    public Comparator<Customer> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Customer> thenComparing(Comparator<? super Customer> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Customer> thenComparing(Function<? super Customer, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Customer> thenComparing(Function<? super Customer, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Customer> thenComparingInt(ToIntFunction<? super Customer> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Customer> thenComparingLong(ToLongFunction<? super Customer> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Customer> thenComparingDouble(ToDoubleFunction<? super Customer> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
