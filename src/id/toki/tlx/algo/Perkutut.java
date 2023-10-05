package id.toki.tlx.algo;

public class Perkutut extends HewanAbs {
  public Perkutut() {
    super("perkutut", 2, true);
  }

  public static void main(String[] args) {
    Perkutut p = new Perkutut();
    p.lihatHewan();
    p.bersuara();
  }

  @Override
  public void bersuara() {}
}
