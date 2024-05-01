package com.tij4awesome.operator.operators;

import com.tij4awesome.operator.operators.Integral;

// Create a class containing a float and use it
// to demonstrate aliasing during method call
class E03Aliasing2 {
  public static void main(String[] args) {
    Integral x = new Integral();
    x.f = 2.0f;
    System.out.println("1: x.f: " + x.f);
    f(x);
    System.out.println("2: x.f: " + x.f);
  }

  static void f(Integral y) {
    y.f = 1.0f;
  }
}
// Latihan ini menekankan bahwa Anda selalu menyebarkan referensi,
// sehingga Anda selalu membuat alias. Meskipun Anda tidak benar-benar
// melihat perubahan yang dilakukan pada kode yang Anda tulis atau metode
// yang Anda panggil, kode atau metode tersebut mungkin
// memanggil metode lain yang mengubah objek.
