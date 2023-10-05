package com.yeahbutstill.java21.artivisi.latihan;

import java.time.LocalDate;

public class Karyawan {
  public static Integer jumlahKaryawan = 0;
  public String nip;
  public String nama;
  private LocalDate tanggalLahir;
  private LocalDate tanggalBergabung;

  public Karyawan() {
    jumlahKaryawan += 1;
    System.out.println("Membuat karyawan baru");
  }

  public Karyawan(String nip, String nama) {
    this();
    this.nip = nip;
    this.nama = nama;
  }

  public LocalDate getTanggalLahir() {
    // query dulu ke db
    return tanggalLahir;
  }

  public void setTanggalLahir(LocalDate tanggalLahir) {
    // insert audit log
    this.tanggalLahir = tanggalLahir;
  }

  public LocalDate getTanggalBergabung() {
    return tanggalBergabung;
  }

  public void setTanggalBergabung(LocalDate tanggalBergabung) {
    this.tanggalBergabung = tanggalBergabung;
  }

  public Integer hitungUsia() {
    Integer usia = LocalDate.now().getYear() - tanggalLahir.getYear();
    return usia;
  }
}
