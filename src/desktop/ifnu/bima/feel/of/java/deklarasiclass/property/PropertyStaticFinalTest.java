package desktop.ifnu.bima.feel.of.java.deklarasiclass.property;

public class PropertyStaticFinalTest {
  /**
   * Keyword berikutnya yang bisa diletakkan dalam property static adalah fnal. Adanya keyword fnal
   * dalam deklarasi property menyebabkan property hanya bisa diinisialisasi (diberi nilai) sekali saja,
   * setelah itu nilainya tidak bisa dirubah, perilaku ini biasa kita sebut dengan konstanta: sekali
   * diberi nilai tidak bisa berubah nilainya. Kalau kita memaksa merubah nilainya maka akan terjadi
   * error pada waktu kompilasi atau kalau java compiler tidak sanggup menentukan errornya akan
   * terjadi pada waktu aplikasi berjalan.
   */

  // error
  //public static final String nilaiStatic;

  public static final Integer AGE = 29;

  public static void main(String[] args) {
    // error
    // PropertyStaticFinalTest.nilaiStatic = "nilai dari main";
    // System.out.println(nilaiStatic);

    System.out.print("udah ditambah 10 di methodUbahPropertyStatic jadi nilainya sekarang : ");
    methodUbahPropertyStatic();

    // System.out.println(nilaiStatic);
    System.out.println("diakses langsung dari kelasnya : " + PropertyStaticFinalTest.AGE);
  }

  private static void methodUbahPropertyStatic() {
    // error
    //PropertyStaticFinalTest.nilaiStatic = "nilai dari methodUbahPropertyStatic";

    System.out.println(PropertyStaticFinalTest.AGE + 10);
  }
}
