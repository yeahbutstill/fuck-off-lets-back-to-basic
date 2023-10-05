package id.toki.tlx.algo;

import java.util.Scanner;

public class MencakupArrayMethodPengulangan {
  public static void main(String[] args) {
    int p;
    int l;
    int t;
    int[] data;

    Scanner input = new Scanner(System.in);
    System.out.print("Masukan panjang : ");
    p = input.nextInt();

    System.out.print("Masukan lebar : ");
    l = input.nextInt();

    System.out.print("Masukan tinggi : ");
    t = input.nextInt();

    data = new int[3];
    MencakupArrayMethodPengulangan saya = new MencakupArrayMethodPengulangan();
    data[0] = saya.hitungLuas(p, l);
    data[1] = saya.hitungVolume(p, l, t);
    data[2] = 10;

    int bil = 0;
    while (bil <= 2) {
      saya.kalimat();
      System.out.println(data[bil]);
      bil = bil + 1;
    }
  }

  public void kalimat() {
    System.out.print("Isi matriks adalah : ");
  }

  public int hitungLuas(int p, int l) {
    int luas;
    luas = p * l;

    return luas;
  }

  public int hitungVolume(int p, int l, int t) {
    int volume;
    volume = p * l * t;

    return volume;
  }
}
