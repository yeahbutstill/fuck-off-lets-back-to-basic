package id.toki.tlx.payroll;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PegawaiDao {
  private final List<Pegawai> database = new ArrayList<>();

  public PegawaiDao(String namafile) {
    // file yang akan dibaca
    // Bungkus dengan BufferedReader, supaya bisa baca baris per baris
    try (BufferedReader reader = new BufferedReader(new FileReader(namafile))) {

      // baca file per baris, kemudian konversi menjadi object Pegawai
      String data = reader.readLine(); // baca baris pertama dan abaikan (header)
      while ((data = reader.readLine()) != null) {
        String[] baris = data.split(","); // pisahkan data dengan separator koma

        // object Pegawai
        Pegawai p = new Pegawai();
        p.setNomer(baris[0]); // index 0 : nomer pegawai
        p.setNama(baris[1]); // index 1 : nama pegawai
        p.setGaji(new BigDecimal(baris[2])); // index 2 : gaji pokok, konversi menjadi BigDecimal
        p.setDenda(new BigDecimal(baris[3])); // index 3 : denda telat, konversi menjadi BigDecimal
        p.setLembur(new BigDecimal(baris[4])); // index 4 : uang lembur, konversi menjadi BigDecimal
        p.setTransport(
            new BigDecimal(baris[5])); // index 5 : uang transport, konversi menjadi BigDecimal

        // masukkan ke variabel daftarPegawai
        database.add(p);
      }

    } catch (Exception err) {
      System.out.println("Gagal loading data pegawai");
      err.printStackTrace();
    }
  }

  public List<Pegawai> semuaPegawai() {
    return database;
  }

  public Pegawai cariByNomer(String nomer) {
    for (Pegawai p : database) {
      if (nomer.equals(p.getNomer())) {
        return p;
      }
    }
    return null;
  }
}
