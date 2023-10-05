package com.zamannow.basic;

public class TipeDataString {
  private String namaDepan;
  private String namaBelakang;
  private String namaLengkap;
  private String alamat;

  public TipeDataString() {}

  public TipeDataString(String namaDepan, String namaBelakang, String namaLengkap, String alamat) {
    this.namaDepan = namaDepan;
    this.namaBelakang = namaBelakang;
    this.namaLengkap = namaLengkap;
    this.alamat = alamat;
  }

  public static void main(String[] args) {
    TipeDataString tipeDataString = new TipeDataString();
    tipeDataString.setNamaDepan("Naruto");
    tipeDataString.setNamaBelakang("Uzumaki");
    tipeDataString.setNamaLengkap(
        tipeDataString.getNamaDepan() + " " + tipeDataString.getNamaBelakang());
    tipeDataString.setAlamat("Depag");

    System.out.println(tipeDataString.getAlamat());
    System.out.println(tipeDataString.getNamaDepan());
    System.out.println(tipeDataString.getNamaLengkap());
    System.out.println();
    System.out.println();

    String name;
    name = "Sasuke";
    System.out.println(name);

    name = "Sakura";
    System.out.println(name);
    System.out.println(name.equals(name));
    System.out.println(name == "Sasuke");
    System.out.println(name.equals("Sasuke"));
  }

  public String getNamaDepan() {
    return namaDepan;
  }

  public void setNamaDepan(String namaDepan) {
    this.namaDepan = namaDepan;
  }

  public String getNamaBelakang() {
    return namaBelakang;
  }

  public void setNamaBelakang(String namaBelakang) {
    this.namaBelakang = namaBelakang;
  }

  public String getNamaLengkap() {
    return namaLengkap;
  }

  public void setNamaLengkap(String namaLengkap) {
    this.namaLengkap = namaLengkap;
  }

  public String getAlamat() {
    return alamat;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }
}
