package id.toki.tlx.algo;

public class Lagu {
    private String band;
    private String judul;

    public void isiParam(String judul, String band) {
        this.judul = judul;
        this.band = band;
    }

    public void cetakKeLayar() {
        if (judul == null && band == null) {
            return;
        }
        System.out.println("Judul : " + judul + "\nBand : " + band);
    }
}
