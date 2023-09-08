package desktop.ifnu.bima.feel.of.java.deklarasiclass.konstanta;

public interface ConstantsInterface {
  /**
   * Konstanta dalam java juga mempunyai aturan penamaan yang diterangkan dalam Java Code
   * Convention. Nama konstanta semuanya huruf besar dan dipisahkan dengan underscore (_)
   * kalau terdiri dari dua kata atau lebih. Contoh pembuatan konstanta yang baik adalah seperti
   * berikut ini :
   */
  Integer MAX_USER = 10;

  String APPLICATION_NAME = "POS";
  String LAKI_LAKI = "L";
  String PEREMPUAN = "P";
}
/**
 * Perhatikan kode di atas menggunakan interface, bukan class. Kemudian semua property tidak
 * perlu dideklarasikan sebagai public static fnal karena secara default semua property dalam
 * interface sudah mempunyai ketiga keyword tersebut. Kalau kita deklarasikan ConstantsInterface di atas
 * sebagai class maka ketiga keyword tersebut harus disertakan agar property dianggap sebagai
 * konstanta
 */
