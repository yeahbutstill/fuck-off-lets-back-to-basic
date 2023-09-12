package desktop.ifnu.bima.feel.of.java.tipedatabawaanjava.primitive;

public class CastingEksplisit {
  /**
   * Casting secara eksplisit dilakukan jika kita memasukkan data dengan ukuran lebih besar ke
   * ukuran lebih kecil, misalnya dari int ke byte. Perlu diperhatikan bahwa presisi data akan
   * berubah dari ukuran ke besar ke ukuran lebih kecil, sehingga kalau nilainya melebihi jangkauan,
   * maka terjadi pemotongan nilai dan hasilnya bisa tidak terduga. Misalnya di bawah ini :
   */
  int i = 100;

  byte b = (byte) i;
  // Contoh di atas tidak terjadi pemotongan nilai karena 100 masih di dalam jangkauan byte, kalau
  // contoh di bawah ini akan terjadi pemotongan nilai :
  int i1 = 1000;
  byte b1 = (byte) i;

  // nilai variabel b2 tidak akan 1000, karena jangkauan byte hanya sampai 127 saja. Silahkan
  // mencoba menjalankan operasi di atas untuk mengetahui berapa nilai akhir dari variabel b2
  // setelah terjadi pemotongan, apakah dugaan anda benar?

  public static void main(String[] args) {
    CastingEksplisit castingEksplisit = new CastingEksplisit();
    System.out.println(castingEksplisit.i1);
    System.out.println("terpotong karena byte max nya 127");
    System.out.println(castingEksplisit.b1);
  }
}
