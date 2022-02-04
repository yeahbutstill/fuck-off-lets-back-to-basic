package chapter5moredatatypesandoperators.arrayonedimension;

// Prevent a division by zero using the ?
public class NoZeroDiv {
  public static void main(String[] args) {
    int result;

    for (int i = -5; i < 6; i++) {
      result = i != 0 ? 100 / i : 0; // this prevents a divide-by-zero.
      if (i != 0) {
        System.out.println("100 / " + i + " is " + result);
      }
    }
  }
}
