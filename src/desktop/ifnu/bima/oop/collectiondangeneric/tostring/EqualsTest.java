package desktop.ifnu.bima.oop.collectiondangeneric.tostring;

/**
 * Method equals dan hashCode berperan sangat penting dalam collection. Method equals digunakan
 * untuk membandingkan antara dua buah object apakah sama atau tidak secara logis. Operator == bisa
 * digunakan untuk membandingkan dua buah object, tetapi perbandingan inihanya akan menghasilkan
 * true kalau dua buah object apakah berada dalam memory yang sama, atau bisa dikatakan dua buah
 * object ini mempunyai reference yang sama persis. Kalau operator == mengembalikan nilai true
 * berarti dua buah object ini adalah sama persis baik secara alamat memory dan otomatis sama secara
 * logis. Method equals akan mengembalikan true kalau kedua object sama secara logis walaupun kedua
 * object mempunyai reference berbeda (tidak berada di memory yang sama). Kita ambil contoh sebuah
 * String, dua buah object string akan mengembalikan false jika dioperasikan dengan operator ==
 * walaupun string yang ada di dalamnya sama. Tetapi method equals akan mengembalikan nilai true
 * walaupun objectnya berada di memory berbeda asalkan nilai stringnya sama. Mari kita lihat
 * bagaimana penjelasan di atas kalau dilihat dalam kode. Perhatikan kode berikut ini :
 */
public class EqualsTest {
  public static void main(String[] args) {
    String abc = new String("abc");
    String abc1 = new String("abc");
    Boolean equalsOperator = (abc == abc1);
    System.out.println("abc == abc ? " + equalsOperator);
    Boolean equalsMethod = abc.equals(abc1);
    System.out.println("abc.equals(abc) ? " + equalsMethod);
  }
}

/**
 * apakah output dari kode di atas? Menggunakan operator == maka hasilnya adalah false karena kedua
 * variabel String diinisialisasi dengan menggunakan new String. Sedangkan menggunakan method equals
 * hasilnya adalah true karena kedua variabel mempunyai nilai string yang sama.
 */
