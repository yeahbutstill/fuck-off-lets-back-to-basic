package id.toki.tlx.algo;

public class BangunRuang {
  public static void main(String[] args) {
    int s = 8;
    int luas = luasKubus(s);
    System.out.println(luas);
  }

  // membuat fungsi luas kubus
  private static int luasKubus(int sisi) {
    // memanggil fungsi luas persegi
    return 6 * luasPersegi(sisi);
  }

  // membuat fungsi luas persegi
  private static int luasPersegi(int sisi) {
    return sisi * sisi;
  }
}
