package desktop.ifnu.bima.feel.of.java.oop.overridingdanoverloading;

import java.util.UUID;

public class OverridingTest {
  public static void main(String[] args) {
    /**
     * Apa yang terjadi kalau misalnya kita mendeklarasikan sebuah variabel dengan tipe Customer
     * tetapi diinstansiasi dengan object MemberCustomer, kemudian kita panggil method setId? Apakah
     * method setId yang ada dalam Customer atau MemberCustomer yang akan dieksekusi? Method yang
     * dioverride akan terikat dengan instance dari variabel, bukan tipe dari variabel, jadi jawaban
     * dari pertanyaan di atas adalah : yang dieksekusi adalah method setId dari class
     * MemberCustomer bukan dari class Customer.
     */
    MemberCustomer memberCustomer = new MemberCustomer();
    Customer c = new Customer();
    Customer mc = new MemberCustomer();
    UUID id = null;

    /**
     * method setId yang dipanggil adalah yang dari class Customer karena c dideklarasikan dengan
     * tipe Customer dan diinstansiasi dengan class Customer
     */
    c.setId(id);

    System.out.println();

    /**
     * method setId yang dipanggil adalah yang dari class MemberCustomer walaupun mc dideklarasikan
     * dengan tipe Customer
     */
    mc.setId(id);
  }
}
