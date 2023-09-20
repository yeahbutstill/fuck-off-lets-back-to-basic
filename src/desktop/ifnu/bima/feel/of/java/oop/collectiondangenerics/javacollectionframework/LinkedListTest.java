package desktop.ifnu.bima.feel.of.java.oop.collectiondangenerics.javacollectionframework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
  public static void main(String[] args) {
    /*
       LinkedList adalah implementasi dari List yang menambahkan method baru untuk menambahkan
       atau menghapus isi dari List dari depan atau dari belakang. Class ini cocok digunakan untuk
       membuat tumpukan (stack) atau antrian (queue).
    */
    List<String> namaBinatang = new LinkedList<>();
    namaBinatang.add("Tupai");
    namaBinatang.add("Buaya");
    namaBinatang.add("Ayam");
    namaBinatang.add("Elang");
    namaBinatang.add("Cicak");
    namaBinatang.add("Angsa");
    namaBinatang.add("Kerbau");
    String[] namaBinatangLaut = {"Hiu", "Paus", "Lumba-lumba", "Gurita"};
    namaBinatang.addAll(List.of(namaBinatangLaut));
    namaBinatang.addFirst("Kuda");
    namaBinatang.addLast("Harimau");
    namaBinatang.addLast("Harimau");
    namaBinatang.addLast("Harimau");
    namaBinatang.addLast("Harimau");

    System.out.println("Isi namaBinatang ada: " + namaBinatang.size());
    for (int i = 0; i < namaBinatang.size(); i++) {
      System.out.println("index ke - " + i + " = " + namaBinatang.get(i));
    }

    System.out.println();

    System.out.println("Di Isi dulu " + namaBinatang.size() + "data, lalau di Hapus:");
    for (int i = 0; i < namaBinatang.size(); i++) {
      System.out.println("index ke - " + i + " = " + namaBinatang.get(i));
      System.out.println("Di Hapus? " + namaBinatang.remove(namaBinatang.get(i)));
    }
    System.out.println("Jadi sisanya: " + namaBinatang.size());
    System.out.println(namaBinatang);
    /*
     terlihat bahwa index adalah bagian terpenting dari List, sedangkan item dalam List sendiri bisa
     dobel, tidak unik. Selain itu item di dalam List juga tidak terurut, terlihat dari huruf “a” yang
     diletakkan setelah huruf “c”.
    */
  }
}
