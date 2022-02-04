package chapter3programcontrolstatements.testjava;

public class GeserGeserYukBisa {
  public static void main(String[] args) {
    GeserGeserYukBisa rotasi = new GeserGeserYukBisa();

    int[] raak = {1, 2, 3, 4, 5};

    rotasi.geserDuluKeKiri(raak, 2, raak.length);
    rotasi.tampilkanRaak(raak, raak.length);
  }

  void geserDuluKeKiri(int[] buku, int x, int n) {

    int[] raak = new int[x];

    for (int i = 0; i < x; i++) raak[i] = buku[i];

    for (int i = x; i < n; i++) {
      buku[i - x] = buku[i];
    }

    for (int i = 0; i < x; i++) {
      buku[i + n - x] = raak[i];
    }
  }

  void tampilkanRaak(int[] buku, int n) {
    for (int i = 0; i < n; i++) System.out.print(buku[i] + " ");
  }
}
