package id.toki.tlx.algo;

public class KotakPejal extends Kotak1 {
  private double berat;

  KotakPejal(int p, int l, int t, int b) {
    super(p, l, t); // memanggil constructor kelas kotak
    berat = b;
  }
}
