package com.mazeeko.oop;

/** inheritance parent Manager child VicePresident */
public class VicePresident extends Manager {
  @Override // method override adalah kemampuan mendefisikan ulang method di child class, yang sudah ada di parent class
  // saat kita melakukan proses override tersebut, secara otomatis ketika kita membuat object dari class child
  // method yang di class parent tidak bisa diakses lagi
  // perlu diingat saat melakukan method override semuanya harus sama, yang boleh beda isi dari bodynya
  public void sayHello(String name) {
    System.out.println("Hello " + name + ", My name is " + this.getName() + " As Vice President");
  }
}
