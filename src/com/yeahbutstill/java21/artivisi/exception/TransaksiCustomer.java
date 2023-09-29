package com.yeahbutstill.java21.artivisi.exception;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TransaksiCustomer {
  private static final List<String> bankTerdaftar =
      Arrays.asList("BNI", "BCA", "BRI", "MANDIRI", "BSI");
  private LocalDateTime waktuTransaksi = LocalDateTime.now();
  private Random bankOnline = new Random(10);

  public void prosesPembayaranCustomer(String bank)
      throws TransaksiHariLiburException, BankOfflineException, BankBelumTerdaftarException {
    if (waktuTransaksi.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
      throw new TransaksiHariLiburException("Tidak melayani transaksi di hari libur");
    }

    if (bankOnline.nextInt() % 2 == 0) {
      throw new BankOfflineException("Bank sedang offline");
    }

    if (!bankTerdaftar.contains(bank)) {
      throw new BankBelumTerdaftarException("Bank tidak terdaftar");
    }
  }
}
