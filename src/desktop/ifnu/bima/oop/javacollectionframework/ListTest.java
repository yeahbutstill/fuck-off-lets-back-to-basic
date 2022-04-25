package desktop.ifnu.bima.oop.javacollectionframework;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("B");
        list.add("C");
        list.add("d");
        list.add("M");
        list.add("A");
        list.add("Y");
        list.add("A");
        System.out.println("isi dari list : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("index ke-" + i + ":" + list.get(i));
        }
    }
}

/**
 * Kode di atas diawali dengan deklarasi variabel List yang menggunakan generics : List<String>,
 * kode ini artinya kita akan membuat variabel dengan tipe List dan isinya hanya String saja, tipe
 * data lain tidak bisa dimasukkan ke dalam List ini.
 */
