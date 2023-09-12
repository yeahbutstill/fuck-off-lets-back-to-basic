package desktop.ifnu.bima.feel.of.java.deklarasiclass.stackorheap.passingbyreference;

/**
 * Variabel dengan tipe reference seperti : object atau tipe data array, jika digunakan sebagai
 * parameter dalam method maka akan terjadi prosess passing by reference. Artinya data yang dilempar
 * dari kode pemanggil ke dalam method, yang dibawa adalah reference (alamat) dari variabelnya. Jika
 * variabel di dalam method berubah maka nilai variabel di pemanggil juga ikut berubah.
 */
public class PassByReference {

  private static final Integer[] AGE = {1000};

  public static void main(String[] args) {
    String[] nama = new String[1]; // jumlah array
    nama[0] = "Maya"; // set array index 0
    System.out.println("nilai lama dari method main: " + nama[0]);
    ubahNama(nama);
    System.out.println("nilai lama dari method main: " + nama[0]);
    System.out.println();

    System.out.println(AGE[0]);
    ubahAngka(AGE);
    System.out.println(AGE[0]);
  }

  /**
   * maka method ubahNama
   * akan menggunakan pass by reference, sehingga kalau nilai di dalam variabel nama diubah
   * didalam method ubahNama maka variabel yang sama di dalam method main juga ikut berubah
   * @param nama
   */
  public static void ubahNama(String[] nama) {
    nama[0] = "Dani";
    System.out.println("nama baru di dalam method: " + nama[0]);
  }

  public static void ubahAngka(Integer[] age) {
    age[0] = 27;
    System.out.println("age baru di dalam method: " + age[0]);
  }
}
