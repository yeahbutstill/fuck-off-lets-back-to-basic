package chapter3programcontrolstatements.testjava;

public class Test6 {
  public static void main(String[] args) {
    try {
      badMethod();
      System.out.print("A");
    } catch (Exception e) {
      System.out.print("B");
    } finally {
      System.out.print("C");
    }
    System.out.print("D");
  }

  private static void badMethod() {}
}
