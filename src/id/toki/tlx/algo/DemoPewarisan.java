package id.toki.tlx.algo;

/**
 * Pewarisan (Inheritance) Pewarisan merupakan proses penciptaan kelas baru dengan mewarisi
 * karakteristik kelas yang sudah ada (biasa disebut kelas induk), ditambah dengan karakteristik
 * unik kelas baru tersebut (biasa disebut turunan). Dalam java, kelas induk ini dinamakan
 * superclass dan kelas turunan dinamakan subclass. Hewan adalah superclass dari karnivora dan
 * herbivora. Kelas turunan karnivora dan herbivora ini memiliki data dan method yang dimiliki kelas
 * hewan.
 */
public class DemoPewarisan {
  public static void main(String[] args) {
    PersegiPanjangSuperClass a = new PersegiPanjangSuperClass();
    a.setPanjang(5);
    a.setLebar(5);
    System.out.println(" ");
    System.out.println("Contoh Program Pewarisan");
    System.out.println(" ");
    System.out.println("Superclass PersegiPanjang");
    System.out.println("Panjang : " + a.getPanjang());
    System.out.println("Lebar : " + a.getLebar());
    System.out.println("Luas : " + a.luas());
    System.out.println(" ");

    Balok b = new Balok();
    /* kelas balok tinggal memanggil method yang ada didalam kelas persegi
     */
    b.setPanjang(4);
    b.setLebar(3);
    b.setTinggi(5);
    System.out.println("Subclass Balok");
    System.out.println("Panjang : " + b.getPanjang());
    System.out.println("Lebar : " + b.getLebar());
    System.out.println("Tinggi : " + b.getTinggi());
    System.out.println("Volume : " + b.volume());
  }
}
