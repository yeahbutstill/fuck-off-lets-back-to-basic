package com.zamannow.strukturdata.iterator;

import java.util.Iterator;
import java.util.List;

public class IteratorApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("DNL", "Sakura", "Sasuke", "Gojo", "Naruto");
        // digunakan untuk perulangan dari data pertama hingga akhir
        Iterator<String> iterator = names.iterator();

        // sebelum java 5
        // method hasNext itu ketika dipanggil dia akan nanya, apokah masih ada data atau engga? kalau balikannya adahal boolean true
        // berarti masih ada datanya, lalu ketika kita memanggil next dia akan mengembalikan data. jika balikannya false lalu pake kita panggil next, maka nanti akan kena error NoSuchElementException
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
