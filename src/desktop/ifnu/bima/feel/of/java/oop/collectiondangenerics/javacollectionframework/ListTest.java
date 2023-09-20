package desktop.ifnu.bima.feel.of.java.oop.collectiondangenerics.javacollectionframework;

import java.util.ArrayList;
import java.util.List;

/**
 * List adalah jenis collection yang teratur tetapi tidak terurut. List mempunyai index yang
 * disusun berdasarkan urutan kapan item dimasukkan ke dalam List. Isi dari List bersifat tidak
 * unik, alias dua buah item yang sama bisa dimasukkan berkali kali ke dalam List.
 */
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
    namaBuah.add("Mangga");
    namaBuah.add("Jeruk");
    ArrayList<String> rasanya = new ArrayList<>();
    rasanya.add("Semangka ENAK BANGET");
    namaBuah.add(rasanya.get(0));
    namaBuah.add("Semangka");
    namaBuah.add("Melon");
    namaBuah.add("Melon");
    namaBuah.add("Buah Naga");
    namaBuah.add("Pisang");
    namaBuah.add("Apel");
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
    System.out.println();

    namaBuah.add(6, "Mangga 3");
    namaBuah.add(2, "Mangga 2");
    System.out.println("Isi dari List namaBuah: ");
    for (int i = 0; i < namaBuah.size(); i++) {
      System.out.println("index ke - " + i + " : " + namaBuah.get(i));
    }
  }
}

/**
 * terlihat bahwa index adalah bagian terpenting dari List, sedangkan item dalam List sendiri bisa
 * dobel, tidak unik. Selain itu item di dalam List juga tidak terurut, terlihat dari huruf “a” yang
 * diletakkan setelah huruf “c”.
 */
