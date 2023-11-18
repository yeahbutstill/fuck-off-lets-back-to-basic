package id.toki.tlx.algo;

public abstract class HewanAbs {
    protected String nama;
    protected int jumlahKaki;
    protected boolean bisaTerbang = false;

    public HewanAbs(String nama, int kaki, boolean terbang) {
        this.nama = nama;
        jumlahKaki = kaki;
        bisaTerbang = terbang;
    }

    public abstract void bersuara();

    public void lihatHewan() {
        System.out.println(" ");
        System.out.println("nama : " + nama);
        System.out.println("jumlah kaki : " + jumlahKaki);
        System.out.println("bisa terbang : " + bisaTerbang);
    }
}
