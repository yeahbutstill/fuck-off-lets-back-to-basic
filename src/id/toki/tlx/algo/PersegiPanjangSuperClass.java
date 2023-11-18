package id.toki.tlx.algo;

public class PersegiPanjangSuperClass {
    private int panjang;
    private int lebar;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int luas() {
        int luas = panjang * lebar;
        return luas;
    }
}
