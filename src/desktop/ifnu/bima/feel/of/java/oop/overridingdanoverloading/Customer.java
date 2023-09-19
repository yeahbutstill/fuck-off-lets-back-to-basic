package desktop.ifnu.bima.feel.of.java.oop.overridingdanoverloading;

import desktop.ifnu.bima.feel.of.java.oop.Address;
import java.util.UUID;

/**
 * Apa tujuan dari inheritance dilihat dari sisi kode? Yang pertama adalah mempromosikan code reuse,
 * yaitu penggunaan kembali kode yang sudah ditulis. Hal ini dikarenakan, sebagai turunan dari
 * Customer, MemberCustomer akan mempunyai semua sifat-sifat (kode) dari class Customer. Misalnya
 * kita tambahkan property dan method di dalam class Customer :
 */
public class Customer {
  private UUID id;
  private String nama;

  /**
   * Hubungan antara Customer dan Address adalah HAS-A, diimplementasikan dengan membuat property di
   * dalam class Customer dengan tipe Address.
   */
  private Address address;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  /**
   * Method overloading adalah salah satu feature dalam bahasa pemrograman Java, dimana dua buah
   * method bisa dideklarasikan dengan nama yang sama asal argumenya berbeda, baik dari jumlahnya,
   * tipenya atau urutan dari parameternya. Berikut ini adalah method yang berbeda walaupun namanya
   * sama :
   */
  public void setId(Long aId) {}

  public void setId(Integer aId) {}

  public void setId(Long aId, boolean checkNull) {}

  public void setId(boolean checkNull, Long aId) {}

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
}
