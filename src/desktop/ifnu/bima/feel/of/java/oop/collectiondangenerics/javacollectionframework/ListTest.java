package desktop.ifnu.bima.feel.of.java.oop.collectiondangenerics.javacollectionframework;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
  public static void main(String[] args) {
    List<String> namaBuah = new ArrayList<>();
    namaBuah.add("Mangga");
    namaBuah.add("Jeruk");
    namaBuah.add("Semangka");
    namaBuah.add("Melon");
    namaBuah.add("Buah Naga");
    namaBuah.add("Pisang");
    namaBuah.add("Apel");
    System.out.println("Isi dari List namaBuah: ");
    for (int i = 0; i < namaBuah.size(); i++) {
      System.out.println("index ke - " + i + " : " + namaBuah.get(i));
    }
    /**
     * Kode di atas diawali dengan deklarasi variabel namaBuah yang menggunakan generics :
     * List<String>, kode ini artinya kita akan membuat variabel dengan tipe List dan isinya hanya
     * String saja, tipe data lain tidak bisa dimasukkan ke dalam List ini.
     */
  }
}
