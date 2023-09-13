package desktop.ifnu.bima.feel.of.java.operator.aritmatika;

public class Example {
  int x = 10 + 100;
  int y = 100 - 7;
  int z = 100 * 5;
  int a = 100 / 2;
  int x1 = 100 % 7;

  public static void main(String[] args) {
    /**
     * Operator + (plus) selain digunakan sebagai penambahan juga digunakan sebagai penggabungan
     * String (String concatenation). Contohnya :
     */
    String s = "ini" + " String";
    System.out.println(s);

    // String concatenation menjadi sedikit kompleks kalau dirangkai dengan angka, contohnya:
    int a1 = 10;
    int b = 100;
    /**
     * Ketika salah satu operand bertipe String, maka seluruh operasi + akan menjadi String
     * concatenation, variabel a dan b juga dianggap sebagi String
     */
    System.out.println(s + a1 + b);
    System.out.println();

    /**
     * Java, seperti halnya C/C++ juga mengenal operator increment dan decrement : ++ increment
     * (postfix dan prefix) -- decrement (postfix dan prefix)
     */

    /**
     * Kedua operator ini disebut juga unary operator karena hanya membutuhkan satu operand saja,
     * sedikit berbeda dengan operator aritmatik lain yang membutuhkan dua buah operand. Operator
     * increment akan menaikkan nilai dari operand sebesar satu satuan, sedangkan decrement akan
     * menurunkan nilai dari operand sebanyak satu satuan. Kedua operator ini adalah bentuk lebih
     * pendek lagi dari operator gabungan (+= dan -=). Berikut ini contoh bentuk paling panjang
     * hingga paling pendek :
     */
    int x = 10;
    x = x + 1; // bentuk paling panjang
    x += 1; // menggunakan operator gabungan +=
    x++; // menggunakan operator increment
    int y = 10;
    y = y - 1; // bentuk paling panjang
    y -= 1; // menggunakan operator gabungan -=
    y--; // menggunakan operator decrement

    /**
     * Operator increment dan decrement bisa diletakkan setelah operand (postfix) maupun sebelum
     * operand (prefix), kedua bentuk ini sama-sama menaikkan atau menurunkan nilai operand sebanyak
     * satu satuan, tetapi evaluasi terhadap operasinya mempunyai nilai berbeda. Hasil evaluasi
     * operator increment yang diletakkan setelah operand sama dengan nilai operand sebelum
     * dievaluasi, sedangkan hasil evaluasi operator increment yang diletakkan sebelum operand
     * adalah lebih banyak satu satuan daripada nilai operan sebelum dievaluasi, hmm sepertinya agak
     * susah dimengerti ya? baiklah, mari kita lihat contoh di bawah ini agar lebih jelas :
     */
    int x2 = 10;
    System.out.println("x++ = " + x2++);
    System.out.println("Setelah evaluasi, x = " + x2);
    int y2 = 10;
    System.out.println("++y = " + ++y2);
    System.out.println("Sebelum evaluasi, y = " + y2);
  }
}
