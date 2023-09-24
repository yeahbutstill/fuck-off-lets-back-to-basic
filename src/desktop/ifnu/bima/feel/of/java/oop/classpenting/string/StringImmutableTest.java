package desktop.ifnu.bima.feel.of.java.oop.classpenting.string;

public class StringImmutableTest {
  public static void main(String[] args) {
    String s = "ini string immutable";
    System.out.println("Sebelum operasi concat nilai s : " + s);
    // append tidak merubah variable s, tetapi dibuat object baru
    // dan object baru ini direturn sedangkan variable s nilainya tetap
    s.concat(" concat");
    System.out.println("Setelah operasi concat nilai s : " + s);
    String concat = s + " " + s.concat(" concat") + " object baru";
    System.out.println(concat);
  }
}
/**
 * Sebelum dan sesudah operasi concat nilai variabel s tetap, hal ini terjadi karena proses concat
 * dari class String akan membuat object baru kemudian dilakukan concat antara nilai yang
 * sekarang dipunyai oleh variabel s dengan string yang ada dalam parameter, dan object baru ini
 * direturn. Proses concat tidak merubah nilai yang dipunyai oleh variabel s, karena class String
 * immutable, sekali nilainya diset tidak bisa diubah lagi.
 *
 * Perhatikan juga proses string concatenantion dengan menggunakan operator + di atas, operasi
 * ini jika dilakukan menggunakan String akan menghasilkan banyak sekali object baru, yang
 * pertama adalah object hasil operasi append dari variabel s, kemudian object penggabungan
 * variabel s dengan s.concat dan terakhir hasil penggabungan ketiga string tersebut.
 *
 * Kalau proses concatenation atau pengolahan String secara umum dalam skala yang sangat besar,
 * maka akan menyebabkan penggunaan memory yang tidak efsien. Kalau kita dihadapkan dengan
 * masalah tersebut sebaiknya jangan menggunakan class String, selalu gunakan class StringBuilder
 * atau StringBuffer.
 *
 * Class StringBuffer dibuat untuk tujuan efsiensi, karena StringBuffer bukan class immutable
 * seperti class String. StringBuffer mempunyai kemampuan untuk digunakan dalam lingkungan
 * multi threading karena sifatnya yang thread safe, tetapi feature ini menyebabkan class
 * StringBuffer tidak efsien dari sisi komputasi CPU, karena thread safe memerlukan pengecekan
 * apakah yang melakukan operasi terhadap class StringBuffer ini adalah thread yang sama, kalau
 * threadnya berbeda maka prosesnya disuruh mengantri dan hanya satu thread dalam satu waktu
 * yang bisa melakukan manipulasi class StringBuffer ini.
 *
 * Class StringBuilder mempunyai tujuan yang sama persis dengan class StringBuffer, tetapai
 * StringBuilder tidak mempunyai fasilitas thread safe, sehingga performanya lebih cepat. Kalau kita
 * tidak memerlukan fasilitas thread safe maka StringBuilder adalah class yang tepat digunakan
 * untuk manipulasi string.
 */
