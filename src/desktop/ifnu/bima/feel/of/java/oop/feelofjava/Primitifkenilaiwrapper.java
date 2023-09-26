package desktop.ifnu.bima.feel.of.java.oop.feelofjava;

public class Primitifkenilaiwrapper {
  public static void main(String[] args) {
    // primitive ke object
    int a = 10;
    Integer b = Integer.valueOf(a);

    // object ke primitive
    Integer c = a;
    int d = c.intValue();

    // kode di atas sangat merepotkan dan tidak ada gunanya.

    System.out.println(b);
    System.out.println(d);
  }
}
