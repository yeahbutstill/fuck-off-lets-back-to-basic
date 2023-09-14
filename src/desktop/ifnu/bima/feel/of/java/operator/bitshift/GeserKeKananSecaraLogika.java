package desktop.ifnu.bima.feel.of.java.operator.bitshift;

public class GeserKeKananSecaraLogika {
  public static void main(String[] args) {
    int x = -11;
    int y = x >>> 2;
    System.out.println(x);
    System.out.println(Integer.toBinaryString(x));
    System.out.println("------------------------------ >>> 2");
    System.out.println(y);
    System.out.println(Integer.toBinaryString(y));
  }
}
