package desktop.ifnu.bima.oop.javacollectionframework.classcollectionsdanclassarrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Method binarySearch digunakan untuk melakukan pencarian terhadap isi List dengan lebih
 * cepat dibanding dengan method indexOf dari interface List. Method binarySearch baru bisa
 * dipanggil setelah List disorting dahulu. Method binarySearch memerlukan dua parameter
 * kalau object dalam List mengimplementasikan interface Comparable: Listnya dan item yang
 * ingin dicari.
 */
public class BinarySearchTest {

    public static void main(String[] args) {

        List<CustomerBinarySrch> customers = new ArrayList<>();

        CustomerBinarySrch cust1 = new CustomerBinarySrch();
        cust1.setId(10L);
        customers.add(cust1);

        CustomerBinarySrch cust2 = new CustomerBinarySrch();
        cust2.setId(2L);
        customers.add(cust2);

        CustomerBinarySrch cust3 = new CustomerBinarySrch();
        cust3.setId(5L);
        customers.add(cust3);

        Collections.sort(customers);

        /**
         * Kalau item tidak mengimplementasikan interface Comparable maka method binarySearch
         * memerlukan tiga parameter: List, item yang dicari dan object dari class Comparator, seperti
         * dalam kode berikut ini : int index1 = Collections.binarySearch(customers, cust3, new CustomerComparator());
         */

        int index = Collections.binarySearch(customers, cust3);
        System.out.println("Customer dengan id:" + cust3.getId() + " ditemukan di index : " + index);

    }

}

/**
 * Untuk mengacak isi dari sebuah list, ada method shufe. Method shufe ada dua overload, yang
 * pertama hanya mempunyai satu parameter berupa List, yang kedua mempunyai dua buah
 * parameter: List dan object dari class Random. Object Random digunakan untuk menentukan jenis
 * randomisasi yang ingin digunakan untuk mengacak isi dari List.
 * <p>
 * Method reverse digunakan untuk membalik isi dari List, dimana yang depan menjadi di belakang
 * dan sebaliknya. Penggunaan method ini perlu hati-hati karena kecepatanya linier, semakin banyak
 * isi dari List waktu eksekusinya membesar secara linier.
 * <p>
 * Method copy digunakan untuk mengcopy isi dari satu List ke List lain, method ini cukup praktis
 * dibanding harus melakukan copy manual yang memerlukan proses iterasi, jadi hemat kira-kira
 * empat sampai lima baris kode.
 * <p>
 * Method fill digunakan untuk mengganti isi dari sebuah list dengan sebuah object yang sama.
 * Parameter method fll ada dua : List dan object item yang akan digunakan untuk menimpa semua
 * item yang ada dalam List.
 * <p>
 * Method min dan max digunakan untuk mendapatkan nilai maximum dan minimum dari sebuah
 * List. Method ini menyaratkan semua item di dalam List harus mengimplementasikan interface
 * Comparable. Seperti biasa, kalau item di dalam List tidak mengimplementasikan interface
 * Comparable maka kita harus menambahkan instance dari class yang mengimplementasikan
 * interface Comparator ke dalam method min dan max.
 */