package id.toki.tlx.algo;

public class ContohString {
  public static void main(String[] args) {
    byte[] data = new byte[7];
    data[0] = 15;
    data[1] = 25;
    data[2] = 35;
    data[3] = 45;
    data[4] = 55;
    data[5] = 65;
    data[6] = 75;

    String s1 = "Selamat Pagi";
    String s2 = new String("Good Morning");
    String s3 = new String(data);
    String s4 = new String(data, 2, 3);

    System.out.println("s1 = " + s1);
    System.out.println("s2 = " + s2);
    System.out.println("s3 = " + s3);
    System.out.println("s4 = " + s4);
  }
}
