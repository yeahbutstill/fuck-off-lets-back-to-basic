package desktop.ifnu.bima.feel.of.java.oop.collectiondangenerics.javacollectionframework;

import desktop.ifnu.bima.feel.of.java.oop.Customer;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Nah, setelah Customer mengimplementasikan interface Comparable, kita bisa menggunakan collection
 * yang sifatnya terurut, misalnya TreeSet dan TreeMap. Kita ubah sedikit kode contoh penggunaan Set
 * dengan mengganti HashSet menjadi TreeSet, seperti di bawah ini :
 */
public class CustomerTreeSetTest {
  public static void main(String[] args) {
    Set<Customer> customersBesar = new TreeSet<>();
    Customer id1 = new Customer();
    id1.setId(1L);
    customersBesar.add(id1);

    Customer id2 = new Customer();
    id2.setId(2L);
    customersBesar.add(id2);

    Customer c = new Customer();
    c.setId(1L);
    customersBesar.add(c); // mereplace id1 karena mempunyai id yang sama

    Iterator<Customer> iterator = customersBesar.iterator();
    while (iterator.hasNext()) {
      Customer current = iterator.next();
      System.out.println("keranjang no-" + current.hashCode() + " idnya: " + current.getId());
    }
  }
}
/**
 * TreeSet dan TreeMap menyaratkan item yang dimasukkan mengimplementasikan Comparable,
 * atau kalau itemnya tidak bisa mengimplementasikan Comparable, kita harus menyediakan class
 * yang mengimplementasikan Comparator dan memasukkan object dari class Comparator tersebut
 * di constructor dari TreeSet atau TreeMap, seperti cuplikan kode di bawah ini
 *
 * Set<Customer> customers = new TreeSet<Customer>(new CustomerComparator());
 * Map<Customer> customerMap = new TreeMap<Customer>(new CustomerComparator());
 */

/**
 * Kedua collection ini akan menyusun item dalam keadaan terurut menggunakan struktur data tree,
 * kalau item yang dimasukkan lebih kecil dari root maka diletakkan di tree sebelah kiri, kalau lebih
 * besar diletakkan di sebelah kanan. Algoritma seperti ini menyebabkan proses penambahan item
 * baru ke dalam collection menjadi sedikit lebih lambat daripada HashSet. Tetapi ketika isi dari
 * TreeSet diambil, keadaanya sudah dalam kondisi terurut, sehingga tidak diperlukan proses
 * pengurutan lagi.
 *
 * Jenis collection yang bersifat terurut hanya tersedia untuk Set dan Map, sedangkan untuk List
 * tidak ada. Nah kalau kita ingin membuat sebuah List terurut kita bisa menggunakan class
 * Collections yang di dalamnya terdapat method yang bisa mengurutkan List. Kita akan membahas
 * tentang class Collections di bab selanjutnya.
 */
