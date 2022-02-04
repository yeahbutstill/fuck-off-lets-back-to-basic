package desktop.ifnu.bima.oop.overridingdanoverloading;

import desktop.ifnu.bima.oop.inheritance.Customer;

/**
 * Apa yang terjadi kalau misalnya kita mendeklarasikan sebuah variabel dengan tipe Customer tetapi
 * diinstansiasi dengan object MemberCustomer, kemudian kita panggil method setId? Apakah method
 * setId yang ada dalam Customer atau MemberCustomer yang akan dieksekusi? Method yang dioverride
 * akan terikat dengan instance dari variabel, bukan tipe dari variabel, jadi jawaban dari
 * pertanyaan di atas adalah : yang dieksekusi adalah method setId dari class MemberCustomer bukan
 * dari class Customer.
 */
public class OverridingTest {
  public static void main(String[] args) {
    Customer c = new Customer();
    Customer mc = new MemberCustomer();
    Long id = null;
    // method setId yang dipanggil adalah yang dari class Customer karena c
    // dideklarasikan dengan tipe Customer dan diinstansiasi dengan class
    // Customer
    c.setId(id);
    // method setId yang dipanggil adalah yang dari class MemberCustomer
    // walaupun mc dideklarasikan dengan tipe Customer
    mc.setId(id);
  }
}

/**
 * Overloading dan overriding juga berlaku terhadap constructor, karena pada dasarnya constructor
 * adalah method.
 */
