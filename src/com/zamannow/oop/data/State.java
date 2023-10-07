package com.zamannow.oop.data;

import java.util.List;

public record State(String name, String capitalCity, List<String> cities) {

  public State {
    // List.copyOf mengembalikan salinan yang tidak dapat dimodifikasi,
    // jadi daftar yang ditetapkan ke `cities` tidak dapat diubah lagi
    cities = List.copyOf(cities);
  }

  public State(String name, String capitalCity) {
    this(name, capitalCity, List.of());
  }

  public State(String name, String capitalCity, String... cities) {
    this(name, capitalCity, List.of(cities));
  }

  public List<String> cities() {
    return List.copyOf(cities);
  }
}
