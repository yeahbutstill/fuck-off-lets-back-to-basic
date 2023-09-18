package desktop.ifnu.bima.feel.of.java.oop;

public class Betawi extends Keluarga { // inheritance Betawi IS-A Keluarga
    private String namaIstri;
    private String namaSuami;
    private int punyaAnak;

    public String getNamaIstri() {
        return namaIstri;
    }

    public void setNamaIstri(String namaIstri) {
        this.namaIstri = namaIstri;
    }

    public String getNamaSuami() {
        return namaSuami;
    }

    public void setNamaSuami(String namaSuami) {
        this.namaSuami = namaSuami;
    }

    public int getPunyaAnak() {
        return punyaAnak;
    }

    public void setPunyaAnak(int punyaAnak) {
        this.punyaAnak = punyaAnak;
    }

    @Override
    public String toString() {
        return "Betawi{" +
                "namaIstri='" + namaIstri + '\'' +
                ", namaSuami='" + namaSuami + '\'' +
                ", punyaAnak=" + punyaAnak +
                "} " + super.toString();
    }
}
