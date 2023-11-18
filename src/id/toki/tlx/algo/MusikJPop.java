package id.toki.tlx.algo;

public class MusikJPop extends MusikPop {
    private final int tahunTerbit;

    // constructor kelas B
    MusikJPop(String judul, int tahun) {
        // judulLagu = judul; // Salah, karena A tidak dikenali di sini
        setJudulLagu(judul); // menggunakan method setJudulLagu()
        tahunTerbit = tahun;
    }

    public void showData() {
        // menggunakan method getJudulLagu()
        System.out.println("Judul Lagu : " + getJudulLagu());
        System.out.println("Tahun Terbit : " + tahunTerbit);
    }
}
