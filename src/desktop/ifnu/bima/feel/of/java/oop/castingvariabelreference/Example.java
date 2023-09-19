package desktop.ifnu.bima.feel.of.java.oop.castingvariabelreference;

import desktop.ifnu.bima.feel.of.java.oop.overridingdanoverloading.Customer;
import desktop.ifnu.bima.feel.of.java.oop.overridingdanoverloading.MemberCustomer;

public class Example {
  public static void main(String[] args) {
    // casting terhadap tipe data reference
    // bagaimana kalau misalnya variabel yang sudah dideklarasikan dengan class orang tua
    // kemudian diinstansiasi dengan menggunakan class anaknya akan diassign lagi ke variabel lain
    // dengan tipe class anaknya? Hal ini bisa dilakukan dengan menggunakan casting
    Customer c = new MemberCustomer();
    // casting berhasil karena c diinstansiasikan dengan class MemberCustomer
    MemberCustomer mc = (MemberCustomer) c;

    c = new Customer();
    // casting gagal dan terjadi ClassCastException karena c diinstansiasikan dengan class Customer
    mc = (MemberCustomer) c;

    c = new MemberCustomer();
    // casting berhasil karena c diinstansiasikan dengan class MemberCustomer
    mc = (MemberCustomer) c;

    //        String s = "ini String";
    //        // kode ini gagal dicompile karena String tidak mempunyai hubungan sama sekali dengan
    // MemberCustomer
    //        mc = (MemberCustomer) s;
  }
}
