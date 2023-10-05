package id.toki.tlx.payroll;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class AbsenDao {
  private final List<Absen> database = new ArrayList<>();

  public AbsenDao(String namafile, PegawaiDao pegawaiDao) {
    // file yang akan dibaca
    // Bungkus dengan BufferedReader, supaya bisa baca baris per baris
    try (BufferedReader reader = new BufferedReader(new FileReader(namafile))) {

      // parser untuk konversi dari String menjadi Date (berisi tanggal + waktu)
      SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd HH:mm");

      // baca file per baris, kemudian konversi menjadi object Absen
      String data = reader.readLine(); // baca baris pertama dan abaikan (header)
      while ((data = reader.readLine()) != null) {
        String[] baris = data.split(","); // pisahkan data dengan separator koma

        String nomer = baris[0]; // nomer pegawai
        String tanggal = baris[1]; // tanggal, format : yyyy-MM-dd
        String jamDatang = baris[2]; // jam datang, format : HH:mm
        String jamPulang = baris[3]; // jam datang, format : HH:mm

        // object Absen
        Absen a = new Absen();
        Pegawai p = pegawaiDao.cariByNomer(nomer);
        a.setPegawai(p);

        a.setDatang(parser.parse(tanggal + " " + jamDatang));
        a.setPulang(parser.parse(tanggal + " " + jamPulang));

        // masukkan ke variabel daftarPegawai
        database.add(a);
      }

    } catch (Exception err) {
      System.out.println("Gagal loading data absen");
      err.printStackTrace();
    }
  }

  public List<Absen> semuaData() {
    return database;
  }
}
