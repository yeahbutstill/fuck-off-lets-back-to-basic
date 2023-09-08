package desktop.ifnu.bima.feel.of.java.deklarasiclass.property;

public class PropertyFinalTest {
  /**
   * kalau begitu kapan property yang ditandai dengan fnal bisa diberi nilai? Pada waktu
   * mendeklarasikan property. Contoh di bawah ini adalah cara yang benar menginisialisasi nilai ke
   * property yang ditandai dengan fnal
   */
  public final String NILAIFINAL = "inisialisasi";
  /**
   * Perhatikan kode di atas, property nilaiFinal langsung diberi nilai pada waktu deklarasi. Karena
   * sekarang property nilaiFinal final tanpa static kita harus membuat object dari class PropertyFinalTest agar bisa
   * mengakses property nilaiFinal, berbeda dengan property yang ditandai static dimana kita bisa
   * langsung mengaksesnya tanpa membuat object.
   */


  public static void main(String[] args) {
    PropertyFinalTest finalTest = new PropertyFinalTest();
    System.out.println(finalTest.NILAIFINAL);
  }
}

/**
 * Masih ada keyword lain yang bisa kita letakkan dalam deklarasi property, yaitu volatile. Keyword
 * ini menyebabkan property tidak akan ikut disimpan ketika object diserialize. Proses serialize
 * adalah proses mengubah object ke dalam bentuk yang bisa ditransfer lewat media I/O, misalnya
 * object ini disimpan ke hardisk atau dikirim ke komputer lain lewat jaringan. Proses sebaliknya
 * adalah deserialize dimana dari bentuk ini diubah lagi menjadi bentuk object di dalam JVM.
 * Topikserialize dan deserialize akan sedikit kita bahas nanti pada waktu membahas arsitektur three tier.
 */
