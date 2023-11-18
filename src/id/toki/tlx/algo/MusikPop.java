package id.toki.tlx.algo;

public class MusikPop {
    private String judulLagu; // hanya dapat dikenali oleh kelas MusikPop(superclass) dan subclass

    protected String getJudulLagu() {
        return judulLagu;
    }

    protected void setJudulLagu(String nama) { // hanya dapat dikenali oleh kelas A dan subclass
        judulLagu = nama;
    }
}
