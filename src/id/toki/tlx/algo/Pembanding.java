package id.toki.tlx.algo;

public class Pembanding {
  static boolean a = true;
  static boolean b = false;
  static int c = 15;
  static int d = 11;

  public static void main(String[] args) {
    System.out.println("Memberikan hasil true jika nilai a sama dengan b = " + (a == b));
    System.out.println("Memberikan hasil true jika nilai a tidak sama dengan b = " + (a != b));
    System.out.println("Memberikan hasil true jika nilai a lebih dari nilai b = " + (c > d));
    System.out.println("Memberikan hasil true jika nilai a kurang dari nilai b = " + (c < d));
    System.out.println(
        "Memberikan hasil true jika nilai a lebih dari sama dengan nilai b = " + (c >= d));
    System.out.println(
        "Memberikan hasil true jika nilai a kurang dari sama dengan nilai b = " + (c <= d));
  }
}
