package desktop.ifnu.bima.feel.of.java.oop.classcollectionsdanclassarrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyPartialArrayTest {
  public static void main(String[] args) {
    String[] names = {"me", "you", "they", "us"};

    // membuat array baru dari sebagian isi array names
    String[] n = Arrays.copyOf(names, 2);
    System.out.println("Setelah dipotong: " + Arrays.toString(n));

    // membuat array baru dari semua isi array names, sekaligus panjangnya bertambah
    n = Arrays.copyOf(names, 7);
    System.out.println("Setelah ditambahkan panjang : " + Arrays.toString(n));

    // copy sebagian isi array names dari index 1 sampai index 3
    n = Arrays.copyOfRange(names, 1, 3);
    System.out.println("Setelah dipotong : " + Arrays.toString(n));

    // copy sebagian isinya dan tambahkan default value untuk sisanya
    n = Arrays.copyOfRange(names, 2, 10);
    System.out.println("setelah dipotong dan bertambah panjang: " + Arrays.toString(n));
  }
}

/**
 * Sisanya, method-metthod seperti : sort dan binarySearch sama persis penggunaanya dengan
 * method yang ada dalam class Collections.
 */
