package desktop.ifnu.bima.feel.of.java.oop.overridingdanoverloading;

import java.io.Serializable;
import java.util.UUID;

/**
 * Implementasi inheritance dalam kode menggunakan keyword extends. Kalau kita ingin
 * membuat sebuah class turunan dari class yang lain, kita gunakan keyword extends setelah
 * deklarasi nama class diikuti dengan class yang ingin digunakan sebagai orang tua dari class
 * tersebut. Misalnya kita ingin akan membuat dua buah class, class pertama adalah Customer
 * sedangkan class kedua adalah MemberCustomer, dimana class MemberCustomer adalah
 * turunan dari class Customer.
 *
 * Class MemberCustomer dalam hal ini mempunyai hubungan IS-A dengan class Customer.
 * Kalimat lengkapnya adalah “MemberCustomer IS-A Customer”. Hal ini dikarenakan
 * MemberCustomer adalah turunan Customer, analoginya kita bisa menggunakan kucing dan
 * hewan. Kucing adalah turunan dari hewan, maka kucing adalah hewan. Sama juga seperti
 * MemberCustomer adalah turunan dari Customer, maka MemberCustomer adalah Customer.
 */
public class MemberCustomer extends Customer implements Serializable {
  /**
   * Setiap kali sebuah class mengextends class lain, class tersebut bisa mengoverride method yang
   * ada di dalam class orang tuanya. Alasanya karena di class anaknya ingin
   * mengimplementasikan method tersebut dengan cara yang berbeda. Misalnya dalam class
   * MemberCustomer akan mengoverride method setId yang ada di Customer untuk memeriksa apakah id yang
   * dimasukkan bernilai null atau tidak, kalau nilainya null maka sebuah pesan dicetak ke dalam
   * console. Setelah pesan dicetak, method setId yang dipunyai oleh orang tua dari class
   * Customer, hal ini bisa dilakukan dengan menggunakan keyword super. Contohnya adalah
   * seperti ini :
   */
    @Override
    public void setId(UUID id) {
      if (id == null) System.out.println("nilai tidak boleh null");
      else super.setId(id);
    }

  /**
   * Overriding method dilakukan dengan cara mendeklarasikan method yang sama persis denga
   * method yang ada di class orang tuanya. Deklarasi dari method harus sama persis, mulai dari
   * access modifernya, keyword yang digunakan, nama method, jumlah parameter dan letak
   * parameter, hingga deklarasi throws exception.
   */
}
