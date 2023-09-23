package desktop.ifnu.bima.feel.of.java.oop;

import java.util.*;

public class BinatangTreeSetTest {
  public static void main(String[] args) {
    /**
     * TreeSet dan TreeMap menyaratkan item yang dimasukkan mengimplementasikan Comparable, atau
     * kalau itemnya tidak bisa mengimplementasikan Comparable, kita harus menyediakan class yang
     * mengimplementasikan Comparator dan memasukkan object dari class Comparator tersebut di
     * constructor dari TreeSet atau TreeMap
     */
    Set<Binatang> binatangs = new TreeSet<>(new BinatangComperator());
    Map<Long, Binatang> binatangMap = new TreeMap(new BinatangComperator());
    /**
     * Kedua collection ini akan menyusun item dalam keadaan terurut menggunakan struktur data tree,
     * kalau item yang dimasukkan lebih kecil dari root maka diletakkan di tree sebelah kiri, kalau lebih
     * besar diletakkan di sebelah kanan. Algoritma seperti ini menyebabkan proses penambahan item
     * baru ke dalam collection menjadi sedikit lebih lambat daripada HashSet. Tetapi ketika isi dari
     * TreeSet diambil, keadaanya sudah dalam kondisi terurut, sehingga tidak diperlukan proses
     * pengurutan lagi.
     * Jenis collection yang bersifat terurut hanya tersedia untuk Set dan Map, sedangkan untuk List
     * tidak ada. Nah kalau kita ingin membuat sebuah List terurut kita bisa menggunakan class
     * Collections yang di dalamnya terdapat method yang bisa mengurutkan List.
     */
    Binatang binatang1 = new Binatang();
    binatang1.setId(1L);
    binatang1.setName("Harimau");
    binatangs.add(binatang1);

    Binatang binatang2 = new Binatang();
    binatang2.setId(2L);
    binatang2.setName("Kucing");
    binatangs.add(binatang2);

    Binatang binatang3 = new Binatang();
    binatang3.setId(1L);
    binatang3.setName("Kucing Angora");
    binatangs.add(binatang3); // replace id

    Iterator<Binatang> iterator = binatangs.iterator();
    while (iterator.hasNext()) {
      Binatang next = iterator.next();
      System.out.println(
          "keranjang ke-" + next.hashCode() + " id: " + next.getId() + " name: " + next.getName());
    }
  }
}
