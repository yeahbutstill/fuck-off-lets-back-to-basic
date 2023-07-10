package com.mazeeko.oop.yeahbutstill.app;

import com.mazeeko.oop.staticfield.Constant;
import com.mazeeko.oop.staticinnerclass.Country;
import com.mazeeko.oop.staticmethod.MathUtil;

public class StaticApp {
  public static void main(String[] args) {
    System.out.println(Constant.APPLICATION);
    System.out.println(Constant.VERSION);
    System.out.println(MathUtil.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    System.out.println("Jumlah processor = " + Constant.PROCESSOR);

    Country.City city = new Country.City();
    city.setName("Depok");
    System.out.println(city.getName());
  }
}
