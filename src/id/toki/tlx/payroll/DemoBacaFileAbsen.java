package id.toki.tlx.payroll;

import java.io.File;
import java.util.List;

public class DemoBacaFileAbsen {
    public static void main(String[] args) {
        String namaFilePegawai = "data" + File.separator + "tarif.csv";
        String namaFileAbsen = "data" + File.separator + "absen-09.csv";
        PegawaiDao pd = new PegawaiDao(namaFilePegawai);
        AbsenDao ad = new AbsenDao(namaFileAbsen, pd);
        List<Absen> daftarAbsen = ad.semuaData();

        // tampilkan isi daftar pegawai
        for (Absen px : daftarAbsen) {
            System.out.println("=======================================");
            System.out.println("Nomor Pegawai : " + px.getPegawai().getNomer());
            System.out.println("Nama Pegawai : " + px.getPegawai().getNama());
            System.out.println("Gaji Pokok : " + px.getPegawai().getGaji());
            System.out.println("Jam Datang : " + px.getDatang());
            System.out.println("Jam Pulang : " + px.getPulang());
        }
    }
}
