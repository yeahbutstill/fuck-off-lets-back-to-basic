package id.toki.tlx.algo;

public class Manusia {
    // definisi atribut
    private String nama;
    private int umur;

    public Manusia() {
    }

    public Manusia(String nama) {
        this.nama = nama;
    }

    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    // definisi method
    public void setNama(String a) {
        nama = a;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int a) {
        umur = a;
    }
}
