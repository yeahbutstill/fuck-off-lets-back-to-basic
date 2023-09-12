package desktop.ifnu.bima.feel.of.java.deklarasiclass.stackorheap.passingbyvalue;

/**
 * Method dalam java bisa mempunyai parameter, setiap parameter pada dasarnya adalah local variabel,
 * tipe dari variabel itu bisa berupa reference (object) atau bisa juga berupa tipe data bawaan dari
 * java. Kedua jenis variabel ini akan diperlakukan berbeda oleh java, jika kita menggunakan tipe
 * variabel dengan tipe data bawaan java maka yang terjadi adalah passing by value, artinya data
 * yang dilempar dari kode pemanggil ke dalam method, yang dibawa adalah nilai dari variabelnya,
 * jika nilai variabel di dalam method berubah maka nilai variabel di pemanggil tidak ikut berubah.
 * Mari kita lihat contoh kodenya :
 */
public class PassByValue {

  private static final Integer AGE = 100;

  /**
   * Terdapat variabel nama di dalam method main yang dilempar ke method ubahNama, karena tipe
   * datanya String (tipe data bawaan dari java), maka ketika variabel nama diubah di dalam method
   * ubahNama maka tidak akan mempengaruhi nilai variabel nama di dalam method main
   */
  public static void main(String[] args) {
    String nama = "maya";
    System.out.println("nama lama dari method main: " + nama);
    ubahNama(nama);
    System.out.println("nama lama dari method main: " + nama);
    System.out.println();

    System.out.println(AGE);
    ubahAngka(AGE);
    System.out.println(AGE);
  }

  public static void ubahNama(String nama) {
    nama = "dani";
    System.out.println("nama baru di dalam method: " + nama);
  }

  public static void ubahAngka(Integer age) {
    age = 28;
    System.out.println("angka baru di dalam method: " + age);
  }
}
