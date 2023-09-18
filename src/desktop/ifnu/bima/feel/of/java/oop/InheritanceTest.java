package desktop.ifnu.bima.feel.of.java.oop;


public class InheritanceTest {
  public static void main(String[] args) {
    InheritanceTest test = new InheritanceTest();
    /**
     * Inheritance (turunan) ada di mana-mana dalam Java. Sangat tidak mungkin membuat aplikasi
     * tanpa melibatkan konsep Inheritance, faktanya setiap class yang kita tulis adalah turunan dari
     * class Object. Anda ingin bukti? Ingat-ingat lagi bab tentang operator, di sana ada satu operator
     * instanceof, operator ini digunakan untuk mengetes apakah sebuah object merupakan tipe dari
     * suatu class. Operator ini akan mengembalikan true kalau tipe dari object tersebut adalah class
     * yang ada di operand sebelah kanan dari operator instanceof, sebaliknya nilainya adalah false.
     */
    if (test instanceof Object) {
      System.out.println("test tipenya Object");
    } else {
      System.out.println("test tipenya Bukan Object");
    }
    /**
     * Terbukti bahwa walaupun tidak secara eksplisit kita defnisikan InheritanceTest sebagai
     * turunan dari Object, faktanya InheritaceTest adalah turunan dari Object karena operator
     * instanceof mengembalikan nilai true ketika object dari InhertanceTest dioperasikan dengan
     * class Object.
     */
  }
}
