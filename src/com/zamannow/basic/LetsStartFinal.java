package com.zamannow.basic;

public class LetsStartFinal {
  private final String name = "Saya";
  private static final String alamat = "Depag";
  private String nohp = "08080808";

  public static void main(String[] args) {
    var letsStartFinal = new LetsStartFinal();
    System.out.println(letsStartFinal.name);
    System.out.println(alamat);
    System.out.println(letsStartFinal.nohp);

    final String namaOrangtua = "Sae";
    // namaOrangtua = "Yun"; // errpr karena nama sudah di set final
    System.out.println(namaOrangtua);
  }
}
