package desktop.ifnu.bima.feel.of.java.oop.feelofjava;

public class VarargsOld {
  public static void main(String[] args) {
    VarargsOld varargsOld = new VarargsOld();
    String[] starr = new String[1];
    starr[0] = "Maya";
    varargsOld.printAll(starr);
  }

  public void printAll(String[] arr) {
    for (String curr : arr) {
      System.out.println(curr);
    }
  }
}
