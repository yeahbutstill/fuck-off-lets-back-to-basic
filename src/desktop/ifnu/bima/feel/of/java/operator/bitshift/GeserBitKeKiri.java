package desktop.ifnu.bima.feel.of.java.operator.bitshift;

public class GeserBitKeKiri {
  public static void main(String[] args) {
    int x = 11;
    int y = x << 2; // x digeser ke kiri dua langkah
    System.out.println(Integer.toBinaryString(x) + " sama dengan " + x);
    System.out.println(Integer.toBinaryString(y) + " sama dengan " + y);
  }
}
