package desktop.ifnu.bima.feel.of.java.oop.collectiondangenerics;

public class ToStringTest {
  public static void main(String[] args) {
    ToStringTest t = new ToStringTest();
    System.out.println(t);
  }

  @Override
  public String toString() {
    return "ini toString() method yang dari Object Class untuk ToStringTest class{}";
  }
}
