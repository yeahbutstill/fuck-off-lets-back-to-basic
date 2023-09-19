package desktop.ifnu.bima.feel.of.java.oop;

import java.util.UUID;

public class Keluarga {
    private UUID id;
    private String namaIbuKandung;
    private String namaAyahKandung;
    private int umur;
    private Alamat alamat; // composition Keluarga HAS-A Alamat

    // Enkapsulasi karena sebuah property diset akses modifiernya private dan untuk mengaksesnya menggunakan get dan set method
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNamaIbuKandung() {
        return namaIbuKandung;
    }

    public void setNamaIbuKandung(String namaIbuKandung) {
        this.namaIbuKandung = namaIbuKandung;
    }

    public String getNamaAyahKandung() {
        return namaAyahKandung;
    }

    public void setNamaAyahKandung(String namaAyahKandung) {
        this.namaAyahKandung = namaAyahKandung;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public Alamat getAlamat() {
        return alamat;
    }

    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "Keluarga{" +
                "id=" + id +
                ", namaIbuKandung='" + namaIbuKandung + '\'' +
                ", namaAyahKandung='" + namaAyahKandung + '\'' +
                ", umur=" + umur +
                ", alamat=" + alamat +
                '}';
    }
}
