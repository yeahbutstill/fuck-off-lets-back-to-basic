package desktop.ifnu.bima.oop;

/**
 * Inheritance (turunan) ada di mana-mana dalam Java. Sangat tidak mungkin membuat aplikasi tanpa
 * melibatkan konsep Inheritance, faktanya setiap class yang kita tulis adalah turunan dari class
 * Object. Anda ingin bukti? Ingat-ingat lagi bab tentang operator, di sana ada satu operator
 * instanceof, operator ini digunakan untuk mengetes apakah sebuah object merupakan tipe dari suatu
 * class. Operator ini akan mengembalikan true kalau tipe dari object tersebut adalah class yang ada
 * di operand sebelah kanan dari operator instanceof, sebaliknya nilainya adalah false. Kita lihat
 * contohnya di bawah ini :
 */
public class InheritanceTest {
  public static void main(String[] args) {
    InheritanceTest test = new InheritanceTest();
    if (test instanceof Object) {
      System.out.println("test tipenya Object");
    } else {
      System.out.println("test tipenya bukan Object");
    }
  }
}
