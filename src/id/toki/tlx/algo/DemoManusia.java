package id.toki.tlx.algo;

public class DemoManusia {

  public static void main(String[] args) {
    Manusia[] arrMns = new Manusia[3]; // buat array of object
    Manusia objMns1 = new Manusia(); // constructor pertama
    objMns1.setNama("Dani");
    objMns1.setUmur(22);

    Manusia objMns2 = new Manusia("May yayaya"); // constructor kedua
    Manusia objMns3 = new Manusia("Hahaha", 30); // constructor ketiga

    arrMns[0] = objMns1;
    arrMns[1] = objMns2;
    arrMns[2] = objMns3;

    for (int i = 0; i < arrMns.length; i++) {
      System.out.println("Nama : " + arrMns[i].getNama());
      System.out.println("Nama : " + arrMns[i].getUmur());
      System.out.println("=============================");
    }
  }
}
