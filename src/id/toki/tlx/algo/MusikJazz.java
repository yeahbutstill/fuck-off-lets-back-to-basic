package id.toki.tlx.algo;

public class MusikJazz {
    private String penyanyi;

    public void setPenyanyi(String nama) {
        // setJudulLagu("Indonesia Raya"); // Salah, setJudulLagu() tidak dikenal di sini
        penyanyi = nama;
    }

    public String getPenyanyi() {
        return penyanyi;
    }

    public void showPenyanyi() {
        // System.out.println("Judul lagu : " + getJudulLagu()); // Salah
        System.out.println("Penyanyi " + penyanyi);
    }
}
