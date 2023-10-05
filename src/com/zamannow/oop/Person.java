package com.zamannow.oop;

public class Person {
  // membuat properties sama seperti membuar variable, namum di tempatkan di block class
  String firstName; // properties adalah data yang bisa kita masukan di dalam Object
  String lastName; // Namun untuk sebelum kita bisa memasukan data di properties,
  // kita harus mendeklarasikan data apa saja yang dimiliki object tersebut di dalam deklarasi classnya

  // properties yang ada di object bisa kita manipulasi. tergantung final atau bukan
  final String country = "Indonesia"; // jika final, berarti kita tidak bisa mengubah data proeperties tersebut


  public String sayHello(String firstName) {
    return "Hi! " + firstName;
  }

  public String sayGoodBye(String firstName) {
    return "Bye, " + firstName + "~";
  }
}
