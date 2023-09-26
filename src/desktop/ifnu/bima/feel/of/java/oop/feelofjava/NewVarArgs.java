package desktop.ifnu.bima.feel.of.java.oop.feelofjava;

public class NewVarArgs {
  public static void main(String[] args) {
    NewVarArgs varargsOld = new NewVarArgs();
    varargsOld.printAll("Makanan", "Buah", "Macan", "Kerbau");
  }

  public void printAll(String... arr) {
    for (String curr : arr) {
      System.out.println(curr);
    }
  }
}
