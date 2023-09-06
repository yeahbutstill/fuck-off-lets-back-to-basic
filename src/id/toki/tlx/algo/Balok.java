package id.toki.tlx.algo;

public class Balok extends PersegiPanjangSuperClass {
    private int tinggi;
    public void setTinggi(int t) {
        tinggi = t;
    }

    public int getTinggi() {
        return tinggi;
    }

    public int volume() {
        int v = getPanjang() * getLebar() * tinggi;
        return v;
    }
}
