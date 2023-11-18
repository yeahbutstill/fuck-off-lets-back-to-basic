package id.toki.tlx.algo;

public class Kotak1 {
    double panjang;
    double lebar;
    double tinggi;

    // mendefinisikan constructor untuk kelas kotak
    public Kotak1() {
        panjang = 4;
        tinggi = 3;
        lebar = 2;
    }

    public Kotak1(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    double hitungVolume() {
        return (panjang * lebar * tinggi);
    }
}
