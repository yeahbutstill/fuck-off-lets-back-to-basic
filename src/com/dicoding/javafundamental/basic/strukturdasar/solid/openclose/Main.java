package com.dicoding.javafundamental.basic.strukturdasar.solid.openclose;

public class Main {
    public static void main(String[] args) {
        StandardCinema standardCinema = new StandardCinema(100.0);
        Double adminFee = standardCinema.calculateAdminFee();
        System.out.println(adminFee);
        System.out.println("======================");

        PremiumCinema premiumCinema = new PremiumCinema();
        premiumCinema.setPrice(90.000);
        System.out.println(premiumCinema.calculateAdminFee());
        System.out.println("======================");

        Cinema cinema = new DeluxCinema();
        cinema.setPrice(65.000);
        System.out.println(cinema.calculateAdminFee());
        System.out.println("======================");

        StandardCinema standardCinema1 = new StandardCinema();
        standardCinema1.setPrice(55.000);
        System.out.println(standardCinema1.calculateAdminFee());
        System.out.println("======================");

        CoupleCinema coupleCinema = new CoupleCinema();
        coupleCinema.setPrice(62.000);
        System.out.println(coupleCinema.calculateAdminFee());
        System.out.println("======================");

    }
}
