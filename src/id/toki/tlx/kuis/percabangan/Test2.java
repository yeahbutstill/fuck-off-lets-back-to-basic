package id.toki.tlx.kuis.percabangan;

public class Test2 {
  public static void main(String[] args) {
    int x = 1;
    int y = 1;
    boolean u = (1 <= x) && (x <= 10);
    boolean v = (0 <= y) && (y < 50);

    if (u && v) {
      System.out.println("masuk");
    } else {
      System.out.println("keluar");
    }
  }
}
