package id.toki.tlx.algo;

public class Mahasiswa {
    private String nama;
    private String npm;
    private Integer nilai;

    // method arg constructor
    public Mahasiswa(String nama, String npm, Integer nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    // method no arg constructor
    public Mahasiswa() {
    }

    // method main
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Dani";
        mahasiswa.npm = "11111";
        mahasiswa.nilai = 75;
        System.out.println("Nama : " + mahasiswa.nama);
        System.out.println("NPM : " + mahasiswa.npm);
        System.out.println("Nilai : " + mahasiswa.nilai);
    }
}
