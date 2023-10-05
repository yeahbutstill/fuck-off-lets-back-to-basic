package com.zamannow.oop;

public class VicePresident extends Manager {
  /**
   * Method override adalah kemampuan mendeklarasikan ulang method yang di punyai dari parent class
   * nya. Perlu hati-hati. Saat kita melakukan proses override tersebut, secara automatis ketkia
   * kita membuat object dari class child, maka method yang di class parent nya tidak bisa diakses
   * lagi. Method override semuanya harus sama, yang beda cuman isi body methodnya
   *
   * @param name
   */
  @Override
  void sayHello(String name) {
    System.out.println("Hello " + name + ", My name is VP " + this.name);
  }
}
