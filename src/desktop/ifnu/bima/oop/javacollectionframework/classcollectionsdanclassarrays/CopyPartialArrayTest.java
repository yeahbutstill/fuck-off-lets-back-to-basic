package desktop.ifnu.bima.oop.javacollectionframework.classcollectionsdanclassarrays;

import java.util.Arrays;

/**
 * Method copyOf digunakan untuk mengcopy sebagian, keseluruhan atau malah membuat array
 * baru dengan isi yang sama tetapi ukurannya lebih panjang dari sebuah array. Sedangkan method
 * copyOfRange digunakan untuk mengcopy sebagian dari array dengan mendefnisikan awal dari
 * index dan akhir dari index yang ingin dicopy. Perhatikan contoh berikut ini :
 */
public class CopyPartialArrayTest {

    public static void main(String[] args) {

        String[] names = {"me", "you", "they", "us"};

        //membuat array baru dari sebagian isi array names
        String[] n = Arrays.copyOf(names, 2);
        System.out.println("setelah dipotong : " + Arrays.toString(n));

        //membuat array baru dari semua isi array names
        //sekaligus panjangnya bertambah
        n = Arrays.copyOf(names, 7);
        System.out.println("setelah ditambah panjang : " + Arrays.toString(n));

        //copy sebagian isi array names dari index 1 sampai index 3n = Arrays.copyOfRange(names, 1, 3);
        System.out.println("setelah dipotong : " + Arrays.toString(n));

        //copy sebagian isinya dan tambahkan default value untuk sisanya
        n = Arrays.copyOfRange(names, 2, 10);
        System.out.println("setelah dipotong dan bertambah panjang: " + Arrays.toString(n));

    }

}
