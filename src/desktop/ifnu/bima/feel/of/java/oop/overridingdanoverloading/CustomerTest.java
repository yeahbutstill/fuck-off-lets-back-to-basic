package desktop.ifnu.bima.feel.of.java.oop.overridingdanoverloading;

import java.util.UUID;

public class CustomerTest {
  public static void main(String[] args) {
    MemberCustomer member = new MemberCustomer();
    member.setId(UUID.randomUUID());
    member.setNama("Catalino");
    System.out.println("UUID Customer: " + member.getId());
    System.out.println("Nama Customer: " + member.getNama());
    /**
     * Terlihat bahwa tidak ada error dalam proses kompilasi, padahal class MemberCustomer tidak
     * mendefnisikan apapun, tetapi method setId dan getId dapat digunakan. Hal ini dikarenakan
     * MemberCustomer mengextends Customer, sehingga method setId dan getId diturunkan. Catat
     * juga bahwa property id sendiri tidak diturunkan ke dalam MemberCustomer, karena property id
     * menggunakan private sebagai access modifer.
     */
  }
}
