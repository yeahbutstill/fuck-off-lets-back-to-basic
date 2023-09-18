package desktop.ifnu.bima.feel.of.java.oop;

import java.io.Serializable;

public class PolymorphismTest {
  public static void main(String[] args) {
    /**
     * Jadi kalau ada variabel dengan tipe Object, Customer atau MemberCustomer bisa diassign dengan
     * instance dari MemberCustomer. Contohnya seperti di bawah ini :
     */
    Object o = new MemberCustomer();
    Customer c = new MemberCustomer();
    MemberCustomer mc = new MemberCustomer();
    Object object = mc;
    Customer cust = mc;
    Serializable s = new MemberCustomer();
    /**
     * Jadi MemberCustomer mempunyai banyak bentuk (polimorfsme). Kita akan sering melihat
     * kode dengan pola seperti ini, variabel akan dideklarasikan dengan tipe interface tetapi
     * diinstansiasi dengan class yang mengimplementasikan interface tersebut. Praktek seperti ini
     * dikategorikan sebagai praktek yang baik sehingga banyak diikuti oleh developer Java.
     */
  }
}
