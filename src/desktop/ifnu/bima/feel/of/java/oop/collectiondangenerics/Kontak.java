package desktop.ifnu.bima.feel.of.java.oop.collectiondangenerics;

public class Kontak {
  private String nama;
  private String number;

  public Kontak() {}

  public Kontak(String nama, String number) {
    this.nama = nama;
    this.number = number;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  // wajib di override kalau engga sama aja jadinya kaya (this == obj)
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Kontak kontak)) return false;

    if (getNama() != null ? !getNama().equals(kontak.getNama()) : kontak.getNama() != null)
      return false;
    return getNumber() != null
        ? getNumber().equals(kontak.getNumber())
        : kontak.getNumber() == null;
  }

  // wajib
  /*
    Method hashCode akan mengembalikan nilai integer unik untuk setiap object yang berbeda.
  Aturanya adalah :
  • Method hashCode dari sebuah object harus mengembalikan nilai yang sama walaupun
  dieksekusi berkali kali selama nilai property dalam object tidak berubah.
  • Kalau dua buah object dioperasikan dengan method equals mengembalikan nilai true maka
  method hashCode dari kedua object harus mengembalikan nilai integer yang sama.
  Sebaliknya, kalau dua buah object mengembalikan nilai false maka hashCode untuk kedua
  object akan mengembalikan nilai integer yang berbeda.
  • Kalau dua buah object dioperasikan dengan method equals mengembalikan nilai false maka
  method hashCode tidak harus mengembalikan nilai yang berbeda. Mengembalikan nilai yang
  sama pun tidak masalah.
     */
  @Override
  public int hashCode() {
    /*
    hashCode sangat vital ketika kita menggunakan collection yang memanfaatkan nilai hashCode
    ini, seperti HashSet atau HashMap. Perhitungan hashCode yang salah akan membuat kedua
    jenis collection ini berantakan. Kita akan kembali lagi ke topik hashCode ketika membahas
    kedua collection tersebut di bab berikutnya.
    */
    int result = getNama() != null ? getNama().hashCode() : 0;
    result = 31 * result + (getNumber() != null ? getNumber().hashCode() : 0);
    return result;
  }

  // wajib di override
  @Override
  public String toString() {
    return "Kontak{" + "nama='" + nama + '\'' + ", number='" + number + '\'' + '}';
  }
}

/**
 * Kalau ingin membandingkan dua buah object apakah sama secara logis, kita akan menggunakan method
 * equals, tetapi masalahnya adalah implementasi method equals dari class Object sama persis dengan
 * operator ==, sehingga harus dioverride agar walaupun dua buah object yang berbeda tetap dianggap
 * sama asalkan suatu kriteria terpenuhi. Seperti yang terjadi dengan class String dalam contoh di
 * atas, method equalsnya dioverride agar mengembalikan true kalau dua buah object dari class String
 * mempunyai nilai string yang sama.
 */
