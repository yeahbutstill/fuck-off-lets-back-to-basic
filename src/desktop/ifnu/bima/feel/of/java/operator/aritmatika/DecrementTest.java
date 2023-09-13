package desktop.ifnu.bima.feel.of.java.operator.aritmatika;

public class DecrementTest {
  /**
   * Nah bisa kita lihat bahwa hasil setelah evaluasi adalah sama (11), tetapi ketika operator
   * increment sedang dievaluasi hasilnya berbeda. Kalau postfix hasilnya masih sama dengan nilai
   * operand, kalau prefix hasilnya lebih banyak satu satuan dibanding nilai operand. Aturan ini juga
   * berlaku untuk operator decrement
   *
   */
  public static void main(String[] args) {
    int x = 10;
    System.out.println("x-- = " + x--);
    System.out.println("Setelah evaluasi, x = " + x);
    x = 10;
    System.out.println("--x = " + --x);
    System.out.println("Setelah evalasi, x = " + x);
    System.out.println();

    // untuk bahan latihan
    int y = 10;
    System.out.println(--y);
    System.out.println(y++ + 21 + ++y);
  }
}
