package desktop.ifnu.bima.feel.of.java.oop.collectiondangenerics;

public class EqualsTest {
  public static void main(String[] args) {
    String abc = new String("abc");
    String abc1 = new String("abc");

    boolean equalsOperator = (abc == abc1);
    System.out.println("abc == abc ??? " + equalsOperator); // passing by reference

    boolean equalsMethod = abc.equals(abc1);
    System.out.println("abc.equals(abc1) ???" + equalsMethod); // passing by value

    /**
     * apakah output dari kode di atas? Menggunakan operator == maka hasilnya adalah false
     * karena kedua variabel String diinisialisasi dengan menggunakan new String. Sedangkan
     * menggunakan method equals hasilnya adalah true karena kedua variabel mempunyai nilai
     * string yang sama.
     */
  }
}
