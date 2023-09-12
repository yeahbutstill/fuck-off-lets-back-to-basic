package desktop.ifnu.bima.feel.of.java.tipedatabawaanjava.wrapperclass;

public class SebelumJava5 {
  public static void main(String[] args) {
    // Sebelum java 5, selain String, semua class wrapper tidak bisa langsung diberi nilai literal.
    // Perlu proses konversi dari nilai primitif ke wrapper classnya dan sebaliknya. Berikut ini contoh
    // bagaimana memberi nilai ke dalam variabel dengan tipe data wrapper class sebelum java 5.
    //Integer x = new Integer(10);
    //int i = x.intValue();
    Long l = 100L;
    Long y = Long.valueOf(l);
    int i = Integer.parseInt("100");
  }
}
// Konversi dari satu tipe data wrapper class ke tipe data wrapper class yang lain tidak bisa
// menggunakan mekanisme casting seperti di dalam tipe data primitif. Hal ini dikarenakan pada
// dasarnya wrapper class adalah class, sedangkan casting dalam class hanya bisa dilakukan kalau
// ada hubungan inheritance antara kedua class yang sedang akan dicasting. Kalau proses casting
// antara dua class dilakukan secara ceroboh akan menyebabkan ClassCastException pada waktu
// kode dijalankan.
