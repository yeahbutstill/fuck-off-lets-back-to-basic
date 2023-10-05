package id.toki.tlx.kuis.analisiskompleksitas;

public class Test6 {
  public static void main(String[] args) {
    int n = 0;
    for (int i = 0; i < n; i++) {
      int counter = i;
      while (counter > 0) {
        counter = counter / 2;
      }

      counter = 0;
      while (counter * counter < n) {
        counter = counter + 1;
      }
    }
  }
}
