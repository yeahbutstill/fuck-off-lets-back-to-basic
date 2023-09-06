package id.toki.tlx.algo;

// Contoh 1 Deklarasi Overload:
// public void setHarga(int harga){}
// public void setHarga(double harga){}
// public void setHarga(float harga){}
// public void setHarga(float harga, String jumlah){}
public class Phone {
    private String merk;
    private int harga;

    public Phone() {
    }

    public Phone(String merk) {
        this.merk = merk;
    }

    public Phone(String merk, int harga) {
        this.merk = merk;
        this.harga = harga;
    }

    public Phone(int harga) {
        this.harga = harga;
    }

    public void isiPhone(String merk) {
        this.merk = merk;
    }

    public void isiPhone(String merk, int harga) {
        this.merk = merk;
        this.harga = harga;
    }

    public void lihatPhone() {
        System.out.println("Merk : " + merk);
        System.out.println("Harga : " + harga);
        System.out.println(" ");
    }
}
