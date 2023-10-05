package id.toki.tlx.algo;

public class Penugasan {
  static int a;

  public static void main(String[] args) {
    System.out.println("memberikan niali a = " + (a = 6));
    System.out.println(
        "memberikan nilai dengan menjumlahkannya terlebih dahulu dengan nilai sebelumnya a += "
            + (a += 5));
    System.out.println(
        "memberikan nilai dengan mengurangkannya terlebih dahulu dengan nilai sebelumnya a -= "
            + (a -= 5));
    System.out.println(
        "memberikan nilai dengan mengkalikannya terlebih dahulu dengan nilai sebelumnya a *= "
            + (a *= 5));
    System.out.println(
        "memberikan nilai dengan membagikannya terlebih dahulu dengan nilai sebelumnya a /= "
            + (a /= 5));
    System.out.println(
        "memberikan nilai dengan mencari sisa hasil baginya terlebih dahulu dengan nilai sebelumnya a %= "
            + (a %= 5));
  }
}
