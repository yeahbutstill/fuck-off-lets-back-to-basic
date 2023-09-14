package desktop.ifnu.bima.feel.of.java.operator.logika;

public class LogicalOperatorXor {
  public static void main(String[] args) {
    /**
     * Operator ^ disebut opertor xor, hasil operasi xor akan bernilai true kalau nilai operand di
     * sebelah kiri berbeda dengan operand di sebelah kanan. Misalnya operand sebelah kiri bernilai
     * true dan sebelah kanan bernilai false atau sebaliknya. Kalau kedua operand sama sama false
     * atau sama sama true maka hasilnya adalah false. Perhatikan contoh di bawah ini :
     */
    int x = 10;
    int y = 11;
    boolean z = (x > 10) ^ (y < 100);
    boolean z1 = (x >= 10) ^ (y < 100);
    boolean z2 = (x > 10) ^ (y >= 100);
    System.out.println(z); // variabel z akan bernilai true karena (x > 10) bernilai false dan (y < 100) bernilai true.
    System.out.println(z1);
    System.out.println(z2);
  }
}
