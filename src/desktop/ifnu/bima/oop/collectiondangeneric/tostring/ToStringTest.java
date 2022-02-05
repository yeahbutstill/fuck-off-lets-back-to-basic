package desktop.ifnu.bima.oop.collectiondangeneric.tostring;

/**
 * Method toString digunakan oleh Java untuk mendapatkan representasi String dari sebuah object atau
 * class. Implementasi default dari Class object adalah mencetak nama class diikuti oleh “alamat
 * memory dari object tersebut”. Mari kita lihat bagaimana implementasi standard dari method
 * toString ini :
 */
public class ToStringTest {

  public static void main(String[] args) {
    ToStringTest test = new ToStringTest();
    System.out.println("implementasi toString dari class Object " + "menghasilkan : " + test);
  }

  public String toString() {
    return "ini toString dari class ToString test";
  }
}

/**
 * method toString banyak digunakan dalam aplikasi Java, salah satunya adalah menampilkan text di
 * dalam komponen JcomboBox kalau item yang dimasukkan ke dalam JcomboBox adalah class yang kita
 * buat sendiri, bukan tipe data primitif atau class wrapper.
 */
