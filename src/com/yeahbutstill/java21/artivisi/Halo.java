package com.yeahbutstill.java21.artivisi;

import com.yeahbutstill.java21.artivisi.toko.Customer;
import java.time.LocalDateTime;

public class Halo {
  public static void main(String[] args) {
    Customer ctr1 = new Customer();
    ctr1.setNama("Maya");
    ctr1.setEmail("maya@yeahbutstill.com");

    System.out.println("Halo");
    System.out.println("Waktu saat ini " + LocalDateTime.now());
    System.out.println("Nama Customer: " + ctr1.getNama());
    System.out.println("Email Customer: " + ctr1.getEmail());
  }
}
