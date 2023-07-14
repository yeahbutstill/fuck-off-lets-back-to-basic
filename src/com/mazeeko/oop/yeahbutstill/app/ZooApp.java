package com.mazeeko.oop.yeahbutstill.app;

import com.mazeeko.oop.Flying;
import java.util.ArrayList;
import java.util.Collections;

public class ZooApp {
  public static void main(String[] args) {
    var burungKakaTua = new Flying();
    burungKakaTua.setName("Kaka Tua");
    burungKakaTua.setType("Burung");
    var diamakan = new ArrayList<>();
    diamakan.add("Biji-bijian");
    diamakan.add("Sayuran");
    diamakan.add("Buah");
    burungKakaTua.setActivity("Pagi");
    burungKakaTua.setFood(diamakan);
    burungKakaTua.sayHello(burungKakaTua.getName());
    burungKakaTua.sayGoodBye(burungKakaTua.getName());

    System.out.println(burungKakaTua);
  }
}
