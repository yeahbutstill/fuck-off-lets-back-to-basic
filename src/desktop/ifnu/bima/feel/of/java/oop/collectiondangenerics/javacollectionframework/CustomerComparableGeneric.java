package desktop.ifnu.bima.feel.of.java.oop.collectiondangenerics.javacollectionframework;

import desktop.ifnu.bima.feel.of.java.oop.Address;
import desktop.ifnu.bima.feel.of.java.oop.Customer;

/**
 * Apa tujuan dari inheritance dilihat dari sisi kode? Yang pertama adalah mempromosikan code reuse,
 * yaitu penggunaan kembali kode yang sudah ditulis. Hal ini dikarenakan, sebagai turunan dari
 * Customer, MemberCustomer akan mempunyai semua sifat-sifat (kode) dari class Customer. Misalnya
 * kita tambahkan property dan method di dalam class Customer :
 */
public class CustomerComparableGeneric
    implements Comparable<
        Customer> { // interface ini digunakan untuk melakukan perbandingan antara dua buah
  // object,
  // mana yang lebih besar atau lebih kecil ataukah sama persis.

  private Long id;
  private String nama;

  /**
   * Hubungan antara Customer dan Address adalah HAS-A, diimplementasikan dengan membuat property di
   * dalam class Customer dengan tipe Address.
   */
  private Address address;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

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

  /**
   * Kalau ingin membandingkan dua buah object apakah sama secara logis, kita akan menggunakan
   * method equals, tetapi masalahnya adalah implementasi method equals dari class Object sama
   * persis dengan operator ==, sehingga harus dioverride agar walaupun dua buah object yang berbeda
   * tetap dianggap sama asalkan suatu kriteria terpenuhi. method equalsnya dioverride agar
   * mengembalikan true kalau dua buah object dari class String mempunyai nilai string yang sama.
   * Misalnya untuk class Customer, dua buah object Customer dianggap sama asalkan idnya sama, oleh
   * karena itu method equals akan dioverride seperti di bawah ini :
   *
   * @param o
   * @return
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Customer customer)) return false;

    if (getId() != null ? !getId().equals(customer.getId()) : customer.getId() != null)
      return false;
    if (getNama() != null ? !getNama().equals(customer.getNama()) : customer.getNama() != null)
      return false;
    return getAddress() != null
        ? getAddress().equals(customer.getAddress())
        : customer.getAddress() == null;
  }

  /**
   * Method hashCode akan mengembalikan nilai integer unik untuk setiap object yang berbeda.
   * Aturanya adalah : •Method hashCode dari sebuah object harus mengembalikan nilai yang sama
   * walaupun dieksekusi berkali kali selama nilai property dalam object tidak berubah. •Kalau dua
   * buah object dioperasikan dengan method equals mengembalikan nilai true maka method hashCode
   * dari kedua object harus mengembalikan nilai integer yang sama. Sebaliknya, kalau dua buah
   * object mengembalikan nilai false maka hashCode untuk kedua object akan mengembalikan nilai
   * integer yang berbeda. •Kalau dua buah object dioperasikan dengan method equals mengembalikan
   * nilai false maka method hashCode tidak harus mengembalikan nilai yang berbeda. Mengembalikan
   * nilai yang sama pun tidak masalah.
   *
   * @return
   */
  @Override
  public int hashCode() {
    int result = getId() != null ? getId().hashCode() : 0;
    result = 31 * result + (getNama() != null ? getNama().hashCode() : 0);
    result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
    return result;
  }

  /**
   * hashCode sangat vital ketika kita menggunakan collection yang memanfaatkan nilai hashCode ini,
   * seperti HashSet atau HashMap. Perhitungan hashCode yang salah akan membuat kedua jenis
   * collection ini berantakan. Kita akan kembali lagi ke topik hashCode ketika membahas kedua
   * collection tersebut di bab berikutnya.
   */
  @Override
  // Kalau menggunakan generics maka method compareTo tipe parameternya adalah Customer, bukan
  // Object. Contohnya :
  public int compareTo(Customer c) {
    // kecil ke besar
    return getId().compareTo(c.getId());
  }
}
