package id.toki.tlx.algo;

public class Sapi extends HewanAbs {

    public Sapi() {
        super("Sapi", 4, false);
    }

    public static void main(String[] args) {
        Sapi s = new Sapi();
        s.lihatHewan();
        s.bersuara();
    }

    @Override
    public void bersuara() {
        System.out.println("\nmooooooooooooooooooooo");
    }
}
