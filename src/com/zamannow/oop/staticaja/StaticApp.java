package com.zamannow.oop.staticaja;

public class StaticApp {
    public static void main(String[] args) {
        // static properties
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        // static method
        System.out.println(Mathtil.sum(1, 2, 3, 4, 5, 6, 7));

        // static class
        Country.City city = new Country.City();
        city.setName("dpk");
        System.out.println(city.getName());

        System.out.println(Application.PROCESSOR);
    }
}
