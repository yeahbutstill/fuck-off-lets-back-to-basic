package desktop.ifnu.bima.feel.of.java.oop.collectiondangenerics.javacollectionframework;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
  public static void main(String[] args) {
    /*
    Class ArrayList adalah class yang mengimplementasikan interface List, bayangkan class ArrayList
    ini adalah Array yang dapat bertambah ukuranya. Vector adalah class yang juga
    mengimplementasikan List, Vector adalah pendahulu dari ArrayList, kalau tidak ada yang
    menghalangi anda menggunakan ArrayList, sebaiknya hindari Vector karena performance
    ArrayList lebih bagus dan classnya lebih modern.
     */
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

    System.out.println();
    System.out.println("Ambil namanya dari index: " + namaBuah.indexOf(namaBuah.get(1)) + " = " + namaBuah.get(1));
    namaBuah.add(5, "Mangga 3");
    namaBuah.add(2, "Mangga 2");
    System.out.println();
    System.out.println("Isi dari List namaBuah: ");
    for (int i = 0; i < namaBuah.size(); i++) {
      System.out.println("index ke - " + i + " : " + namaBuah.get(i));
    }
  }
}
