package cls;

public class Segitiga { // class
    private int panjang = 10; // atribute
    private int tinggi = 5;
    private int lebar = 5;

    // default constructor
    public Segitiga() {
    }

    // constructor
    public Segitiga(int panjang, int tinggi, int lebar) {
        this.panjang = panjang;
        this.tinggi = tinggi;
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    // method
    public int volume(int p, int t, int l) {
        return p * t * l;
    }


}
