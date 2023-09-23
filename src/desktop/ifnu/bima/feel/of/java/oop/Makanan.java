package desktop.ifnu.bima.feel.of.java.oop;

public class Makanan extends MakananComparable {
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Makanan{" +
                "nama='" + nama + '\'' +
                "} " + super.toString();
    }
}
